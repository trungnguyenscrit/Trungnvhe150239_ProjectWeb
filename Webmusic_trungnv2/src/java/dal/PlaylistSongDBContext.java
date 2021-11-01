/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Playlist;
import model.Song;

/**
 *
 * @author Trung
 */
public class PlaylistSongDBContext extends DBContext {

    public ArrayList<Playlist> getPlaylistSong() {
        ArrayList<Playlist> playlistsong = new ArrayList<>();
        try {
            String sql = "SELECT [id_playlist]\n"
                    + "      ,[name_playlist]\n"
                    + "      ,[description]\n"
                    + "      ,[id_usercreate]\n"
                    + "  FROM [playlist]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Playlist p = new Playlist();
                p.setId_playlist(rs.getInt("id_playlist"));
                p.setName_playlist(rs.getString("name_playlist"));
                p.setDescription(rs.getString("description"));
                p.setId_usercreate(rs.getInt("id_usercreate"));

                String sql_getSong = "select s.id_song,s.name from playlist_work_song pa full outer join song s\n"
                        + "on pa.id_song = s.id_song\n"
                        + "where pa.id_playlist = ?";
                PreparedStatement stm_getSong = connection.prepareStatement(sql_getSong);
                stm_getSong.setString(1, rs.getString("id_playlist"));
                ResultSet rc = stm_getSong.executeQuery();
                while (rc.next()) {
                    Song si = new Song();
                    si.setId_song(rc.getString("id_song"));
                    si.setName(rc.getString("name"));
                    p.getSongs().add(si);

                }
                playlistsong.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playlistsong;
    }

    public void delete(int id_playlist) {
        try {

            connection.setAutoCommit(false);
            String sql_del_song = "DELETE FROM [dbo].[playlist_work_song]\n"
                    + "      WHERE id_playlist = ?";
            PreparedStatement stm_del_song = connection.prepareStatement(sql_del_song);
            stm_del_song.setInt(1, id_playlist);
            stm_del_song.executeUpdate();

            String sql = "DELETE FROM [dbo].[playlist]\n"
                    + "      WHERE id_playlist = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id_playlist);
            stm.executeUpdate();

            connection.commit();
        } catch (SQLException ex) {
            try {
                Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void insert(Playlist p) {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [playlist]\n"
                    + "           ([name_playlist]\n"
                    + "           ,[description]\n"
                    + "           ,[id_usercreate])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getName_playlist());
            stm.setString(2, p.getDescription());
            stm.setInt(3, p.getId_usercreate());
            System.out.println(p.getId_usercreate());
            System.out.println("da chay den 111");
            stm.executeUpdate();

            //QUERY to get playlist Id
            String sql_get_id = "SELECT @@Identity as id_playlist";
            PreparedStatement stm_get_id = connection.prepareStatement(sql_get_id);
            ResultSet rs = stm_get_id.executeQuery();
            if (rs.next()) {
                p.setId_playlist(rs.getInt("id_playlist"));
            }

            //Insert into playlist_work_song
            for (Song s : p.getSongs()) {
                String sql_insert_song = "INSERT INTO [playlist_work_song]\n"
                        + "           ([id_playlist]\n"
                        + "           ,[id_song])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?)";
                PreparedStatement stm_insert_song = connection.prepareStatement(sql_insert_song);
                stm_insert_song.setInt(1, p.getId_playlist());
                stm_insert_song.setString(2, s.getId_song());
                stm_insert_song.executeUpdate();
            }

            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public Playlist getPlayListSong(int id_playlist) {
        Playlist playlist = new Playlist();
        try {
            String sql = "SELECT [id_playlist]\n"
                    + "      ,[name_playlist]\n"
                    + "      ,[description]\n"
                    + "  FROM [playlist]\n"
                    + "  where id_playlist = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id_playlist);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                playlist.setId_playlist(rs.getInt("id_playlist"));
                playlist.setName_playlist(rs.getString("name_playlist"));
                playlist.setDescription(rs.getString("description"));

                String sql_getSong = "select s.id_song,s.name from playlist_work_song pa full outer join song s\n"
                        + "on pa.id_song = s.id_song\n"
                        + "where pa.id_playlist = ?";
                PreparedStatement stm_getSong = connection.prepareStatement(sql_getSong);
                stm_getSong.setInt(1, id_playlist);
                ResultSet rc = stm_getSong.executeQuery();
                while (rc.next()) {
                    Song si = new Song();
                    si.setId_song(rc.getString("id_song"));
                    si.setName(rc.getString("name"));
                    playlist.getSongs().add(si);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playlist;
    }

    public void updatePlaylistSong(Playlist p) {
        try {
            String sql = "UPDATE [dbo].[playlist]\n"
                    + "   SET [name_playlist] = ?\n"
                    + "      ,[description] = ?\n"
                    + " WHERE id_playlist = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getName_playlist());
            stm.setString(2, p.getDescription());
            stm.setInt(3, p.getId_playlist());
            stm.executeUpdate();

            //remove all song
            String sql_remove_song = "DELETE FROM [dbo].[playlist_work_song]\n"
                    + "      WHERE id_playlist = ?";
            PreparedStatement stm_remove_song = connection.prepareStatement(sql_remove_song);
            stm_remove_song.setInt(1, p.getId_playlist());
            stm_remove_song.executeUpdate();
            
            //insert song for playlist
            for (Song so : p.getSongs()) {
                String sql_insert_song = "INSERT INTO [playlist_work_song]\n"
                        + "           ([id_playlist]\n"
                        + "           ,[id_song])\n"
                        + "     VALUES\n"
                        + "           (?\n"
                        + "           ,?)";
                PreparedStatement stm_insert_song = connection.prepareStatement(sql_insert_song);
                stm_insert_song.setInt(1, p.getId_playlist());
                stm_insert_song.setString(2, so.getId_song());
                stm_insert_song.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

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
import model.Genre;
import model.Song;

/**
 *
 * @author Trung
 */
public class GenreDBContext extends DBContext {

    public ArrayList<Song> getAllGenreSong(String id) {
        ArrayList<Song> playlistsong = new ArrayList<>();
        try {
            String sql = "select s.* from genre p join genre_work_song ps\n"
                    + "on p.id_genre = ps.id_genre join song s \n"
                    + "on ps.id_song = s.id_song\n"
                    + "where p.id_genre = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Song s = new Song(rs.getString("id_song"), rs.getString("name"), rs.getString("poster"), rs.getString("linksong"), rs.getString("description"));
                playlistsong.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlaylistSongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return playlistsong;
    }

    public int getCountGenre() {
        int count = 0;
        try {
            String sql = "select COUNT(id_genre) as result from genre";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                count = rs.getInt("result");
            }

        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public ArrayList<Genre> getGenres() {
        ArrayList<Genre> genres = new ArrayList<>();
        try {
            String sql = "select * from genre";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Genre g = new Genre();
                g.setId_genre(rs.getString("id_genre"));
                g.setName_genre(rs.getString("name_genre"));
                g.setPoster(rs.getString("poster"));
                genres.add(g);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return genres;
    }

    public void insert(Genre g) {

        try {
            String sql = "INSERT INTO [genre]\n"
                    + "           ([id_genre]\n"
                    + "           ,[name_genre],[poster])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, g.getId_genre());
            stm.setString(2, g.getName_genre());
            stm.setString(3, g.getPoster());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Genre getGenre(String id_genre) {
        try {
            String sql = "select * from genre WHERE id_genre like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id_genre);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Genre g = new Genre();
                g.setId_genre(rs.getString("id_genre"));
                g.setName_genre(rs.getString("name_genre"));
                g.setPoster(rs.getString("poster"));
                return g;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void delete(String id_genre) {
        try {
            String sql_del_genre = "DELETE FROM [dbo].[genre]\n"
                    + "      WHERE id_genre like ?";
            PreparedStatement stm_del_genre = connection.prepareStatement(sql_del_genre);
            stm_del_genre.setString(1, id_genre);
            stm_del_genre.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Genre g) {
        try {
            String sql = "UPDATE [genre]\n"
                    + "   SET [name_genre] = ?\n"
                    + "      ,[poster] = ?"
                    + " WHERE id_genre like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, g.getName_genre());
            stm.setString(2, g.getPoster());
            stm.setString(3, g.getId_genre());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

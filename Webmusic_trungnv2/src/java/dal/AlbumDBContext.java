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
import model.Album;
import model.Song;

/**
 *
 * @author Trung
 */
public class AlbumDBContext extends DBContext{
    
    public int getCountAlbum() {
        int count = 0;
        try {
            String sql = "select COUNT(id_album) as result from album";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                count = rs.getInt("result");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public ArrayList<Album> getSongWithAlbums(){
        ArrayList<Album> albumwithsongs = new ArrayList<>();
        try {
            String sql = "select * from album";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Album a = new Album();
                a.setId_album(rs.getString("id_album"));
                a.setName(rs.getString("name"));
                a.setDescription(rs.getString("description"));

                String sql_getAlbum = "select s.id_song,s.name from song_album sa full outer join song s\n" +
                                        "on sa.id_song = s.id_song\n" +
                                        "where sa.id_album like ?";
                PreparedStatement stm_getAlbum = connection.prepareStatement(sql_getAlbum);
                stm_getAlbum.setString(1, rs.getString("id_album"));
                ResultSet rc = stm_getAlbum.executeQuery();
                while (rc.next()) {
                Song si = new Song();
                si.setId_song(rc.getString("id_song"));
                si.setName(rc.getString("name"));
                a.getSongs().add(si);
                
                }
                
                albumwithsongs.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  albumwithsongs;
    }
    public ArrayList<Album> getAlbums(){
        ArrayList<Album> albums = new ArrayList<>();
        try {
            String sql = "select * from album";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Album a = new Album();
                a.setId_album(rs.getString("id_album"));
                a.setName(rs.getString("name"));
                a.setDescription(rs.getString("description"));
                albums.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  albums;
    }
    public void insertsongwithalbum(Album a){
        try {
            String sqla = "INSERT INTO [album]\n" +
                        "           ([id_album]\n" +
                        "           ,[name]\n" +
                        "           ,[description])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?)" ;
            PreparedStatement stm = connection.prepareStatement(sqla);
            stm.setString(1, a.getId_album());
            stm.setString(2, a.getName());
            stm.setString(3, a.getDescription());
            stm.executeUpdate();
            
            //Insert into song_work_album
            for (Song s : a.getSongs()) {
                String sql_insert_song = "INSERT INTO [song_album]\n" +
                                "           ([id_song]\n" +
                                "           ,[id_album])\n" +
                                "     VALUES\n" +
                                "           (?\n" +
                                "           ,?)";
                PreparedStatement stm_insert_song = connection.prepareStatement(sql_insert_song);
                stm_insert_song.setString(1, s.getId_song());
                stm_insert_song.setString(2, a.getId_album());
                stm_insert_song.executeUpdate();
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void insert(Album a){
        
        try {
            String sql = "INSERT INTO [dbo].[album]\n" +
                        "           ([id_album]\n" +
                        "           ,[name]\n" +
                        "           ,[description])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?)" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getId_album());
            stm.setString(2, a.getName());
            stm.setString(3, a.getDescription());
            stm.executeUpdate();
                    } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(String id_album) {
        try {
           String sql_del_album = "DELETE FROM [dbo].[album]\n" +
                                "      WHERE id_album like ?";
            PreparedStatement stm_del_album = connection.prepareStatement(sql_del_album);
            stm_del_album.setString(1, id_album);
            stm_del_album.executeUpdate();
            
       } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    public void deletesongwithalbum(String id_album) {
        try {
            
            String sql_del_song = "DELETE FROM [dbo].[song_album]\n" +
                        "      WHERE id_album like ?";
            PreparedStatement stm_del_song = connection.prepareStatement(sql_del_song);
            stm_del_song.setString(1, id_album);
            stm_del_song.executeUpdate();
            
           String sql_del_album = "DELETE FROM [dbo].[album]\n" +
                                "      WHERE id_album like ?";
            PreparedStatement stm_del_album = connection.prepareStatement(sql_del_album);
            stm_del_album.setString(1, id_album);
            stm_del_album.executeUpdate();
            
       } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
//    chua co select song trong album
    public Album getAlbum(String id_album){
        Album a = new Album();
        try {
            String sql = "select * from album where id_album like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id_album);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                a.setId_album(rs.getString("id_album"));
                a.setName(rs.getString("name"));
                a.setDescription(rs.getString("description"));

                String sql_getAlbum = "select s.id_song,s.name from song_album sa full outer join song s\n" +
                                        "on sa.id_song = s.id_song\n" +
                                        "where sa.id_album like ?";
                PreparedStatement stm_getAlbum = connection.prepareStatement(sql_getAlbum);
                stm_getAlbum.setString(1, id_album);
                ResultSet rc = stm_getAlbum.executeQuery();
                while (rc.next()) {
                Song si = new Song();
                si.setId_song(rc.getString("id_song"));
                si.setName(rc.getString("name"));
                a.getSongs().add(si);
                
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  a;
    }
    
    public void update(Album a) {
        try {
            String sql = "UPDATE [dbo].[album]\n" +
                        "   SET [name] = ?\n" +
                        "      ,[description] = ?\n" +
                        " WHERE [id_album] like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getName());
            stm.setString(2, a.getDescription());
            stm.setString(3, a.getId_album());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatesongwithalbum(Album a) {
        try {
            String sql = "UPDATE [dbo].[album]\n" +
                        "   SET [name] = ?\n" +
                        "      ,[description] = ?\n" +
                        " WHERE [id_album] like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getName());
            stm.setString(2, a.getDescription());
            stm.setString(3, a.getId_album());
            stm.executeUpdate();
            
            //remove all song
            String sql_remove_song = "DELETE FROM [dbo].[song_album]\n" +
                            "      WHERE id_album like ?";
            PreparedStatement stm_remove_song = connection.prepareStatement(sql_remove_song);
            stm_remove_song.setString(1, a.getId_album());
            stm_remove_song.executeUpdate();
            
            //insert song for album
            for (Song so : a.getSongs()) {
                String sql_insert_song = "INSERT INTO [dbo].[song_album]\n" +
                            "           ([id_song]\n" +
                            "           ,[id_album])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?)";
                PreparedStatement stm_insert_song = connection.prepareStatement(sql_insert_song);
                stm_insert_song.setString(1, so.getId_song());
                stm_insert_song.setString(2, a.getId_album());
                stm_insert_song.executeUpdate();
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(AlbumDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

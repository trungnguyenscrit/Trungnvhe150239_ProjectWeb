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
import model.Genre;
import model.Singer;
import model.Song;

/**
 *
 * @author Trung
 */
public class SongDBContext extends DBContext{
    
    public ArrayList<Song> getSongs(){
        ArrayList<Song> songs = new ArrayList<>();
        try {
            String sql = "select * from song";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Song s = new Song();
                s.setId_song(rs.getString("id_song"));
                s.setName(rs.getString("name"));
                s.setPoster(rs.getString("poster"));
                s.setLinksong(rs.getString("linksong"));
                s.setDescription(rs.getString("description"));

                String sql_getSinger = "select s.id_singer,s.name from song_work_singer ss full outer join singer s\n" +
                            "on ss.id_singer = s.id_singer\n" +
                            "where ss.id_song like ?";
                PreparedStatement stm_getSinger = connection.prepareStatement(sql_getSinger);
                stm_getSinger.setString(1, rs.getString("id_song"));
                ResultSet rc = stm_getSinger.executeQuery();
                while (rc.next()) {
                Singer si = new Singer();
                si.setId_singer(rc.getString("id_singer"));
                si.setName(rc.getString("name"));
                s.getSingers().add(si);
                
                }
                
                
                String sql_getGenre = "select g.id_genre,g.name_genre from genre_work_song gs full outer join genre g\n" +
                                "on gs.id_genre = g.id_genre\n" +
                                "where gs.id_song like ?";
                PreparedStatement stm_getGenre = connection.prepareStatement(sql_getGenre);
                stm_getGenre.setString(1, rs.getString("id_song"));
                ResultSet rx = stm_getGenre.executeQuery();
                while (rx.next()) {
                Genre g = new Genre();
                g.setId_genre(rx.getString("id_genre"));
                g.setName_genre(rx.getString("name_genre"));
                s.getGenres().add(g);
                }
                
                songs.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  songs;
    }
    
    public void insert(Song s){
        try {
            String sql = "INSERT INTO [dbo].[song]\n" +
                        "           ([id_song]\n" +
                        "           ,[name]\n" +
                        "           ,[poster]\n" +
                        "           ,[linksong]\n" +
                        "           ,[description])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?)" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, s.getId_song());
            stm.setString(2, s.getName());
            stm.setString(3, s.getPoster());
            stm.setString(4, s.getLinksong());
            stm.setString(5, s.getDescription());
            stm.executeUpdate();
            
            //Insert into song_work_singer
            for (Singer si : s.getSingers()) {
                String sql_insert_singer = "INSERT INTO [dbo].[song_work_singer]\n" +
                                            "           ([id_song]\n" +
                                            "           ,[id_singer])\n" +
                                            "     VALUES\n" +
                                            "           (?\n" +
                                            "           ,?)";
                PreparedStatement stm_insert_singer = connection.prepareStatement(sql_insert_singer);
                stm_insert_singer.setString(1, s.getId_song());
                stm_insert_singer.setString(2, si.getId_singer());
                stm_insert_singer.executeUpdate();
            }
            
            //Insert into song_work_genre
            for (Genre ge : s.getGenres()) {
                    String sql_insert_genre = "INSERT INTO [dbo].[genre_work_song]\n" +
                                    "           ([id_song]\n" +
                                    "           ,[id_genre])\n" +
                                    "     VALUES\n" +
                                    "           (?\n" +
                                    "           ,?)";
                PreparedStatement stm_insert_genre = connection.prepareStatement(sql_insert_genre);
                stm_insert_genre.setString(1, s.getId_song());
                stm_insert_genre.setString(2, ge.getId_genre());
                stm_insert_genre.executeUpdate();
            }
            
                    } catch (SQLException ex) {
            Logger.getLogger(SongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(String id_song) {
        try {
           
            
            String sql_del_genre = "DELETE FROM [dbo].[genre_work_song]\n" +
                            "      WHERE id_song like ?";
            PreparedStatement stm_del_genres = connection.prepareStatement(sql_del_genre);
            stm_del_genres.setString(1, id_song);
            stm_del_genres.executeUpdate();
            
            String sql_del_singer = "DELETE FROM [dbo].[song_work_singer]\n" +
                        "      WHERE id_song like ?";
            PreparedStatement stm_del_singers = connection.prepareStatement(sql_del_singer);
            stm_del_singers.setString(1, id_song);
            stm_del_singers.executeUpdate();
            
           String sql = "DELETE FROM [dbo].[song]\n" +
                            "      WHERE id_song like ?";
           PreparedStatement stm = connection.prepareStatement(sql);
           stm.setString(1, id_song);
           stm.executeUpdate();
            
                    } catch (SQLException ex) {
            Logger.getLogger(SongDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Song getSong(String id_song) {
        try {
            String sql = "select * from song WHERE id_song like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id_song);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Song s = new Song();
                s.setId_song(rs.getString("id_song"));
                s.setName(rs.getString("name"));
                s.setPoster(rs.getString("poster"));
                s.setLinksong(rs.getString("linksong"));
                s.setDescription(rs.getString("description"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void update(Song s) {
        try {
                String sql = "UPDATE [dbo].[song]\n" +
                        "   SET [name] = ?\n" +
                        "      ,[poster] = ?\n" +
                        "      ,[linksong] = ?\n" +
                        "      ,[description] = ?\n" +
                        " WHERE id_song like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, s.getName());
            stm.setString(2, s.getPoster());
            stm.setString(3, s.getLinksong());
            stm.setString(4, s.getDescription());
            stm.setString(5, s.getId_song());
            stm.executeUpdate();
            
            //remove all genre
            String sql_remove_genre = "DELETE FROM [dbo].[genre_work_song]\n" +
                                    "      WHERE id_song like ?";
            PreparedStatement stm_remove_genre = connection.prepareStatement(sql_remove_genre);
            stm_remove_genre.setString(1, s.getId_song());
            stm_remove_genre.executeUpdate();
            
            //remove all singer
            String sql_remove_singer = "DELETE FROM [dbo].[song_work_singer]\n" +
                                        "      WHERE id_song like ?";
            PreparedStatement stm_remove_singer = connection.prepareStatement(sql_remove_singer);
            stm_remove_singer.setString(1, s.getId_song());
            stm_remove_singer.executeUpdate();
            
            //insert genre for song
            for (Genre gen : s.getGenres()) {
                String sql_insert_genre = "INSERT INTO [dbo].[genre_work_song]\n" +
                            "           ([id_song]\n" +
                            "           ,[id_genre])\n" +
                            "     VALUES\n" +
                            "           (?\n" +
                            "           ,?)";
                PreparedStatement stm_insert_genre = connection.prepareStatement(sql_insert_genre);
                stm_insert_genre.setString(1, s.getId_song());
                stm_insert_genre.setString(2, gen.getId_genre());
                stm_insert_genre.executeUpdate();
            }
            
            
            //insert singer for song
            for (Singer si : s.getSingers()) {
                String sql_insert_singer = "INSERT INTO [dbo].[song_work_singer]\n" +
                                            "           ([id_song]\n" +
                                            "           ,[id_singer])\n" +
                                            "     VALUES\n" +
                                            "           (?\n" +
                                            "           ,?)";
                PreparedStatement stm_insert_singer = connection.prepareStatement(sql_insert_singer);
                stm_insert_singer.setString(1, s.getId_song());
                stm_insert_singer.setString(2, si.getId_singer());
                stm_insert_singer.executeUpdate();
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

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
import model.Singer;

/**
 *
 * @author Trung
 */
public class SingerDBContext extends DBContext{
    
    public int getCountSinger() {
        int count = 0;
        try {
            String sql = "select COUNT(id_singer) as result from singer";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                count = rs.getInt("result");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public ArrayList<Singer> getSingers(){
        ArrayList<Singer> singers = new ArrayList<>();
        try {
            String sql = "select * from singer";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Singer si = new Singer();
                si.setId_singer(rs.getString("id_singer"));
                si.setName(rs.getString("name"));
                si.setPoster(rs.getString("poster"));        
                si.setDescription(rs.getString("description"));
                singers.add(si);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  singers;
    }
    public void insert(Singer si){
        
        try {
            String sql = "INSERT INTO [singer]\n" +
                "           ([id_singer]\n" +
                "           ,[name]\n" +
                "           ,[poster]\n" +
                "           ,[description])\n" +
                "     VALUES\n" +
                "           (?\n" +
                "           ,?\n" +
                "           ,?\n" +
                "           ,?)" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, si.getId_singer());
            stm.setString(2, si.getName());
            stm.setString(3, si.getPoster());
            stm.setString(4, si.getDescription());
            stm.executeUpdate();
                    } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(String id_singer) {
        try {
           String sql_del_singers = "DELETE FROM [dbo].[singer]\n" +
"      WHERE id_singer like ?";
            PreparedStatement stm_del_singers = connection.prepareStatement(sql_del_singers);
            stm_del_singers.setString(1, id_singer);
            stm_del_singers.executeUpdate();
            
       } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void update(Singer si) {
        try {
            String sql = "UPDATE [singer]\n" +
                "   SET [name] = ?\n" +
                "      ,[poster] = ?\n" +
                "      ,[description] = ?\n" +
                " WHERE id_singer like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, si.getName());
            stm.setString(2, si.getPoster());
            stm.setString(3, si.getDescription());
            stm.setString(4, si.getId_singer());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Singer getSinger(String id_singer) {
        try {
            String sql = "select * from singer WHERE id_singer like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id_singer);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Singer si = new Singer();
                si.setId_singer(rs.getString("id_singer"));
                si.setName(rs.getString("name"));
                si.setPoster(rs.getString("poster"));        
                si.setDescription(rs.getString("description"));
                return si;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

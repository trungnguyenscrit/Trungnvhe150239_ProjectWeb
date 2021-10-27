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
import model.User;

/**
 *
 * @author Trung
 */
public class UserDBContext extends DBContext{
    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        try {
            String sql = "select * from [User]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                User u = new User();
                u.setUser_id(rs.getString("user_id"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getInt("role"));
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  users;
    }
    public void insert(User u){
        
        try {
            String sql = "INSERT INTO [dbo].[User]\n" +
                        "           ([user_id]\n" +
                        "           ,[email]\n" +
                        "           ,[password]\n" +
                        "           ,[role])\n" +
                        "     VALUES\n" +
                        "           (?\n" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?)" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, u.getUser_id());
            stm.setString(2, u.getEmail());
            stm.setString(3, u.getPassword());
            stm.setInt(4, u.getRole());
            stm.executeUpdate();
                    } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public User getUser(String user_id) {
        try {
            String sql = "SELECT [user_id]\n" +
                        "      ,[email]\n" +
                        "      ,[password]\n" +
                        "      ,[role]\n" +
                        "  FROM [dbo].[User]\n" +
                        "  Where user_id like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user_id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                User u = new User();
                u.setUser_id(rs.getString("user_id"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(Integer.parseInt(rs.getString("role")));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void delete(String user_id) {
        try {
           String sql_del_user = "DELETE FROM [dbo].[User]\n" +
                            "      WHERE user_id like ?";
            PreparedStatement stm_del_user = connection.prepareStatement(sql_del_user);
            stm_del_user.setString(1, user_id);
            stm_del_user.executeUpdate();
            
       } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void update(User u) {
        try {
            String sql = "UPDATE [dbo].[User]\n" +
                            "   SET [email] = ?\n" +
                            "      ,[password] = ?\n" +
                            "      ,[role] = ?\n" +
                            " WHERE user_id like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, u.getEmail());
            stm.setString(2, u.getPassword());
            stm.setInt(3, u.getRole());
            stm.setString(4, u.getUser_id());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

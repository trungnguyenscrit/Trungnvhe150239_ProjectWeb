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
public class UserDBContext extends DBContext {

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try {
            String sql = "SELECT [user_id]\n"
                    + "      ,[email]\n"
                    + "      ,[password]\n"
                    + "      ,[name]\n"
                    + "      ,[role]\n"
                    + "  FROM [User]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUser_id(rs.getInt("user_id"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setName(rs.getString("name"));
                u.setRole(rs.getString("role"));
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public void insert(User u) {

        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [dbo].[User]\n"
                    + "           ([email]\n"
                    + "           ,[password]\n"
                    + "           ,[name]\n"
                    + "           ,[role])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, u.getEmail());
            stm.setString(2, u.getPassword());
            stm.setString(3, u.getName());
            stm.setString(4, u.getRole());
            stm.executeUpdate();
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public User getUser(String user_id) {
        try {
            String sql = "SELECT [user_id]\n"
                    + "      ,[email]\n"
                    + "      ,[password]\n"
                    + "      ,[role]\n"
                    + "  FROM [dbo].[User]\n"
                    + "  Where user_id like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user_id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUser_id(rs.getInt("user_id"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void delete(int user_id) {
        try {
            connection.setAutoCommit(false);
            String sql_del_user = "DELETE FROM [dbo].[User]\n"
                    + "      WHERE user_id = ?";
            PreparedStatement stm_del_user = connection.prepareStatement(sql_del_user);
            stm_del_user.setInt(1, user_id);
            stm_del_user.executeUpdate();

            connection.commit();
        } catch (SQLException ex) {
            try {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void update(User u) {
        try {
            String sql = "UPDATE [dbo].[User]\n"
                    + "   SET [email] = ?\n"
                    + "      ,[password] = ?\n"
                    + "      ,[role] = ?\n"
                    + " WHERE user_id like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, u.getEmail());
            stm.setString(2, u.getPassword());
            stm.setString(3, u.getRole());
            stm.setInt(4, u.getUser_id());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GenreDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User checkUser(String email, String pass) {
        User u = new User();
        try {
            String sql = "select * from [User] where email=? and password=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, pass);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                u.setName(rs.getString("name"));
                u.setUser_id(rs.getInt("user_id"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public User checkMail(String email) {
        User u = new User();
        try {
            String sql = "select * from [User] where email=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                u.setName(rs.getString("name"));
                u.setUser_id(rs.getInt("user_id"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void Signup(String name, String email, String pass) {
        try {
            String sql = "INSERT INTO [User]\n"
                    + "           ([email]\n"
                    + "           ,[password]\n"
                    + "           ,[name]\n"
                    + "           ,[role])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, pass);
            stm.setString(3, name);
            stm.setString(4, "False");
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SingerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

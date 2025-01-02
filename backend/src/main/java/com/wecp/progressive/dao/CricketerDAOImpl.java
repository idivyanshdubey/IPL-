package com.wecp.progressive.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.config.DatabaseConnectionManager;
 
public class CricketerDAOImpl implements CricketerDAO {
 
 
    @Override
    public int addCricketer(Cricketer cricketer) throws SQLException{
 
        Connection conn = null;
        PreparedStatement statement = null;
        int generatedID = -1;
 
        try{
            conn = DatabaseConnectionManager.getConnection();
            String sql = "INSERT INTO cricketer(team_id, cricketer_name, age, nationality, experience, role, total_runs,total_wickets) VALUES (?,?,?,?,?,?,?,?)";
            statement = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, cricketer.getTeamId());
            statement.setString(2, cricketer.getCricketerName());
            statement.setInt(3, cricketer.getAge());
            statement.setString(4,cricketer.getNationality());
            statement.setInt(5, cricketer.getExperience());
            statement.setString(6, cricketer.getRole());
            statement.setInt(7, cricketer.getTotalRuns());
            statement.setInt(8, cricketer.getTotalWickets());
            statement.executeUpdate();
 
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                generatedID = rs.getInt(1);
                cricketer.setCricketerId(generatedID);
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw e;
        }finally{
            if(statement != null){
                statement.close();
            }
        }
        return generatedID;
    }
 
    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException{
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
 
        try{
            conn = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM cricketer WHERE cricketer_id = ?";
            statement = conn.prepareStatement(sql);
            statement.setInt(1, cricketerId);
            rs = statement.executeQuery();
 
            if(rs.next()){
                return new Cricketer(rs.getInt("cricketer_Id"),
                                    rs.getInt("team_id"),
                                    rs.getString("cricketer_name"),
                                    rs.getInt("age"),
                                    rs.getString("nationality"),
                                    rs.getInt("experience"),
                                    rs.getString("role"),
                                    rs.getInt("total_runs"),
                                    rs.getInt("total_wickets"));
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw e;
        }finally{
            if(statement != null){
                statement.close();
            }
        }
        return null;
    }
 
    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {
        Connection conn = null;
        PreparedStatement statement = null;
   
 
        try{
            conn = DatabaseConnectionManager.getConnection();
            String sql = "UPDATE cricketer SET team_id = ? , cricketer_name = ? , age =? , nationality=?, experience = ?, role=?, total_runs=? ,total_wickets = ? WHERE cricketer_id = ?";
            statement = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, cricketer.getTeamId());
            statement.setString(2, cricketer.getCricketerName());
            statement.setInt(3, cricketer.getAge());
            statement.setString(4,cricketer.getNationality());
            statement.setInt(5, cricketer.getExperience());
            statement.setString(6, cricketer.getRole());
            statement.setInt(7, cricketer.getTotalRuns());
            statement.setInt(8, cricketer.getTotalWickets());
            statement.setInt(9, cricketer.getCricketerId());
            statement.executeUpdate();
       
        }catch(SQLException e){
            e.printStackTrace();
            throw e;
        }finally{
            if(statement != null)
                statement.close();
        }
    }
 
    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
 
        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "DELETE FROM cricketer WHERE cricketer_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, cricketerId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
 
   @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        List<Cricketer> cricketers = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
 
        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM cricketer";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
 
            while (resultSet.next()) {
                int cricketerId = resultSet.getInt("cricketer_id");
                int teamId = resultSet.getInt("team_id");
                String cricketerName = resultSet.getString("cricketer_name");
                int age = resultSet.getInt("age");
                String nationality = resultSet.getString("nationality");
                int experience = resultSet.getInt("experience");
                String role = resultSet.getString("role");
                int totalRuns = resultSet.getInt("total_runs");
                int totalWickets = resultSet.getInt("total_wickets");
                cricketers.add(new Cricketer(cricketerId, teamId, cricketerName, age, nationality, experience, role, totalRuns, totalWickets));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return cricketers;
    }
 
 
 
}
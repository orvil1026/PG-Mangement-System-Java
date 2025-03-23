package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.PG.Helper.Helper;
import com.PG.Model.Room;

public class RoomDAO {
    
    public int insertRoom(Room room) throws ClassNotFoundException, SQLException {
        int output = 0;
        String sql = "INSERT INTO Room (r_no, capacity, occupied_count) VALUES (?, ?, ?)";
        
        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        
        if (room.isSpecifiedR_no()) {
            preparedStatement.setInt(1, room.getR_no());
        } else {
            preparedStatement.setNull(1, java.sql.Types.INTEGER);
        }
        
        if (room.isSpecifiedCapacity()) {
            preparedStatement.setInt(2, room.getCapacity());
        } else {
            preparedStatement.setNull(2, java.sql.Types.INTEGER);
        }
        
        if (room.isSpecifiedOccupied_count()) {
            preparedStatement.setInt(3, room.getOccupied_count());
        } else {
            preparedStatement.setNull(3, java.sql.Types.INTEGER);
        }
        
        output = preparedStatement.executeUpdate();
        return output;
    }
    
    public Room getRoomById(int r_no) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Room WHERE r_no = ?";
        Room room = new Room(r_no, 0, 0);
        
        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        preparedStatement.setInt(1, r_no);
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            room.setCapacity(resultSet.getInt("capacity"));
            room.setOccupied_count(resultSet.getInt("occupied_count"));
        }
        
        return room;
    }
    
    public ArrayList<Room> getAllRooms() throws ClassNotFoundException, SQLException {
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "SELECT * FROM Room";
        
        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            Room room = new Room(
                resultSet.getInt("r_no"),
                resultSet.getInt("capacity"),
                resultSet.getInt("occupied_count")
            );
            rooms.add(room);
        }
        
        return rooms;
    }
    
    public int deleteRoomById(int r_no) throws ClassNotFoundException, SQLException {
        int output = 0;
        String sql = "DELETE FROM Room WHERE r_no = ?";
        
        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        preparedStatement.setInt(1, r_no);
        
        output = preparedStatement.executeUpdate();
        return output;
    }
}

package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.PG.Helper.Helper;
import com.PG.Model.Tenant;
import java.time.LocalDate;

public class TenantDAO {

    public int insertTenant(Tenant tenant) throws ClassNotFoundException, SQLException {
        int output = 0;
        String sql = "INSERT INTO Tenant (nm, ph_no, monthly_rent, room_no, is_active, join_dt, left_dt) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);

        preparedStatement.setString(1, tenant.getNm());
        preparedStatement.setString(2, tenant.getPhNo());

        if (tenant.isSpecifiedMonthlyRent()) {
            preparedStatement.setInt(3, tenant.getMonthly_rent());
        } else {
            preparedStatement.setNull(3, java.sql.Types.INTEGER);
        }

        if (tenant.isSpecifiedRoomNo()) {
            preparedStatement.setInt(4, tenant.getRoom_no());
        } else {
            preparedStatement.setNull(4, java.sql.Types.INTEGER);
        }

        preparedStatement.setBoolean(5, tenant.is_active());

        if (tenant.isSpecifiedJoinDt()) {
            preparedStatement.setObject(6, tenant.getJoin_dt());
        } else {
            preparedStatement.setNull(6, java.sql.Types.DATE);
        }

        if (tenant.isSpecifiedLeftDt()) {
            preparedStatement.setObject(7, tenant.getLeft_dt());
        } else {
            preparedStatement.setNull(7, java.sql.Types.DATE);
        }

        output = preparedStatement.executeUpdate();
        return output;
    }

    public Tenant getTenantById(int t_id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Tenant WHERE t_id = ?";
        Tenant tenant = null;

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        preparedStatement.setInt(1, t_id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            tenant = new Tenant(
                resultSet.getInt("t_id"),
                resultSet.getString("join_dt"),
                resultSet.getInt("monthly_rent"),
                resultSet.getBoolean("is_active"),
                resultSet.getString("left_dt"),
                resultSet.getInt("room_no"),
                resultSet.getString("nm"),
                resultSet.getString("ph_no")
            );
        }

        return tenant;
    }

    public ArrayList<Tenant> getAllTenants() throws ClassNotFoundException, SQLException {
        ArrayList<Tenant> tenantList = new ArrayList<>();
        String sql = "SELECT * FROM Tenant";

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Tenant tenant = new Tenant(
                resultSet.getInt("t_id"),
                resultSet.getString("join_dt"),
                resultSet.getInt("monthly_rent"),
                resultSet.getBoolean("is_active"),
                resultSet.getString("left_dt"),
                resultSet.getInt("room_no"),
                resultSet.getString("nm"),
                resultSet.getString("ph_no")
            );
            tenantList.add(tenant);
        }

        return tenantList;
    }

    public int deleteTenantById(int t_id) throws ClassNotFoundException, SQLException {
        int output = 0;
        String sql = "DELETE FROM Tenant WHERE t_id = ?";

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        preparedStatement.setInt(1, t_id);

        output = preparedStatement.executeUpdate();
        return output;
    }
}
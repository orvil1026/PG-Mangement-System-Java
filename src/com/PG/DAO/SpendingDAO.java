package com.PG.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.PG.Helper.Helper;
import com.PG.Model.Spending;


public class SpendingDAO {

    public int insertSpending(Spending spending) throws ClassNotFoundException, SQLException {
        int output = 0;
        String sql = "INSERT INTO Spending (amount, quantity, category, descrptn, e_id, trnsc_dt) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);

        if (spending.isSpecifiedAmount()) {
            preparedStatement.setInt(1, spending.getAmount());
        } else {
            preparedStatement.setNull(1, java.sql.Types.INTEGER);
        }

        if (spending.isSpecifiedQuantity()) {
            preparedStatement.setInt(2, spending.getQuantity());
        } else {
            preparedStatement.setNull(2, java.sql.Types.INTEGER);
        }

        if (spending.isSpecifiedCategory()) {
            preparedStatement.setString(3, spending.getCategory());
        } else {
            preparedStatement.setNull(3, java.sql.Types.VARCHAR);
        }

        if (spending.isSpecifiedDesc()) {
            preparedStatement.setString(4, spending.getDesc());
        } else {
            preparedStatement.setNull(4, java.sql.Types.VARCHAR);
        }

        if (spending.isSpecifiedE_id()) {
            preparedStatement.setInt(5, spending.getE_id());
        } else {
            preparedStatement.setNull(5, java.sql.Types.INTEGER);
        }

        if (spending.isSpecifiedTrnsc_dt()) {
            preparedStatement.setObject(6, spending.getTrnsc_dt());
        } else {
            preparedStatement.setNull(6, java.sql.Types.DATE);
        }

        output = preparedStatement.executeUpdate();
        return output;
    }

    public Spending getSpendingById(int s_id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM Spending WHERE s_id = ?";
        Spending spending = null;

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        preparedStatement.setInt(1, s_id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
             spending = new Spending(
                resultSet.getString("category"),
                resultSet.getString("descrptn"),
                resultSet.getInt("amount"),
                resultSet.getInt("e_id"),
                resultSet.getInt("s_id"),
                resultSet.getInt("quantity"),
                resultSet.getString("trnsc_dt")
            );
        }

        return spending;
    }

    public ArrayList<Spending> getAllSpending() throws ClassNotFoundException, SQLException {
        ArrayList<Spending> spendingList = new ArrayList<>();
        String sql = "SELECT * FROM Spending";

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Spending spending = new Spending(
                resultSet.getString("category"),
                resultSet.getString("descrptn"),
                resultSet.getInt("amount"),
                resultSet.getInt("e_id"),
                resultSet.getInt("s_id"),
                resultSet.getInt("quantity"),
                resultSet.getString("trnsc_dt")
            );
            spendingList.add(spending);
        }

        return spendingList;
    }

    public int deleteSpendingById(int s_id) throws ClassNotFoundException, SQLException {
        int output = 0;
        String sql = "DELETE FROM Spending WHERE s_id = ?";

        PreparedStatement preparedStatement = Helper.getPreparedStatement(sql);
        preparedStatement.setInt(1, s_id);

        output = preparedStatement.executeUpdate();
        return output;
    }
}
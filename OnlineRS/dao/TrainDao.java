/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineRS.dao;

import OnlineRS.dbutil.DBConnection;
import OnlineRS.pojo.Trainpojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TrainDao {
    public static boolean addTrain(Trainpojo tr) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement pr = conn.prepareStatement("insert into train_details values(?,?,?,?,?)");
        pr.setInt(1, tr.getTrno());
        pr.setString(2, tr.getTrainname());
        pr.setString(3, tr.getStartplace());
        pr.setString(4, tr.getDestination());
        pr.setDouble(5, tr.getPrice());
        return pr.executeUpdate() == 1;
    }
    public static Trainpojo getTrainDetailsBytrainNo(Trainpojo pr) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from train_details where tno = ?");
        ps.setInt(1, pr.getTrno());
        ResultSet rs = ps.executeQuery();
        rs.next();
        Trainpojo details = new Trainpojo();
        details.setTrno(rs.getInt(1));
        details.setTrainname(rs.getString(2));
        details.setStartplace(rs.getString(3));
        details.setDestination(rs.getString(4));
        details.setPrice(rs.getDouble(5));
        return details;
    }
    public static List<Integer> getTrainIds() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select tno from train_details");
        ArrayList<Integer> listOftainNo = new ArrayList<>();
        while (rs.next()) {
           listOftainNo.add(rs.getInt(1));
            
        }
        return listOftainNo;
        
    }
     public static Trainpojo getTrainDetailsByTrainNo(int pr) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from train_details where tno = ?");
        ps.setInt(1,pr);
        ResultSet rs = ps.executeQuery();
        rs.next();
        Trainpojo details = new Trainpojo();
        details.setTrno(rs.getInt(1));
        details.setTrainname(rs.getString(2));
        details.setStartplace(rs.getString(3));
        details.setDestination(rs.getString(4));
        details.setPrice(rs.getDouble(5));
        return details;
    } 
}

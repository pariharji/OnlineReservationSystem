/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineRS.dao;

import OnlineRS.dbutil.DBConnection;
import OnlineRS.pojo.Bookingpojo;
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
public class BookingDao {
     public static List<String> loadboarding() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select startplace from train_details");
        ArrayList<String> list = new ArrayList<>();
        while (rs.next()) {
            list.add(rs.getString(1));
        }
        return list;
    }
      public static List<String> loadDestination() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select destination from train_details");
        ArrayList<String> list = new ArrayList<>();
        while (rs.next()) {
            list.add(rs.getString(1));
        }
        return list;
    }
        public static boolean addBooking(Bookingpojo bk) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, bk.getName());
            System.out.println(bk.getName());
        ps.setInt(2, bk.getAge());
            System.out.println(bk.getAge());
        ps.setString(3, bk.getGender());
            System.out.println(bk.getGender());
            
        ps.setString(4, bk.getBoording());
            System.out.println(bk.getBoording());
        ps.setString(5, bk.getDestination());
            System.out.println(bk.getDestination());
        ps.setString(6, bk.getTrainname());
            System.out.println(bk.getTrainNo());
        ps.setDate(7, bk.getDate());
            System.out.println(bk.getDate());
        ps.setInt(8, bk.getTrainNo());
            System.out.println(bk.getTrainNo());
        ps.setDouble(9, bk.getPrice());
            System.out.println(bk.getPrice());
        ps.setString(10, bk.getPnr());
            System.out.println(bk.getPnr());
        return ps.executeUpdate() == 1;
    }
          public static Bookingpojo getTicketDetails(String pnr) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from booking where pnr_no =?");
        ps.setString(1, pnr);
        ResultSet rs = ps.executeQuery();
        rs.next();
        Bookingpojo bp = new Bookingpojo();
        bp.setName(rs.getString("name"));
        bp.setAge(rs.getInt("age"));
        bp.setBoording(rs.getString("booking_station"));
        bp.setDestination(rs.getString("destination"));
        bp.setGender(rs.getString("gender"));
        bp.setPrice(rs.getDouble("price"));
        bp.setTrainNo(rs.getInt("train_no"));
        bp.setTrainname(rs.getString("train_name"));
        bp.setDate(rs.getDate("booking_d"));
        return bp;
    }
    public static boolean deleteTicket(String pnr) throws SQLException{
      Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement("Delete booking where pnr_no = ?");
       ps.setString(1, pnr);
       int result = ps.executeUpdate();
        return result == 1; 
  }
     public static String generatePNR() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(pnr_no) from booking");
        rs.next();
        int pn1 = 67573;
        int pn2 = 10000;
//         String pnr_no = pn1 + String.valueOf(pn2);

        String pnr_no = pn1 + "" + pn2;

        String no = rs.getString(1);
//        System.out.println("pnr: " + no);
        if (no != null) {
            pn2 = Integer.parseInt(no.substring(no.length() - 5, no.length()));
            pn1 = Integer.parseInt(no.substring(0, 5));
            pn2 += 1;
            pn1 += pn2 / 100000;
            pn2 %= 100000;
            String pn2Str = pn2 + "";
            String zero = "";
            for (int i = pn2Str.length(); i < 5; i++) zero += "0";
            
            return (pn1 + zero + String.valueOf(pn2));

        }
        return pnr_no;
    }
}

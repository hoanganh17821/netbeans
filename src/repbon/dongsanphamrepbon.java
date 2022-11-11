/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.dongsanpham;

/**
 *
 * @author Administrator
 */
public class dongsanphamrepbon {

//    ArrayList<dongsanpham> listdongsanpham = new ArrayList<>();
    public List<dongsanpham> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[DongSP]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<dongsanpham> listdongsanpham = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dongsanpham dsp = new dongsanpham(rs.getString(1), rs.getString(2), rs.getString(3));
                listdongsanpham.add(dsp);
            }
            return listdongsanpham;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public dongsanpham getone(String id) {
        String query = "Select * from DongSP where Id=?";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dongsanpham dsp = new dongsanpham(rs.getString(1), rs.getString(2), rs.getString(3));
                return dsp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//        public DongSP getOne(String id){
//        String query ="select * from DongSP where id =?";
//        try {
//            
//            Connection con = SQLServerConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setObject(1, id);
//            ResultSet rs = ps.executeQuery();
//            
//            while(rs.next()){
//                DongSP dsp = new DongSP(rs.getString(1),rs.getString(2),rs.getString(3));
//                return dsp;
//                
//            }
//            
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }
    public boolean add(dongsanpham dxp) {
        String query = "INSERT INTO [dbo].[DongSP]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, dxp.getMaDsp());
            ps.setObject(2, dxp.getTendongsanpham());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(dongsanpham dxp, String ma) {
        String query = "UPDATE [dbo].[DongSP]\n"
                + "   SET [Ma] =?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, dxp.getMaDsp());
            ps.setObject(2, dxp.getTendongsanpham());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[DongSP]\n"
                + "      WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            check=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new dongsanphamrepbon().getall().forEach(s -> System.out.println(s.toString()));
        // System.out.println(new dongsanphamrepbon().add(new dongsanpham("Sp01", "Iphone14 pro")));
   //     System.out.println(new dongsanphamrepbon().update(new dongsanpham("Sp01", "Iphone14 pro"), "576AF74A-4865-4E21-9879-42275724BA0D"));
        System.out.println( new dongsanphamrepbon().delete(""));
    }
}

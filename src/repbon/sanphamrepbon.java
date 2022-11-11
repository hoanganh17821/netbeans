/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.ArrayList;
import model.sanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.dongsanpham;

/**
 *
 * @author Administrator
 */
public class sanphamrepbon {

//    List<sanpham> listsanpham = new ArrayList<>();

    public List<sanpham> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[SanPham]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
      List<sanpham> listsanpham =new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sanpham sp = new sanpham(rs.getString(1), rs.getString(2), rs.getString(3));
                listsanpham.add(sp);
            }
            return listsanpham;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//        public List<xemay> getall() {
//        String query = "SELECT [Id]\n"
//                + "      ,[Ten]\n"
//                + "      ,[GiaNhap]\n"
//                + "      ,[TrangThai]\n"
//                + "      ,[SoLuong]\n"
//                + "  FROM [dbo].[XeMay]";
//        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
//            List<xemay> listall = new ArrayList<>();
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                listall.add(new xemay(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5)));
//            }
//            return listall;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public sanpham getone(String id) {
        String query = "Select * from SanPham where Id=?";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sanpham sp = new sanpham(rs.getString(1), rs.getString(2), rs.getString(3));
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(sanpham sp) {
        String query = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sp.getMasp());
            ps.setObject(2, sp.getTensanpham());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(sanpham sp, String ma) {
        String query = "UPDATE [dbo].[SanPham]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sp.getMasp());
            ps.setObject(2, sp.getTensanpham());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String sp) {
        String query = "DELETE FROM [dbo].[SanPham]\n"
                + "      WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sp);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    public static void main(String[] args) {
        new sanphamrepbon().getall().forEach(s->System.out.println(s.toString()));
        System.out.println(new sanphamrepbon().add(new sanpham("Masp01", "Iphone6")));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.ArrayList;
import model.sanphamchitiet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class sanphamchitietrepbon {

//    ArrayList<sanphamchitiet> listspct = new ArrayList<>();

    public List<sanphamchitiet> getall() {
        String query = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ten, dbo.NSX.Ten AS Expr1, dbo.MauSac.Ten AS Expr2, dbo.DongSP.Ten AS Expr3, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, \n"
                + "                  dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
//String query="Select * from ChiTietSP";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
          List<sanphamchitiet> listspct= new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sanphamchitiet spct = new sanphamchitiet(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getFloat(10));
                listspct.add(spct);
            }
            return listspct;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(sanphamchitiet spct, String id) {
        String query = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [IdSP] = ?\n"
                + "      ,[IdNsx] = ?\n"
                + "      ,[IdMauSac] = ?\n"
                + "      ,[IdDongSP] = ?\n"
                + "      ,[NamBH] = ?\n"
                + "      ,[MoTa] = ?\n"
                + "      ,[SoLuongTon] = ?\n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + " WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, spct.getIdSP());
            ps.setObject(2, spct.getIdNSX());
            ps.setObject(3, spct.getIdMauSac());
            ps.setObject(4, spct.getIdDongSP());
            ps.setObject(5, spct.getNamBH());
            ps.setObject(6, spct.getMoTa());
            ps.setObject(7, spct.getSoLuongTon());
            ps.setObject(8, spct.getGiaNhap());
            ps.setObject(9, spct.getGiaBan());
            ps.setObject(10, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean add(sanphamchitiet spct) {

        String query = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "           ([IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, spct.getIdSP());
            ps.setObject(2, spct.getIdNSX());
            ps.setObject(3, spct.getIdMauSac());
            ps.setObject(4, spct.getIdDongSP());
            ps.setObject(5, spct.getNamBH());
            ps.setObject(6, spct.getMoTa());
            ps.setObject(7, spct.getSoLuongTon());
            ps.setObject(8, spct.getGiaNhap());
            ps.setObject(9, spct.getGiaBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[ChiTietSP]\n"
                + "      WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
           check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        //     System.out.println(new sanphamchitietrepbon().add(new sanphamchitiet("74A9CB25-77AB-4D17-A126-266C1C7BFD82", "27A021EA-ED89-47E2-AB64-1783D1FD10C7", "2C3CBC56-CFA9-4DF5-8221-3D4A2C61E5C0", "ED559468-908E-4248-954B-3B8643C958D7", 10, "Nhieu tien", 50, 60, 70)));
        //     new sanphamchitietrepbon().getall().forEach(s -> System.out.println(s.toString()));
        //System.out.println(new sanphamchitietrepbon().update(new sanphamchitiet("74A9CB25-77AB-4D17-A126-266C1C7BFD82", "27A021EA-ED89-47E2-AB64-1783D1FD10C7", "2C3CBC56-CFA9-4DF5-8221-3D4A2C61E5C0", "ED559468-908E-4248-954B-3B8643C958D7", 10, "Nhieu tien", 50, 60, 70), "F4D159A2-8FC4-4EBF-853B-0DDED78E597B"));
        System.out.println(new sanphamchitietrepbon().delete("9C6C4F25-C83F-4D98-8F96-AB3173BBE7D8"));
    }

}

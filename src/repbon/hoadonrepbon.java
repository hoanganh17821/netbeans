/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.List;
import model.hoadon;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.gioihang;

/**
 *
 * @author Administrator
 */
public class hoadonrepbon {

    public List<hoadon> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[IdKH]\n"
                + "      ,[IdNV]\n"
                + "      ,[Ma]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,[NgayShip]\n"
                + "      ,[NgayNhan]\n"
                + "      ,[TinhTrang]\n"
                + "      ,[TenNguoiNhan]\n"
                + "      ,[DiaChi]\n"
                + "      ,[Sdt]\n"
                + "  FROM [dbo].[HoaDon]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<hoadon> listgiohang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                hoadon hd = new hoadon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12));
                listgiohang.add(hd);
            }
            return listgiohang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(hoadon hd) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([IdKH]\n"
                + "           ,[IdNV]\n"
                + "           ,[Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[NgayShip]\n"
                + "           ,[NgayNhan]\n"
                + "           ,[TinhTrang]\n"
                + "           ,[TenNguoiNhan]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hd.getIdkh());
            ps.setObject(2, hd.getIdnv());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgaytao());
            ps.setObject(5, hd.getNgaythanhtoan());
            ps.setObject(6, hd.getNgayship());
            ps.setObject(7, hd.getNgaynhan());
            ps.setObject(8, hd.getTinhtrang());
            ps.setObject(9, hd.getTennguoinhan());
            ps.setObject(10, hd.getDiachi());
            ps.setObject(11, hd.getSdt());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(hoadon hd, String mahd) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [IdKH] =?\n"
                + "      ,[IdNV] = ?\n"
                + "      ,[Ma] =?\n"
                + "      ,[NgayTao] = ?\n"
                + "      ,[NgayThanhToan] =?\n"
                + "      ,[NgayShip] =?\n"
                + "      ,[NgayNhan] =?\n"
                + "      ,[TinhTrang] =?\n"
                + "      ,[TenNguoiNhan] =?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + " WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hd.getIdkh());
            ps.setObject(2, hd.getIdnv());
            ps.setObject(3, hd.getMa());
            ps.setObject(4, hd.getNgaytao());
            ps.setObject(5, hd.getNgaythanhtoan());
            ps.setObject(6, hd.getNgayship());
            ps.setObject(7, hd.getNgaynhan());
            ps.setObject(8, hd.getTinhtrang());
            ps.setObject(9, hd.getTennguoinhan());
            ps.setObject(10, hd.getDiachi());
            ps.setObject(11, hd.getSdt());
            ps.setObject(12, mahd);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String mahd) {
        String query = "DELETE FROM [dbo].[HoaDon]\n"
                + "      WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, mahd);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new hoadonrepbon().getall().forEach(s -> System.out.println(s.toString()));
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.List;
import model.nhanvien;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class nhanvienrepbon {

    public List<nhanvien> getall() {
        String query = "SELECT dbo.NhanVien.Id, dbo.NhanVien.Ma, dbo.NhanVien.Ten, dbo.NhanVien.TenDem, dbo.NhanVien.Ho, dbo.NhanVien.GioiTinh, dbo.NhanVien.NgaySinh, dbo.NhanVien.DiaChi, dbo.NhanVien.Sdt, dbo.CuaHang.Id AS Expr1, \n"
                + "                  dbo.ChucVu.Id AS Expr2, dbo.NhanVien.TrangThai\n"
                + "FROM     dbo.ChucVu INNER JOIN\n"
                + "                  dbo.NhanVien ON dbo.ChucVu.Id = dbo.NhanVien.IdCV INNER JOIN\n"
                + "                  dbo.CuaHang ON dbo.NhanVien.IdCH = dbo.CuaHang.Id";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<nhanvien> listnhanvien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
             nhanvien nv= new nhanvien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12));
                listnhanvien.add(nv);
            }
            return listnhanvien;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(nhanvien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[IdCH]\n"
                + "           ,[IdCV]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<nhanvien> listnhanvien = new ArrayList<>();
            ps.setObject(1, nv.getManhanvien());
            ps.setObject(2, nv.getTennhanvien());
            ps.setObject(3, nv.getTendem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getGioitinh());
            ps.setObject(6, nv.getNgaysinh());
            ps.setObject(7, nv.getDiachi());
            ps.setObject(8, nv.getSdt());
            ps.setObject(9, nv.getIdch());
            ps.setObject(10, nv.getIdcv());
            ps.setObject(11, nv.getTrangthai());
            check = ps.executeUpdate();
      

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(nhanvien nv, String manhanvien) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[GioiTinh] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[IdCH] = ?\n"
                + "      ,[IdCV] = ?\n"
                + "      ,[TrangThai] =?\n"
                + " WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, nv.getManhanvien());
            ps.setObject(2, nv.getTennhanvien());
            ps.setObject(3, nv.getTendem());
            ps.setObject(4, nv.getHo());
            ps.setObject(5, nv.getGioitinh());
            ps.setObject(6, nv.getNgaysinh());
            ps.setObject(7, nv.getDiachi());
            ps.setObject(8, nv.getSdt());
            ps.setObject(9, nv.getIdch());
            ps.setObject(10, nv.getIdcv());
            ps.setObject(11, nv.getTrangthai());
            ps.setObject(12, manhanvien);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String manhanvien) {
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, manhanvien);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new nhanvienrepbon().getall().forEach(s -> System.out.println(s.toString()));
    }
}

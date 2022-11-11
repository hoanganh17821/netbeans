/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.List;
import model.gioihang;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class giohangrepbon {

    public List<gioihang> getall() {
//        String query = "SELECT dbo.HoaDon.Id, dbo.KhachHang.Id AS Expr1, dbo.NhanVien.Id AS Expr2, dbo.HoaDon.Ma, dbo.HoaDon.NgayTao, dbo.HoaDon.NgayThanhToan, dbo.HoaDon.NgayShip, dbo.HoaDon.NgayNhan, dbo.HoaDon.TinhTrang, \n"
//                + "                  dbo.HoaDon.TenNguoiNhan, dbo.HoaDon.DiaChi, dbo.HoaDon.Sdt\n"
//                + "FROM     dbo.HoaDon INNER JOIN\n"
//                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id INNER JOIN\n"
//                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
        String query = "SELECT dbo.GioHang.Id, dbo.KhachHang.Id AS Expr1, dbo.GioHang.Ma, dbo.GioHang.NgayTao, dbo.GioHang.NgayThanhToan, dbo.GioHang.TenNguoiNhan, dbo.GioHang.DiaChi, dbo.GioHang.Sdt, dbo.GioHang.TinhTrang\n"
                + "FROM     dbo.GioHang INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.GioHang.IdKH = dbo.KhachHang.Id";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<gioihang> listgiohang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //  gioihang gh = new gioihang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10));
                gioihang gh = new gioihang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
                listgiohang.add(gh);
            }
            return listgiohang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public gioihang getone(String magh) {
        String query = "";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, magh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                gioihang gh = new gioihang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9));
                return gh;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(gioihang gh) {
        String query = "INSERT INTO [dbo].[GioHang]\n"
                + "           ([IdKH]\n"
                + "           ,[Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[TenNguoiNhan]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[TinhTrang])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, gh.getIdkh());
            ps.setObject(2, gh.getMa());
            ps.setObject(3, gh.getNgaytao());
            ps.setObject(4, gh.getNgaythanhtoan());
            ps.setObject(5, gh.getTennguoinhan());
            ps.setObject(6, gh.getDiachi());
            ps.setObject(7, gh.getSodienthoai());
            ps.setObject(8, gh.getTinhtrang());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(gioihang gh, String magh) {
        String query = "UPDATE [dbo].[GioHang]\n"
                + "   SET [IdKH] = ?\n"
                + "      ,[Ma] = ?\n"
                + "      ,[NgayTao] = ?\n"
                + "      ,[NgayThanhToan] =?\n"
                + "      ,[TenNguoiNhan] = ?\n"
                + "      ,[DiaChi] =?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[TinhTrang] = ?\n"
                + " WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, gh.getIdkh());
            ps.setObject(2, gh.getMa());
            ps.setObject(3, gh.getNgaytao());
            ps.setObject(4, gh.getNgaythanhtoan());
            ps.setObject(5, gh.getTennguoinhan());
            ps.setObject(6, gh.getDiachi());
            ps.setObject(7, gh.getSodienthoai());
            ps.setObject(8, gh.getTinhtrang());
            ps.setObject(9, magh);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String magh) {
        String query = "DELETE FROM [dbo].[GioHang]\n"
                + "      WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, magh);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        new giohangrepbon().getall().forEach(s -> System.out.println(s.toString()));

        // System.out.println(new giohangrepbon().add(new gioihang("64F8C831-9C24-4F45-B4F6-6F3CCF3AAEB0", "F0ECA767-7A1B-4CC0-8B7C-164095AD7477", "Mgh01", "2022-06-15","2022-06-15", "Nguyen Phat Dat", "Ha Noi", "0345785432", 100)));
        // System.out.println(new giohangrepbon().add(new gioihang(idkh, idnv, ma, ngaytao, ngaythanhtoan, tennguoinhan, diachi, sodienthoai, 0));
        //    System.out.println(new giohangrepbon().delete(""));
    }

}

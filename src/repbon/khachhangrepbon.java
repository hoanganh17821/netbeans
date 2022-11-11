/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.List;
import model.khachhang;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.nhasanxuat;

/**
 *
 * @author Administrator
 */
public class khachhangrepbon {

    public List<khachhang> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "      ,[MatKhau]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<khachhang> listkhachhang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                khachhang kh = new khachhang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                listkhachhang.add(kh);
            }
            return listkhachhang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//        public nhasanxuat getone(String id) {
//        String query = "Select * from NSX where Id=?";
//        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
//            ps.setObject(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                nhasanxuat nsx = new nhasanxuat(rs.getString(1), rs.getString(2), rs.getString(3));
//                return nsx;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    public khachhang getone(String ma) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "      ,[MatKhau]\n"
                + "  FROM [dbo].[KhachHang] Where Id=?";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                khachhang kh = new khachhang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                return kh;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(khachhang kh) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Sdt]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia]\n"
                + "           ,[MatKhau])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTendem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getNgaysinh());
            ps.setObject(6, kh.getSdt());
            ps.setObject(7, kh.getDiachi());
            ps.setObject(8, kh.getThanhpho());
            ps.setObject(9, kh.getQuocgia());
            ps.setObject(10, kh.getMatkhau());
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(khachhang kh, String id) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[DiaChi] =?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + "      ,[MatKhau] = ?\n"
                + " WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTendem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getNgaysinh());
            ps.setObject(6, kh.getSdt());
            ps.setObject(7, kh.getDiachi());
            ps.setObject(8, kh.getThanhpho());
            ps.setObject(9, kh.getQuocgia());
            ps.setObject(10, kh.getMatkhau());
            ps.setObject(11, id);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[KhachHang]\n"
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
        new khachhangrepbon().getall().forEach(s->System.out.println(s.toString()));
     //   System.out.println(new khachhangrepbon().add(new khachhang("Makh88", "Nguyen Van Do", "Nguyen", "Van", "2022-06-15", "0123456789", "Ha Noi", "Ha Noi", "Viet Nam", "123")));
    }

}

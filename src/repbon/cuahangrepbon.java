/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.List;
import model.cuahang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class cuahangrepbon {

    public List<cuahang> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "  FROM [dbo].[CuaHang]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<cuahang> listcuahang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cuahang ch = new cuahang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                listcuahang.add(ch);
            }
            return listcuahang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//        public List<cuahang> listseach(String ma) {
//        String query = """
//                       SELECT dbo.SACH.MASACH, dbo.SACH.TENSACH, dbo.SACH.NHAXUATBAN, dbo.SACH.SOLUONG, dbo.SACH.GIATIEN, dbo.THELOAI.TENTHELOAI
//                       FROM   dbo.SACH INNER JOIN
//                                    dbo.THELOAI ON dbo.SACH.MATHELOAI = dbo.THELOAI.MATHELOAI WHERE dbo.THELOAI.MATHELOAI = ?;
//                       """;
//        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
//            List<Sach> listSearch = new ArrayList<>();
//            ps.setObject(1, ma);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                TheLoai theLoai = new TheLoai(rs.getString(6));
//                Sach sach = new Sach(rs.getString(1), rs.getString(2), theLoai, rs.getInt(4), rs.getInt(5), rs.getString(3));
//                listSearch.add(sach);
//            }
//            return listSearch;
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }

            public List<cuahang> listseachh(String ma) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "  FROM [dbo].[CuaHang] Where Ma=?";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<cuahang> listcuahang = new ArrayList<>();
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cuahang ch = new cuahang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                listcuahang.add(ch);
            }
            return listcuahang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
            
        
        
        
        
    public boolean add(cuahang cv) {
        String query = "INSERT INTO [dbo].[CuaHang]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, cv.getMacuahang());
            ps.setObject(2, cv.getNamecuahang());
            ps.setObject(3, cv.getDiachi());
            ps.setObject(4, cv.getThanhpho());
            ps.setObject(5, cv.getQuocgia());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(cuahang cv, String id) {
        String query = "UPDATE [dbo].[CuaHang]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + " WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, cv.getMacuahang());
            ps.setObject(2, cv.getNamecuahang());
            ps.setObject(3, cv.getDiachi());
            ps.setObject(4, cv.getThanhpho());
            ps.setObject(5, cv.getQuocgia());
            ps.setObject(6, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String cv) {
        String query = "DELETE FROM [dbo].[CuaHang]\n"
                + "      WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, cv);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        //   new cuahangrepbon().getall().forEach(s -> System.out.println(s.toString()));
     //   System.out.println(new cuahangrepbon().add(new cuahang("Mach01", "Ch01", "Mi Dinh", "Ha Noi", "Viet Nam")));
        System.out.println(new cuahangrepbon().update(new cuahang("Mach010", "Ch01", "Mi Dinh", "Ha Noi", "Viet Nam"), "F4044142-FB3F-4A15-A594-F9570689FCA6"));
      //  System.out.println( new cuahangrepbon().delete("90978723-8EE6-40DF-9802-195B9E897BA1"));
    }

}

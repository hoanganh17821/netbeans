/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.List;
import model.chucvu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class chucvurepbon {

    public List<chucvu> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[ChucVu]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<chucvu> listchucvu = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chucvu cv = new chucvu(rs.getString(1), rs.getString(2), rs.getString(3));
                listchucvu.add(cv);
            }
            return listchucvu;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(chucvu cv) {
        String query = "INSERT INTO [dbo].[ChucVu]\n"
                + "           ( [Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, cv.getMachucvu());
            ps.setObject(2, cv.getNamechucvu());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(chucvu cv, String id) {
        String query = "UPDATE [dbo].[ChucVu]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE Id=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, cv.getMachucvu());
            ps.setObject(2, cv.getNamechucvu());
            ps.setObject(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String cv) {
        String query = "DELETE FROM [dbo].[ChucVu]\n"
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
        new chucvurepbon().getall().forEach(s -> System.out.println(s.toString()));
         System.out.println(new chucvurepbon().add(new chucvu("Mcv01", "Tai Chinh")));
  //      System.out.println(new chucvurepbon().update(new chucvu("Mcv01", "Tai Chinh"), "C20B0203-E5BE-490A-8E1D-4D2612E2CCF1"));
     //   System.out.println(new chucvurepbon().delete("C20B0203-E5BE-490A-8E1D-4D2612E2CCF1"));
    }
}

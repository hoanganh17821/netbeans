/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.ArrayList;
import model.mausac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.dongsanpham;

/**
 *
 * @author Administrator
 */
public class mausacrepbon {

//    ArrayList<mausac> listmasac = new ArrayList<>();
    public List<mausac> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<mausac> listmausac = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mausac ms = new mausac(rs.getString(1), rs.getString(2), rs.getString(3));
                listmausac.add(ms);
            }
            return listmausac;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public mausac getone(String id) {
        String query = "SELECT * FROM MauSac where Id=?";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mausac ms = new mausac(rs.getString(1), rs.getString(2), rs.getString(3));
                return ms;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(mausac ms) {
        String query = "INSERT INTO [dbo].[MauSac]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ms.getMams());
            ps.setObject(2, ms.getTenmausac());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(mausac ms, String ma) {
        String query = "UPDATE [dbo].[MauSac]\n"
                + "   SET [Ma] =\n"
                + "      ,[Ten] =\n"
                + " WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ms.getMams());
            ps.setObject(2, ms.getTenmausac());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[MauSac]\n"
                + "      WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        //     new mausacrepbon().getall().forEach(s->System.out.println(s.toString()));
        //  new mausacrepbon().getall().forEach(s -> System.out.println(s.toString()));
         System.out.println(new mausacrepbon().add(new mausac("Mams012", "Do")));
       // System.out.println(new mausacrepbon().update(new mausac("MauDo1", "Do"), "ms3"));
    }
}

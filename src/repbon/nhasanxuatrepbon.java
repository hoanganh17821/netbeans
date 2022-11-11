/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repbon;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.dongsanpham;
import model.nhasanxuat;

/**
 *
 * @author Administrator
 */
public class nhasanxuatrepbon {

//    ArrayList<nhasanxuat> listnhasanxuat = new ArrayList<>();

    public List<nhasanxuat> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[NSX]";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<nhasanxuat> listnhasanxuat= new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//            nhasanxuatrepbon nhx= new model.nhasanxuat(rs.getString(1), rs.getString(2), rs.getString(3));
                nhasanxuat nhx = new nhasanxuat(rs.getString(1), rs.getString(2), rs.getString(3));
                listnhasanxuat.add(nhx);
            }
            return listnhasanxuat;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public nhasanxuat getone(String id) {
        String query = "Select * from NSX where Id=?";
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nhasanxuat nsx = new nhasanxuat(rs.getString(1), rs.getString(2), rs.getString(3));
                return nsx;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(nhasanxuat nhx) {
        String query = "INSERT INTO [dbo].[NSX]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, nhx.getMansx());
            ps.setObject(2, nhx.getTennhasanxuat());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(nhasanxuat nhx, String ma) {
        String query = "UPDATE [dbo].[NSX]\n"
                + "   SET [Ma] =?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE Ma=?";
        int check = 0;
        try ( Connection con = SQLServiceConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, nhx.getMansx());
            ps.setObject(2, nhx.getTennhasanxuat());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[NSX]\n"
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
        new nhasanxuatrepbon().getall().forEach(s -> System.out.println(s.toString()));
        System.out.println(new nhasanxuatrepbon().add(new nhasanxuat("Nsx01", "Nsx1")));
    }

}

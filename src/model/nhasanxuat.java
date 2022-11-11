/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class nhasanxuat {
    public String idnsx;
    public String mansx;
    public String tennhasanxuat;

    public nhasanxuat() {
    }

    public nhasanxuat(String idnsx, String mansx, String tennhasanxuat) {
        this.idnsx = idnsx;
        this.mansx = mansx;
        this.tennhasanxuat = tennhasanxuat;
    }
     public nhasanxuat(String mansx, String tennhasanxuat) {
        this.mansx = mansx;
        this.tennhasanxuat = tennhasanxuat;
    }
    
    
    

    public String getIdnsx() {
        return idnsx;
    }

    public void setIdnsx(String idnsx) {
        this.idnsx = idnsx;
    }

    public String getMansx() {
        return mansx;
    }

    public void setMansx(String mansx) {
        this.mansx = mansx;
    }

    public String getTennhasanxuat() {
        return tennhasanxuat;
    }

    public void setTennhasanxuat(String tennhasanxuat) {
        this.tennhasanxuat = tennhasanxuat;
    }

    @Override
    public String toString() {
        return "nhasanxuat{" + "idnsx=" + idnsx + ", mansx=" + mansx + ", tennhasanxuat=" + tennhasanxuat + '}';
    }

   
    public Object[] toaddrow() {
        return new Object[] {idnsx,mansx,tennhasanxuat};
    }
}


//    private String idNSX;
//    private String maNSX;
//    private String tenNhaSanXuat;
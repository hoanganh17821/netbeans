/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class dongsanpham {
    public String idDsp;
    public String maDsp;
    public String tendongsanpham;

    public dongsanpham() {
    }

       public dongsanpham(String maDsp, String tendongsanpham) {
        this.maDsp = maDsp;
        this.tendongsanpham = tendongsanpham;
    }
    
       
    public dongsanpham(String idDsp, String maDsp, String tendongsanpham) {
        this.idDsp = idDsp;
        this.maDsp = maDsp;
        this.tendongsanpham = tendongsanpham;
    }

    public String getIdDsp() {
        return idDsp;
    }

    public void setIdDsp(String idDsp) {
        this.idDsp = idDsp;
    }

    public String getMaDsp() {
        return maDsp;
    }

    public void setMaDsp(String maDsp) {
        this.maDsp = maDsp;
    }

    public String getTendongsanpham() {
        return tendongsanpham;
    }

    public void setTendongsanpham(String tendongsanpham) {
        this.tendongsanpham = tendongsanpham;
    }

    @Override
    public String toString() {
        return "dongsanpham{" + "idDsp=" + idDsp + ", maDsp=" + maDsp + ", tendongsanpham=" + tendongsanpham + '}';
    }

 
    public Object[] toaddrow() {
        return new Object[] {idDsp,maDsp,tendongsanpham};
    }
  
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class sanpham {
    public String idsp;
    public String masp;
    public String tensanpham;

    public sanpham() {
    }

    public sanpham(String masp, String tensanpham) {
        this.masp = masp;
        this.tensanpham = tensanpham;
    }
    

    public sanpham(String idsp, String masp, String tensanpham) {
        this.idsp = idsp;
        this.masp = masp;
        this.tensanpham = tensanpham;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    @Override
    public String toString() {
        return "sanpham{" + "idsp=" + idsp + ", masp=" + masp + ", tensanpham=" + tensanpham + '}';
    }
   
    
    public Object[] toaddrow() {
        return new Object[] {idsp,masp,tensanpham};
    }
}


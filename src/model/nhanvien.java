/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class nhanvien {
    public String id;
    public String manhanvien;
    public String tennhanvien;
    public String tendem;
    public String ho;
    public String gioitinh;
    public Date ngaysinh;
    public String diachi;
    public String sdt;
    public String idch;
    public String idcv;
    public int trangthai;

    public nhanvien() {
    }

    public nhanvien(String manhanvien, String tennhanvien, String tendem, String ho, String gioitinh, Date ngaysinh, String diachi, String sdt, String idch, String idcv, int trangthai) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.idch = idch;
        this.idcv = idcv;
        this.trangthai = trangthai;
    }

    


    public nhanvien(String id, String manhanvien, String tennhanvien, String tendem, String ho, String gioitinh, Date ngaysinh, String diachi, String sdt, String idch, String idcv, int trangthai) {
        this.id = id;
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.idch = idch;
        this.idcv = idcv;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getIdch() {
        return idch;
    }

    public void setIdch(String idch) {
        this.idch = idch;
    }

    public String getIdcv() {
        return idcv;
    }

    public void setIdcv(String idcv) {
        this.idcv = idcv;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "nhanvien{" + "id=" + id + ", manhanvien=" + manhanvien + ", tennhanvien=" + tennhanvien + ", tendem=" + tendem + ", ho=" + ho + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", sdt=" + sdt + ", idch=" + idch + ", idcv=" + idcv + ", trangthai=" + trangthai + '}';
    }

 
    
    public Object[] toaddrow() {
        return new Object[] {id,manhanvien,tennhanvien,tendem,ho,gioitinh,ngaysinh,diachi,sdt,idch,idcv,trangthai};
    }
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class hoadon {

    public String id;
    public String idkh;
    public String idnv;
    public String ma;
    public Date ngaytao;
    public Date ngaythanhtoan;
    public Date ngayship;
    public Date ngaynhan;
    public int tinhtrang;
    public String tennguoinhan;
    public String diachi;
    public String sdt;

    public hoadon() {
    }

    public hoadon(String id, String idkh, String idnv, String ma, Date ngaytao, Date ngaythanhtoan, Date ngayship, Date ngaynhan, int tinhtrang, String tennguoinhan, String diachi, String sdt) {
        this.id = id;
        this.idkh = idkh;
        this.idnv = idnv;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.ngayship = ngayship;
        this.ngaynhan = ngaynhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public hoadon(String idkh, String idnv, String ma, Date ngaytao, Date ngaythanhtoan, Date ngayship, Date ngaynhan, int tinhtrang, String tennguoinhan, String diachi, String sdt) {
        this.idkh = idkh;
        this.idnv = idnv;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.ngayship = ngayship;
        this.ngaynhan = ngaynhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
    }

 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaythanhtoan() {
        return ngaythanhtoan;
    }

    public void setNgaythanhtoan(Date ngaythanhtoan) {
        this.ngaythanhtoan = ngaythanhtoan;
    }

    public Date getNgayship() {
        return ngayship;
    }

    public void setNgayship(Date ngayship) {
        this.ngayship = ngayship;
    }

    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTennguoinhan() {
        return tennguoinhan;
    }

    public void setTennguoinhan(String tennguoinhan) {
        this.tennguoinhan = tennguoinhan;
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

    @Override
    public String toString() {
        return "hoadon{" + "id=" + id + ", idkh=" + idkh + ", idnv=" + idnv + ", ma=" + ma + ", ngaytao=" + ngaytao + ", ngaythanhtoan=" + ngaythanhtoan + ", ngayship=" + ngayship + ", ngaynhan=" + ngaynhan + ", tinhtrang=" + tinhtrang + ", tennguoinhan=" + tennguoinhan + ", diachi=" + diachi + ", sdt=" + sdt + '}';
    }
    
    public Object[] toaddrow() {
      return new Object[] {id,idkh,idnv,ma,ngaytao,ngaythanhtoan,ngayship,ngaynhan,tinhtrang,tennguoinhan,diachi,sdt};
      
    }
    
}

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
public class gioihang {

    public String id;
    public String idkh;
    public String ma;
    public Date ngaytao;
    public Date ngaythanhtoan;
    public String tennguoinhan;
    public String diachi;
    public String sodienthoai;
    public int tinhtrang;

    public gioihang() {
    }

    public gioihang(String id, String idkh, String ma, Date ngaytao, Date ngaythanhtoan, String tennguoinhan, String diachi, String sodienthoai, int tinhtrang) {
        this.id = id;
        this.idkh = idkh;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.tinhtrang = tinhtrang;
    }

    public gioihang(String idkh, String ma, Date ngaytao, Date ngaythanhtoan, String tennguoinhan, String diachi, String sodienthoai, int tinhtrang) {
        this.idkh = idkh;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.tinhtrang = tinhtrang;
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

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    @Override
    public String toString() {
        return "gioihang{" + "id=" + id + ", idkh=" + idkh + ", ma=" + ma + ", ngaytao=" + ngaytao + ", ngaythanhtoan=" + ngaythanhtoan + ", tennguoinhan=" + tennguoinhan + ", diachi=" + diachi + ", sodienthoai=" + sodienthoai + ", tinhtrang=" + tinhtrang + '}';
    }

  

   
   public Object[] toaddrow() {
       return new Object[] {id,idkh,ma ,ngaytao,ngaythanhtoan,tennguoinhan,diachi,sodienthoai,tinhtrang==1?"da thanh toan":"chua thanh toan"};
   }
    
    
    
}

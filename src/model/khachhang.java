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
public class khachhang {

    public String id;
    public String ma;
    public String ten;
    public String tendem;
    public String ho;
    public Date ngaysinh;
    public String sdt;
    public String diachi;
    public String thanhpho;
    public String quocgia;
    public String matkhau;

    public khachhang(String id, String ma, String ten, String tendem, String ho, Date ngaysinh, String sdt, String diachi, String thanhpho, String quocgia, String matkhau) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.matkhau = matkhau;
    }

    public khachhang(String ma, String ten, String tendem, String ho, Date ngaysinh, String sdt, String diachi, String thanhpho, String quocgia, String matkhau) {
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.matkhau = matkhau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public String toString() {
        return "khachhang{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", tendem=" + tendem + ", ho=" + ho + ", ngaysinh=" + ngaysinh + ", sdt=" + sdt + ", diachi=" + diachi + ", thanhpho=" + thanhpho + ", quocgia=" + quocgia + ", matkhau=" + matkhau + '}';
    }
    
    public Object[] toaddrow() {
        return new Object[] {id,ma,ten,tendem,ho,ngaysinh,sdt,diachi,thanhpho,quocgia,matkhau};
    }
}

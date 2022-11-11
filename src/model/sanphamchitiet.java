/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class sanphamchitiet {

    
    private sanpham sp;
    private String id;
    private String idSP;
    private String idNSX;
    private String idMauSac;
    private String idDongSP;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private float giaNhap;
    private float giaBan;

    public sanphamchitiet() {
    }

    public sanphamchitiet(sanpham sp, String id, String idSP, String idNSX, String idMauSac, String idDongSP, int namBH, String moTa, int soLuongTon, float giaNhap, float giaBan) {
        this.sp = sp;
        this.id = id;
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public sanphamchitiet(String idSP, String idNSX, String idMauSac, String idDongSP, int namBH, String moTa, int soLuongTon, float giaNhap, float giaBan) {
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public sanpham getSp() {
        return sp;
    }

    public void setSp(sanpham sp) {
        this.sp = sp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(String idDongSP) {
        this.idDongSP = idDongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public sanphamchitiet(String id, String idSP, String idNSX, String idMauSac, String idDongSP, int namBH, String moTa, int soLuongTon, float giaNhap, float giaBan) {
        this.id = id;
        this.idSP = idSP;
        this.idNSX = idNSX;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "sanphamchitiet{" + "id=" + id + ", idSP=" + idSP + ", idNSX=" + idNSX + ", idMauSac=" + idMauSac + ", idDongSP=" + idDongSP + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

    public Object[] toaddrow() {
        return new Object[] {id,idSP,idNSX,idMauSac,idDongSP,namBH,moTa,soLuongTon,giaNhap,giaBan};
    }
}

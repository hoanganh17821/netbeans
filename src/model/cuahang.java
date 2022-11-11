/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class cuahang {
    public String id;
    public String macuahang;
    public String namecuahang;
    public String diachi;
    public String thanhpho;
    public String quocgia;

    public cuahang() {
    }

    public cuahang(String id, String macuahang, String namecuahang, String diachi, String thanhpho, String quocgia) {
        this.id = id;
        this.macuahang = macuahang;
        this.namecuahang = namecuahang;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMacuahang() {
        return macuahang;
    }

    public void setMacuahang(String macuahang) {
        this.macuahang = macuahang;
    }

    public String getNamecuahang() {
        return namecuahang;
    }

    public void setNamecuahang(String namecuahang) {
        this.namecuahang = namecuahang;
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

    @Override
    public String toString() {
        return "cuahang{" + "id=" + id + ", macuahang=" + macuahang + ", namecuahang=" + namecuahang + ", diachi=" + diachi + ", thanhpho=" + thanhpho + ", quocgia=" + quocgia + '}';
    }

    public cuahang(String macuahang, String namecuahang, String diachi, String thanhpho, String quocgia) {
        this.macuahang = macuahang;
        this.namecuahang = namecuahang;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
    }
    
    
    public Object[] toaddrow() {
         return new Object[] {id,macuahang,namecuahang,diachi,thanhpho,quocgia};
    }
    
}

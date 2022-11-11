/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class mausac {

    public String id;
    public String mams;
    public String tenmausac;

    public mausac() {
    }

    public mausac(String mams, String tenmausac) {
        this.mams = mams;
        this.tenmausac = tenmausac;
    }

    public mausac(String id, String mams, String tenmausac) {
        this.id = id;
        this.mams = mams;
        this.tenmausac = tenmausac;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMams() {
        return mams;
    }

    public void setMams(String mams) {
        this.mams = mams;
    }

    public String getTenmausac() {
        return tenmausac;
    }

    public void setTenmausac(String tenmausac) {
        this.tenmausac = tenmausac;
    }

    @Override
    public String toString() {
        return "mausac{" + "id=" + id + ", mams=" + mams + ", tenmausac=" + tenmausac + '}';
    }

    public Object[] toaddrow() {
        return new Object[]{id, mams, tenmausac};
    }
}

//    private String idMS;
//    private String maMS;
//    private String tenMauSac;


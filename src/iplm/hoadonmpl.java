/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.hoadon;
import repbon.hoadonrepbon;
import seiver.hoadonseiver;

/**
 *
 * @author Administrator
 */
public class hoadonmpl implements hoadonseiver {

    hoadonrepbon hdrepbon = new hoadonrepbon();

    @Override
    public List<hoadon> getall() {
        return hdrepbon.getall();
    }

    @Override
    public String add(hoadon hd) {
        if (hd.getDiachi().isEmpty()) {
            return "Dia Chi Null";
        }
        if (hd.getMa().isEmpty()) {
            return "Ma Null";
        }
        if (hd.getSdt().isEmpty()) {
            return "So Dien Thoai Null";
        }
        if (hd.getTennguoinhan().isEmpty()) {
            return "Ten Nguoi Nhan Null";
        }
     
        boolean add = hdrepbon.add(hd);
        if (add) {
            return "Add Thanh Cong";
        } else {
            return "Add That Bai";
        }
    }

    @Override
    public String update(hoadon hd, String mahd) {
        boolean update = hdrepbon.update(hd, mahd);
        if (update) {
            return "Update Thanh Cong";
        } else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String mahd) {
        boolean delete = hdrepbon.delete(mahd);
        if (delete) {
            return "Delete Thanh Cong";
        } else {
            return "Delete That Bai";
        }
    }

}

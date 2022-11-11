/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.chucvu;
import model.sanpham;
import repbon.chucvurepbon;
import seiver.chucvuseiver;

/**
 *
 * @author Administrator
 */
public class chucvumpl implements chucvuseiver {

    chucvurepbon cvrepbon = new chucvurepbon();

    @Override
    public List<chucvu> getall() {
        return cvrepbon.getall();
    }

    @Override
    public String add(chucvu cv) {
        if (cv.getMachucvu().isEmpty()) {
            return "Ma Chuc Vu Null";
        }
        if (cv.getNamechucvu().isEmpty()) {
            return "Name Chuc Vu Null";
        }

        if (!check(cv.getNamechucvu())) {
            return "Name Phai La Chu";
        }

        boolean add = cvrepbon.add(cv);

        if (add) {
            return "Add Thanh Cong";
        } else {
            return "Add That Bai";
        }
    }

    
//        @Override
//    public String addsanpham(sanpham sp) {
//    if(sp.getMasp().trim().length() < 0) {
//        return "Masp Null";
//    }
//    if(sp.getTensanpham().trim().length()< 0) {
//        return "Name san pham Null";
//    }
//    if(!checkchu(sp.getTensanpham())) {
//        return "Name Phai la chu";
//    }
//        boolean add= sanphamrp.add(sp);
//        if(add) {
//            return "Thanh Cong";
//        }else {
//            return "That Bai";
//        }
//    }
    @Override
    public String update(chucvu cv, String id) {
        boolean update = cvrepbon.update(cv, id);
        if (update) {
            return "Update Thanh Cong";
        } else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = cvrepbon.delete(id);
        if (delete) {
            return "Delete Thanh Cong";
        } else {
            return "Delete That Bai";
        }
    }

    @Override
    public boolean check(String checkchu) {
        return checkchu.matches("[ a-zA-Z ]+");
    }

}

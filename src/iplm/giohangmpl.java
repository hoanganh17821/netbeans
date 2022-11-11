/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.gioihang;
import repbon.giohangrepbon;
import seiver.giohangsiever;

/**
 *
 * @author Administrator
 */
public class giohangmpl implements giohangsiever{
    giohangrepbon ghrb = new giohangrepbon();

    @Override
    public List<gioihang> getall() {
        return ghrb.getall();
    }

    @Override
    public String add(gioihang gh) {
        if(gh.getMa().isEmpty()) {
            return "Ma Null";
        }
        if(gh.getNgaytao().equals("")) {
            return "Ngay Tao Null";
        }
     
        if(gh.getTennguoinhan().isEmpty()) {
            return "Ten Nguoi Nhan Null";
        }
        
         if(gh.getSodienthoai().isEmpty()) {
            return "so dien thoai Null";
        }
//          if(gh.getSodienthoai().length() < 1) {
//            return "tinh trang Null";
//        }
         if(gh.getDiachi().isEmpty()) {
             return "Dia Chi Null";
         }
         
        boolean add=ghrb.add(gh);
        if(add) {
            return "Add Thanh Cong";
        }else {
            return "Add That Bai";
        }
    }

    @Override
    public String update(gioihang gh, String magh) {
            boolean update=ghrb.update(gh, magh);
        if(update) {
            return "Update Thanh Cong";
        }else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String mgh) {
            boolean delete=ghrb.delete(mgh);
        if(delete) {
            return "Delete Thanh Cong";
        }else {
            return "Delete That Bai";
        }
    }

    @Override
    public boolean check(String checkchu) {
       return checkchu.matches("[a-zA-Z ]+");
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.ArrayList;
import java.util.List;
import model.sanpham;
import repbon.sanphamrepbon;
import seiver.sanphamserver;

/**
 *
 * @author Administrator
 */
public class sanphammpl implements sanphamserver{
    sanphamrepbon sanphamrp= new sanphamrepbon();

//    @Override
//    public List<sanpham> getall() {
//        return sanphamrp.getall();
//    }

    @Override
    public String addsanpham(sanpham sp) {
    if(sp.getMasp().isEmpty()) {
        return "Masp Null";
    }
    if(sp.getTensanpham().isEmpty()) {
        return "Name san pham Null";
    }
    if(!checkchu(sp.getTensanpham())) {
        return "Name Phai la chu";
    }
        boolean add= sanphamrp.add(sp);
        if(add) {
            return "Thanh Cong";
        }else {
            return "That Bai";
        }
    }

    @Override
    public String updatesanpham(sanpham sp, String masp) {
        boolean update=sanphamrp.update(sp, masp);
        if(update) {
            return "Thanh Cong";
        }else {
            return "That Bai";
        }
    }

    @Override
    public String delete(String masp) {
        boolean delete=sanphamrp.delete(masp);
        if(delete) {
           return "Thanh Cong";
        }else {
            return "That Bai";
        }
    }

    @Override
    public sanpham getone(String id) {
        return sanphamrp.getone(id);
    }

    @Override
    public List<sanpham> getall() {
      return  sanphamrp.getall();
    }

    @Override
    public boolean checkchu(String chechchu) {
        return chechchu.matches("[ a-zA-Z ]+");
    }
    
    
}
//
//  public boolean check(String checkchu) {
//        return checkchu.matches("[ a-zA-Z ]+");
//    }
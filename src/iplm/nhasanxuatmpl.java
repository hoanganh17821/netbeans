/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.ArrayList;
import java.util.List;
import model.nhasanxuat;
import repbon.nhasanxuatrepbon;
import seiver.nhasanxuatseiver;

/**
 *
 * @author Administrator
 */
public class nhasanxuatmpl implements nhasanxuatseiver{
    nhasanxuatrepbon nhasxrepbon = new nhasanxuatrepbon();

    @Override
    public List<nhasanxuat> getall() {
        return nhasxrepbon.getall();
    }

    @Override
    public String addnhasanxuat(nhasanxuat nsx) {
        if(nsx.getMansx().isEmpty()) {
            return "Ma Null";
        }
        if(nsx.getTennhasanxuat().isEmpty()) {
            return "Name Null";
        }
        if(!check(nsx.getTennhasanxuat())) {
            return   "Name nha San Xuat Phai La Chu";
        }
        boolean add = nhasxrepbon.add(nsx);
        if(add) {
            return "Thanh Cong";
        }else {
            return "That Bai";
        }
    }

    @Override
    public String deletenhasanxuat(String mansx) {
         boolean delete = nhasxrepbon.delete(mansx);
        if(delete) {
            return "Thanh Cong";
        }else {
            return "That Bai";
        }
    }

    @Override
    public String suanhasanxuat(nhasanxuat nsx, String mansx) {
         boolean update = nhasxrepbon.update(nsx, mansx);
        if(update) {
            return "Thanh Cong";
        }else {
            return "That Bai";
        }
    }

    @Override
    public nhasanxuat getone(String id) {
        return nhasxrepbon.getone(id);
    }

    @Override
    public boolean check(String checkchu) {
        return checkchu.matches("[a-zA-Z ]+");
    }
     

    
}

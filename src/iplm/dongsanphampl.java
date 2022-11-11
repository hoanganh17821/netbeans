/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.ArrayList;
import java.util.List;
import model.dongsanpham;
import repbon.dongsanphamrepbon;
import seiver.dongsanphamseiver;

/**
 *
 * @author Administrator
 */
public class dongsanphampl implements dongsanphamseiver {

    dongsanphamrepbon donspreopbon = new dongsanphamrepbon();

    @Override
    public List<dongsanpham> getall() {
        return donspreopbon.getall();
    }

    @Override
    public String adddongsanpham(dongsanpham dsp) {
        if(dsp.getMaDsp().trim().length() < 0) {
            return "Masp Null";
        }
        if(dsp.getTendongsanpham().trim().length() < 0) {
           return "Name San Pham Null";
        }
        if(!check(dsp.getTendongsanpham())) {
            return "Name Phai La Chu";
        }
        boolean add = donspreopbon.add(dsp);
        if (add) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String updatedongsanpham(dongsanpham dsp, String madsp) {
        boolean update = donspreopbon.update(dsp, madsp);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public String delete(String masp) {
        boolean delete=donspreopbon.delete(masp);
        if(delete) {
            return "DELETE Thanh Cong";
        }else {
             return "DELETE That Bai";
        }
    }

    @Override
    public dongsanpham getone(String id) {
        return donspreopbon.getone(id);
    }

    @Override
    public boolean check(String checkchu) {
        return checkchu.matches("[a-zA-Z ]+");
    }

 

}

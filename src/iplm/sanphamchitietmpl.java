/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.ArrayList;
import java.util.List;
import model.sanphamchitiet;
import repbon.sanphamchitietrepbon;
import seiver.sanphamchitietsiever;

/**
 *
 * @author Administrator
 */
public class sanphamchitietmpl implements sanphamchitietsiever{
    sanphamchitietrepbon spctrp = new sanphamchitietrepbon();

    @Override
    public List<sanphamchitiet> getall() {
        return spctrp.getall();
    }

    @Override
    public String add(sanphamchitiet spct) {
        
        if(spct.getIdDongSP().isEmpty()) {
            return "Dong San Pham Null";
        }
         if(spct.getMoTa().isEmpty()) {
            return "Mo ta Pham Null";
        }
     
         
        boolean add=spctrp.add(spct);
        if(add) {
            return "ADD Thanh Cong";
        }else {
            return "ADD That Bai";
        }
    }

    @Override
    public String update(sanphamchitiet spct, String maspct) {
        boolean update=spctrp.update(spct, maspct);
        if(update) {
            return "Update Thanh Cong";
        }else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String maspct) {
        boolean delete=spctrp.delete(maspct);
        if(delete) {
            return "Delete Thanh Cong";
        }else {
            return "Delete That Bai";
        }
    }

    
}

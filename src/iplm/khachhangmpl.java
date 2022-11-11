/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.khachhang;
import repbon.khachhangrepbon;
import seiver.khachhangseiver;

/**
 *
 * @author Administrator
 */
public class khachhangmpl implements khachhangseiver {

    khachhangrepbon khrepbon = new khachhangrepbon();

    @Override
    public List<khachhang> getall() {
        return khrepbon.getall();
    }

    @Override
    public String add(khachhang kh) {
        boolean add = khrepbon.add(kh);
        if (add) {
            return "Add Thanh Cong";
        } else {
            return "Add That Bai";
        }
    }

    @Override
    public String update(khachhang kh, String id) {
        boolean update = khrepbon.update(kh, id);
        if (update) {
            return "Update Thanh Cong";
        } else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = khrepbon.delete(id);
        if (delete) {
            return "Delete Thanh Cong";
        } else {
            return "Delete That Bai";
        }
    }

}

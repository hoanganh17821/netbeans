/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.nhanvien;
import repbon.nhanvienrepbon;
import seiver.nhanvienseiver;

/**
 *
 * @author Administrator
 */
public class nhanvienmpl implements nhanvienseiver {

    nhanvienrepbon nvrepbo = new nhanvienrepbon();

    @Override
    public List<nhanvien> getall() {
        return nvrepbo.getall();
    }

    @Override
    public String add(nhanvien nv) {
        if (nv.getDiachi().isEmpty()) {
            return "Dia Chi Null";
        }
        if (nv.getGioitinh().isEmpty()) {
            return "gioi tinh Null";
        }

        if (nv.getHo().isEmpty()) {
            return "Ho Null";
        }

        if (nv.getManhanvien().isEmpty()) {
            return "Manv Null";
        }
        if (nv.getSdt().isEmpty()) {
            return "So dien thoai Null";
        }
          if(nv.getTendem().isEmpty()) {
            return "Ten Dem Null";
        }
            if(nv.getTennhanvien().isEmpty()) {
            return "Ten Nhan Vien Null";
        }
        
          
        boolean add = nvrepbo.add(nv);
        if (add) {
            return "Add Thanh Cong";
        } else {
            return "Add That Bai";
        }
    }

    @Override
    public String update(nhanvien nv, String idnhanvien) {
        boolean update = nvrepbo.update(nv, idnhanvien);
        if (update) {
            return "Update Thanh Cong";
        } else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String idnhanvien) {
        boolean delete = nvrepbo.delete(idnhanvien);
        if (delete) {
            return "Delete Thanh Cong";
        } else {
            return "Delete That Bai";
        }
    }

}

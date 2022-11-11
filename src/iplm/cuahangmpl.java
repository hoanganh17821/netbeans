/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.cuahang;
import repbon.cuahangrepbon;
import seiver.cuahangsiever;

/**
 *
 * @author Administrator
 */
public class cuahangmpl implements cuahangsiever {

    cuahangrepbon chrepbon = new cuahangrepbon();

    @Override
    public List<cuahang> getall() {
        return chrepbon.getall();
    }

    @Override
    public String add(cuahang ch) {
        
        if(ch.getMacuahang().isEmpty())  {
            return "Ma Cua Hang Null";
        }
        
        
        boolean add = chrepbon.add(ch);
        if (add) {
            return "Add Thanh Cong";
        } else {
            return "Add That Bai";
        }
    }

    @Override
    public String update(cuahang ch, String id) {
        boolean update = chrepbon.update(ch, id);
        if (update) {
            return "Update Thanh Cong";
        } else {
            return "Update That Bai";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = chrepbon.delete(id);
        if (delete) {
            return "Delete Thanh Cong";
        } else {
            return "Delete That Bai";
        }
    }

    @Override
    public List<cuahang> seachma(String ma) {
        List<cuahang> listsearch = chrepbon.listseachh(ma);
        return listsearch;
    }

}
//     List<Sach> listSearch = sachRespository.searchTheoMa(ma);
//        return listSearch;
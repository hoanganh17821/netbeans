/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iplm;

import java.util.List;
import model.mausac;
import repbon.mausacrepbon;
import seiver.mausacsiever;

/**
 *
 * @author Administrator
 */
public class mausacmpl implements mausacsiever {

    public mausacrepbon masacrepbon = new mausacrepbon();

    @Override
    public List<mausac> getall() {
        return masacrepbon.getall();
    }

//    public String add(xemay xm) {
//        if(xm.getName().isEmpty()) {
//            return "NAME NULL";
//        }
//     
//        
//       if(getone(xm.getMa())!=null) {
//           return "MA TRUNG";
//       }
//       
//       
//       boolean add=xmrp.add(xm);
//       if(add) {
//           return "Thanh Cong";
//       }else {
//           return "That Bai";
//       }
//    }
    @Override
    public String add(mausac ms) {
        if (ms.getMams().isEmpty()) {
            return "Ma Null";
        }
        if(ms.getTenmausac().isEmpty()) {
            return "Name Null";
        }
        if(!check(ms.getTenmausac())) {
            return "Name Phai La Chu";
        }
        boolean add = masacrepbon.add(ms);
        if (add) {
            return "Thanh Cong";
        } else {
            return "Kiem Thu That Bai";
        }
    }

    @Override
    public String delete(String ms) {
        boolean delete = masacrepbon.delete(ms);
        if (delete) {
            return "Thanh Cong";

        } else {
            return "That Bai";
        }
    }

    @Override
    public String update(mausac ms, String mams) {
        boolean update = masacrepbon.update(ms, mams);
        if (update) {
            return "Thanh Cong";
        } else {
            return "That Bai";
        }
    }

    @Override
    public mausac getone(String id) {
        return masacrepbon.getone(id);
    }

    @Override
    public boolean check(String checkchu) {
       return checkchu.matches("[a-zA-Z ]+");
    }

}

//
//    private MauSauRepository mauSacRepo;
//
//    public MauSacServiceImpl() {
//        mauSacRepo = new MauSauRepository();
//    }
//    

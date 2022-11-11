/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.ArrayList;
import java.util.List;
import model.sanpham;

/**
 *
 * @author Administrator
 */
public interface sanphamserver {
    public List<sanpham> getall();
    sanpham getone(String id);
    public String addsanpham(sanpham sp);
    public String updatesanpham(sanpham sp,String masp);
    public String delete(String masp);
    boolean checkchu(String chechchu);
}

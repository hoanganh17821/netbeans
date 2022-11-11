/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.ArrayList;
import java.util.List;
import model.dongsanpham;

/**
 *
 * @author Administrator
 */
public interface dongsanphamseiver {
    public List<dongsanpham> getall();
    dongsanpham getone(String id);
    public String adddongsanpham(dongsanpham dsp);
    public String updatedongsanpham(dongsanpham dsp,String madsp);
    public String delete(String masp);
    boolean check(String checkchu);
}

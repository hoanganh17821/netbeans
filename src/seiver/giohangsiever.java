/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.List;
import model.gioihang;

/**
 *
 * @author Administrator
 */
public interface giohangsiever {
    List<gioihang> getall();
    String add(gioihang gh);
    String update(gioihang gh, String magh);
    String delete(String mgh);
    boolean check(String checkchu);
}

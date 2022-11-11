/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.List;
import model.khachhang;

/**
 *
 * @author Administrator
 */
public interface khachhangseiver {

    List<khachhang> getall();

    String add(khachhang kh);

    String update(khachhang kh, String id);

    String delete(String id);

}

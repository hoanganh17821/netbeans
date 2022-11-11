/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.ArrayList;
import java.util.List;
import model.sanphamchitiet;

/**
 *
 * @author Administrator
 */
public interface sanphamchitietsiever {
    List<sanphamchitiet> getall();
    public String add(sanphamchitiet spct);
    public String update(sanphamchitiet spct,String maspct);
    public String delete(String maspct);
}

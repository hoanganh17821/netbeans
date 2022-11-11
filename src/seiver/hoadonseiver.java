/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.List;
import model.hoadon;

/**
 *
 * @author Administrator
 */
public interface hoadonseiver {

    List<hoadon> getall();

    String add(hoadon hd);

    String update(hoadon hd, String mahd);

    String delete(String mahd);
}

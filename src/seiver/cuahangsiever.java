/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.List;
import model.cuahang;

/**
 *
 * @author Administrator
 */
public interface cuahangsiever {

    List<cuahang> getall();

    String add(cuahang ch);

    String update(cuahang ch, String id);

    String delete(String id);
    
    List<cuahang> seachma(String ma);
}

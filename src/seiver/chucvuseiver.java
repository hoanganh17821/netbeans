/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.List;
import model.chucvu;

/**
 *
 * @author Administrator
 */
public interface chucvuseiver {

    List<chucvu> getall();

    String add(chucvu cv);

    String update(chucvu cv, String id);
    
    String delete(String id);
    
    boolean check(String checkchu);
}

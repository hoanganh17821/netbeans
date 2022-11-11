/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.ArrayList;
import java.util.List;
import model.mausac;

/**
 *
 * @author Administrator
 */
public interface mausacsiever {
      List<mausac> getall();
      mausac getone(String id);
     public String add(mausac ms);
     public String delete(String ms);
     public String update(mausac ms,String mams);
     boolean check(String checkchu);
}

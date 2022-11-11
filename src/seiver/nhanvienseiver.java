/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.List;
import model.nhanvien;
import repbon.nhanvienrepbon;

/**
 *
 * @author Administrator
 */
public interface nhanvienseiver {

    List<nhanvien> getall();

    String add(nhanvien nv);

    String update(nhanvien nv, String idnhanvien);

    String delete(String idnhanvien);

}

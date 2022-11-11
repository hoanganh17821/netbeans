/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package seiver;

import java.util.ArrayList;
import java.util.List;
import model.nhasanxuat;

/**
 *
 * @author Administrator
 */
public interface nhasanxuatseiver {
    public List<nhasanxuat> getall();
    nhasanxuat getone(String id);
    public String addnhasanxuat(nhasanxuat nsx);
    public String deletenhasanxuat(String mansx);
    public String suanhasanxuat(nhasanxuat nsx,String mansx);
    boolean check(String checkchu);
}


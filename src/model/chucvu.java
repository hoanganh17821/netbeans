/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class chucvu {
    public String id;
    public String machucvu;
    public String namechucvu;

    public chucvu() {
    }

    public chucvu(String id, String machucvu, String namechucvu) {
        this.id = id;
        this.machucvu = machucvu;
        this.namechucvu = namechucvu;
    }

    public chucvu(String machucvu, String namechucvu) {
        this.machucvu = machucvu;
        this.namechucvu = namechucvu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public String getNamechucvu() {
        return namechucvu;
    }

    public void setNamechucvu(String namechucvu) {
        this.namechucvu = namechucvu;
    }

    @Override
    public String toString() {
        return "chucvu{" + "id=" + id + ", machucvu=" + machucvu + ", namechucvu=" + namechucvu + '}';
    }
    
    public Object[] toaddrow() {
        return new Object[] {id,machucvu,namechucvu};
    }
    
    
}

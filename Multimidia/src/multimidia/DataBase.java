/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multimidia;

import java.util.ArrayList;

/**
 *
 * @author VF_CASA
 */
public class DataBase {
    
     private ArrayList<CD> cds;
     private ArrayList<DVD> dvds;

    public DataBase() {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
    }

    public void setCds(CD cds) {
        this.cds.add(cds);
    }

    public void setDvds(DVD dvds) {
        this.dvds.add(dvds);
    }

    public ArrayList<CD> getCds() {
        return cds;
    }

    public ArrayList<DVD> getDvds() {
        return dvds;
    }
    
}

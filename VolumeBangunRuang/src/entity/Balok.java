/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import Implementasi.ImplementasiBangunRuang;
//import gui;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Andik S
 */
public class Balok extends BangunRuang{ //extends (pewarisan)
  private double panjang ;//enkapsulasi (private)
  private double lebar ;
  private double tinggi ;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public void cetak(){ //pollymorphism
    ImplementasiBangunRuang bi = new ImplementasiBangunRuang();
    JOptionPane.showMessageDialog(null,"Volume : "+bi.getVolumeBalok(this));
    }
}

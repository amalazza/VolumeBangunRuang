/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import Implementasi.ImplementasiBangunRuang;
import javax.swing.JOptionPane;

/**
 *
 * @author Andik S
 */
public class Tabung extends BangunRuang{
   private double jari_jari ; 
   private double tinggi ;

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    @Override
   public void cetak(){
   
   ImplementasiBangunRuang bi = new ImplementasiBangunRuang();
   JOptionPane.showMessageDialog(null,"Volume : "+bi.getVolumeTabung(this));
   
    }
}

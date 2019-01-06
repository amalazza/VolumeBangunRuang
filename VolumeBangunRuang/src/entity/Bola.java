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
public class Bola extends BangunRuang{
  private double jari_jari ;

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }
   
    @Override
    public void cetak(){
    ImplementasiBangunRuang bi = new ImplementasiBangunRuang();
    JOptionPane.showMessageDialog(null,"Volume : "+bi.getVolumeBola(this));
    }
}

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
public class Kubus extends BangunRuang{
    private double sisi ;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    public void cetak(){
    ImplementasiBangunRuang bi = new ImplementasiBangunRuang();
    JOptionPane.showMessageDialog(null,"Volume : "+bi.getVolumeKubus(this));
    }
}

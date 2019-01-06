package Implementasi;

import entity.Balok;
import entity.Kubus;
import entity.Tabung;
import entity.Kerucut;
import interfac.InterfaceBangunRuang;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andik S
 */
public class ImplementasiBangunRuang implements InterfaceBangunRuang{
double vol ;
    //impl   

    @Override
    public double getVolumeBalok(Balok balok) {
        vol = balok.getPanjang() * balok.getLebar() * balok.getTinggi();
        balok.setVolume(vol);
        return vol ;
    }
        @Override
    public double getVolumeKubus(Kubus kubus) {
        vol = kubus.getSisi() * kubus.getSisi() * kubus.getSisi();
        kubus.setVolume(vol);
        return vol ;
    }
    @Override
    public double getVolumeTabung(Tabung tabung) {
        vol = 3.14 * tabung.getJari_jari()* tabung.getJari_jari() * tabung.getTinggi(); 
        tabung.setVolume(vol);
        return vol ;
    }
    @Override
    public double getVolumeKerucut(Kerucut kerucut) {
        vol = 0.3 * (3.14 * kerucut.getJari_jari()* kerucut.getJari_jari() * kerucut.getTinggi()); 
        kerucut.setVolume(vol);
        return vol ;
    }


    
}

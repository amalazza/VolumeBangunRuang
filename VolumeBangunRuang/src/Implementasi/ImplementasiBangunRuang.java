package Implementasi;

import entity.Balok;
import entity.Kubus;
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

    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

import entity.Balok;
import entity.Kubus;
import entity.Tabung;
import entity.Kerucut;

/**
 *
 * 
 */

public interface InterfaceBangunRuang {//interface
    public double getVolumeBalok(Balok balok);
    public double getVolumeKubus(Kubus kubus);
    public double getVolumeTabung(Tabung tabung);
    public double getVolumeKerucut(Kerucut kerucut);
}

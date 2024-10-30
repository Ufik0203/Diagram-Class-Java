/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertdiagram;

import java.util.List;

/**
 *
 * @author mario
 */
public class auto_car_rpl {

    
    private List<roda> roda;
    private mesin mesin;
    private setir setir;
    private transportasi fuel;
    
    public void displayFuel() {
        fuel.bahan_bakar();
        fuel.kecepatan();
    }
    
    public auto_car_rpl(List<roda> roda, String tipeMesin, setir setir, transportasi fuel) {
        this.roda = roda;
        this.mesin = new mesin(tipeMesin);
        this.setir = setir;
        this.fuel = fuel;
    }
    
    public void start() {
        mesin.startMesin();
        System.out.println("Kendaraan menyala");
    }
    
    public void drive() {
        System.out.println("Kendaraan berjalan");
    }
    
    public void displayRoda() {
        for (roda r : roda) {
            System.out.println("Kendaraan roda " + r.getJumlahRoda());
        }
    }
    
    public void displaySetir() {
        System.out.println("Tipe/Jenis setir: " + setir.getTipe());
    }
    
}

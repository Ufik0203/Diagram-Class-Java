/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertdiagram;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mario
 */
public class mio {

    public static void main(String[] args) {
        
        roda jumlahRoda = new roda("2");
        setir setirMotor = new setir("racing");
        transportasi fuel = new fuel() {};
        
        List<roda> rodaList = Arrays.asList(jumlahRoda);
        auto_car_rpl mio = new auto_car_rpl(rodaList ,"4 tak", setirMotor, fuel) {
            
        };

        mio.displayRoda();
        mio.displaySetir();
        mio.displayFuel();
        mio.start();
        mio.drive();
    }
}

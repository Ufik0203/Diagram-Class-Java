/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertdiagram;

/**
 *
 * @author mario
 */
public class mesin {

    private String tipeMesin;

    public mesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void startMesin() {
        System.out.println("Mesin " + tipeMesin);
    }
}

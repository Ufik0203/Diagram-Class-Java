/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertdiagram;

/**
 *
 * @author mario
 */
abstract class fuel implements transportasi {
        @Override
    public void bahan_bakar() {
        System.out.println("Menggunakan pertalie.");
    }

    @Override
    public void kecepatan() {
        System.out.println("Kecepatan maksimum 350 km/jam.");
    }
}

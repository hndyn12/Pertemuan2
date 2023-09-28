/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author X1
 */
public class game {
    public static void main(String[] args) {
        Player petani = new Player();
        
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthpoin = 100;
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
}

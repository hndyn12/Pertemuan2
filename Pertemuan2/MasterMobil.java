/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author X1
 */
public class MasterMobil {
    
    String warnamobil = "Merah";
    String merkmobil = "Toyota";
    int tahunmobil = 2020;
    
    public void berjalan(){
        System.out.println("Mobil Sedang berjalan");
    }
    public void berhenti(){
        System.out.println("Mobil Sedang berhenti");
    }
    public static void main(String[] args) {
    //buat objec mastermobil
    MasterMobil mobil = new MasterMobil();
    mobil.berjalan();
    mobil.berhenti();
    }
    }

    
    

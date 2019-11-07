/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan55.handphone;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : handphone
 */
public class Handphone {
    protected String  manufacture, operatingSystem, model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
        manufacture = man;
        operatingSystem = os;
        this.model = model;
        this.harga = harga;      
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operatingSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
}

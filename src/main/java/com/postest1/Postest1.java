/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.postest1;

import java.util.ArrayList; 

public class Postest1 {

    public static void main(String[] args) {
        kedaiseblak seblak1= new kedaiseblak("Seblak Bakso","Cesa", 16000, 1);
        kedaiseblak seblak2= new kedaiseblak("Seblak Mie","Jeno", 12000, 2);
        kedaiseblak seblak3= new kedaiseblak("Seblak Biasa","Jaemin", 10000,3);
        kedaiseblak seblak4= new kedaiseblak("Seblak Sosis","Mark", 13000,4);
        kedaiseblak seblak5= new kedaiseblak("Seblak Ceker","Jay", 14000,1);
        kedaiseblak seblak6= new kedaiseblak("Seblak Spesial","Heesung", 18000,1);
        kedaiseblak seblak7= new kedaiseblak("Seblak Cilok","Ningning", 13000,2);
        
        
        ArrayList<kedaiseblak> beli = new ArrayList<>();
        beli.add(seblak1);
        beli.add(seblak2);
        beli.add(seblak3);
        beli.add(seblak4);
        beli.add(seblak5);
        beli.add(seblak6);
        beli.add(seblak7);
        
        System.out.println("============ DATA PEMESANAN SEBLAK HARI INI ====================");
        for (kedaiseblak datapembelian: beli){
            System.out.println(" \nNama seblak: " + datapembelian.Namaseblak + "\nNama pembeli: " 
                    + datapembelian.Namapelanggan +"\nHarga: Rp"+datapembelian.Harga + "\nJumlah pembelian: " 
                    + datapembelian.Jumlahpembelian);
            
        }
        System.out.println("=================================================================");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mhs
 */
public class BelajarClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //input data
        System.out.print("Masukkan merk : ");
        String merk = br.readLine();
        System.out.print("Masukkan tipe : ");
        String tipe = br.readLine();
        System.out.print("Masukkan warna : ");
        String warna = br.readLine();
        
        //membuat object dari class mobil
        Mobil mb = new Mobil();
        
        //setter
        mb.setMerk(merk);
        mb.setTipe(tipe);
        mb.setWarna(warna);
        
        //getter
        System.out.println("---------------------");
        System.out.println(mb.getMerk());
        System.out.println(mb.getTipe());
        System.out.println(mb.getWarna());
    }
    
}

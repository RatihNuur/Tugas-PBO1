/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class OopE {
    
    public static void main(String[] args) {
        
        Rectangle persegipanjangA = new Rectangle();
        persegipanjangA.lebar = 5;
        persegipanjangA.panjang = 7;
        System.out.println("Luas Persegi Panjang A adalah"+persegipanjangA.getLuas());
        System.out.println("Keliling Persegi Panjang A adalah"+persegipanjangA.getKeliling());
       
        circle lingkaranA = new circle();
        lingkaranA.jarijari=7;
        System.out.println("Luas Lingkaran adalah "+lingkaranA.getLuas());
        System.out.println("Keliling Lingkaran adalah "+lingkaranA.getKeliling());
        
        square kotakA = new square ();
        kotakA.sisi=8;
        System.out.println("Luas Persegi adalah"+kotakA.getLuas());
        System.out.println("Keliling Persegi adalah"+kotakA.getKeliling());
        
        ellips ovalA = new ellips ();
        ovalA.a=7;
        ovalA.b=14;
        System.out.println("Luas oval adalah "+ovalA.getLuas());
        System.out.println("Keliling oval adalah"+ovalA.getKeliling());
    }
    
}

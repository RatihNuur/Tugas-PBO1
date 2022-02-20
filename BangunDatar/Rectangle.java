/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class Rectangle {
     public int panjang;
     public int lebar;
    
    public int getLuas(){
            return this.lebar*this.panjang;
    
}
    public int getKeliling (){
        return this.lebar*2+this.panjang*2;
    }
}

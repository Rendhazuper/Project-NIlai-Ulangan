/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.util.Scanner;

/**
 *
 * @author GAMES
 */
public class Ulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai; 
        
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan nilai kamu :") ;
        nilai = input.nextInt();
        
        
        if (nilai < 75){
            System.out.println("Nilai kamu dibawah KKM, BELAJAR LAGI YA !!");
            
        }else if (nilai == 100){
            System.out.println("Hebat nilai mu sempurna dan diatas KKM, PERTAHANKAN!!");
            
        }else{
            System.out.println("Selamat nilai kamu diatas KKM");
        }
    
}

}

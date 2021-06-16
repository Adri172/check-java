/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tuf Gaming
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner scan = new Scanner(System.in);
         int sum,a,b;
         System.out.println("masukan a : ");
         a = scan.nextInt();
         System.out.println("masukan b : ");
         b = scan.nextInt();
         sum = a+b;
         for (int i = 0; i < 10; i++) {
             System.out.println("penjumlahan ke "+i+sum);
             i = scan.nextInt();
            
                 
             }
            
        }
       
        
       
        
        
        // TODO code application logic here
    }
    


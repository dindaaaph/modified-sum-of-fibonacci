/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner d = new Scanner (System.in);
	System.out.println ("Masukkan Angka : ");
	
	int b =0;
	int c =1;
	int a =d.nextInt();
	for(int i =1 ; i<=a; i++){
	System.out.print(c+" ");
	c=c+b;
	b=c-b;
	}
    }
        
    
}

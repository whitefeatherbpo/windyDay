package com.mavenWindyTownNice;

public class DollarSquareLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=4;i++) {
			if (i==1 || i==4) {
				for (int j=1;j<=4;j++)
					System.out.print("$ ");
				System.out.println();
			}
			
			else {
				System.out.println("$     $");
			}
		}

	}

}
/*
 * for (int a = 1; a <= 4; a++) { 
 *          if (a == 1 || a == 4) {
 *              for (int i = 1; i <=4; i++) 
 *              System.out.print("$ "); 
 *              System.out.println(); } 
 *              
 *              else {
 *                System.out.println("$     $");
 */
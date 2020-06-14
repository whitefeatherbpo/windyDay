package com.mavenWindyTownNice;

public class SquareDollar {

	public static void main(String[] args) {
		
		  
		        int x = 1;
		        do{
		            if(x == 1 || x == 4){
		         for(int y = 1; y <= 4; y++){
		                    System.out.print("$");
		         }
		         System.out.println();
		            }else{
		        if (x == 2 || x == 3){
		                    for(int y = 1; y <= 4; y++){
		          if (y == 2 || y == 3){
		                            System.out.print("");
		          }else{
		                            System.out.print("$");
		          }
		                    }
		                    System.out.println();
		                }
		            }
		            x = x + 1;
		        }while (x <= 4);
		    }

	}



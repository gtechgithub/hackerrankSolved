package com;


import java.util.*;
import java.io.*;
import java.math.*;
/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {
    private static void formArray(char [] filledArray,String [][]  finalArray,
         int j, int width){
    
     for (int i = 0; i < width; i++) {
       finalArray[j][i] =  Character.toString(filledArray[i]);
     }
    }
    
    
    private static String printNeighbour(String [] [] finalArray, int i , int j, int width, int height) {
        
        
        int widthVal  = j +1;
        int heightVal = i +1;
            
        String finalNode = j + " " + i;     
        String rightNode = "-1 -1";    
        String downNode = "-1 -1";
        
		for (int k = widthVal; k < width; k++) {
			if (widthVal < width && finalArray[i][k].equals("0")) {
				rightNode = k + " " + i;
				break;
			} else {
				continue;
			}
		}
        
		for (int k = heightVal; k < height; k++) {

			if (heightVal < height && finalArray[k][j].equals("0")) {
				downNode = j + " " + k;
				break;

			} else {
				continue;
			}
		}
        
        return finalNode + " " + rightNode + " " + downNode;
        
        
    }
    
    private static void printFinalArray(String array[][],int width, int height) {
    	
    	for (int i = 0; i < height; i++) {
    		for (int j  = 0; j < width; j++) {
    			System.err.print(array[i][j]);
    		}
    		System.err.println();
    	}
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // width - 5 height - 1
        // 0.0.0

        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        String [] [] finalArray = new String[height][width];
        
        System.err.println("width:" + width + " height:" + height );
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            
            char [] filledArray = line.toCharArray();
            
            formArray(filledArray, finalArray, i, width);
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        printFinalArray(finalArray,width,height);
        
        for (int i =0; i < height; i++){
             for (int j=0 ; j < width ; j++) {
                if (finalArray[i][j].equals("0")) { 
                	System.out.println(printNeighbour(finalArray, i, j, width, height));
                }
               
             }
        }     
        // Three coordinates: a node, its right neighbor, its bottom neighbor
        //System.out.println("0 0 1 0 0 1");
        
        
   
    }
}

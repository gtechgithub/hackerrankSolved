package com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStrings {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	//eg: string is aba and n is 10, which means aba is repeated until 10 length
    	//find number of a in 10 length 
    	
    	//step1 find the number of a in the String s, which is 2
    	int asIndex = 0;
    	int countOfAs = 0;
    	
    	while ((asIndex = s.indexOf("a",asIndex)) >=0) {
    		
    			asIndex = asIndex + 1;
    		countOfAs++;
    	}
    	
    	
    	//step2 find the Quotient eg aba which is 3, divide n / 3, which fetches 3
    	long quotient = n / s.length();
    	
    	
    	//step3 number of a in string s * Quotient, which is 2 * 3
        long countOfAsFinal = 0;
        countOfAsFinal = countOfAs * quotient;
    	
    	//step4 find the remainder eg aba which is 3, divide n % 3, which fetches 1
        long remainder = n % s.length();
        
    	
    	//step5 from step 4, the remainder value iterate and count for number of a's
    	for ( int  i =0; i < remainder ; i++) {
    		
    		for( int j =0; j< s.toCharArray().length && j<remainder; j++) {
    			if (s.toCharArray()[j] == 'a') {
    				countOfAsFinal++;
    		 }
    			i++;
    		}
    	}
    	
    	
    	
    	return countOfAsFinal;

    }

     
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println("result"+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

package com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingCloudProblem {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {


    	int countsteps = 0;
    	for(int i =0 ; i < c.length-1;) {

    		
    		if ( (i+2 < c.length) && (c[i+2] == 0)) {
    			i = i+2;
    		}
    		else {
    			i = i+1;
    		}
    		++countsteps;
    	}

    	
    	return countsteps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println("result:" + result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

OUTPUT
-------

Input (stdin)
7
0 0 1 0 0 1 0

Expected Output
4


Input (stdin)
6
0 0 0 1 0 0

Expected Output

Input (stdin)
10
0 0 1 0 0 0 0 1 0 0

Expected Output
6

Input (stdin)
2
0 0
Expected Output
1



3

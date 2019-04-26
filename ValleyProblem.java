package com;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValleyProblem {

	    // Complete the countingValleys function below.
	    static int countingValleys(int n, String s) {
		
			
			//convert string to list
			List<Character> myListOfCharacters  = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

			int count = 0;
			int numofValles =0;
			for(int i  = 0 ; i < myListOfCharacters.size() ; i++) {
					if (myListOfCharacters.get(i).equals('U')) {
						++count;
					}
					else if (myListOfCharacters.get(i).equals('D')) {
						--count;
					}
					
					// if we just came UP to sea level
		            if(count == 0 && myListOfCharacters.get(i) == 'U')
		            	++numofValles;
			}
			
	       return numofValles;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);

	        System.out.println("result:" + result);
//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();

	        scanner.close();
	    }

}


output
-------
i/p:

12
DDUUDDUDUUUD

o/p:
2


i/p:
8
UDDDUDUU


o/p:
1

package com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

    	
    	List<Integer> socks = Arrays.stream(ar)		// IntStream
				.boxed()  		// Stream<Integer>
				.collect(Collectors.toList());
    	
    	Map<Integer, Long> socksStatic = socks.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    	
    	System.out.println("socksStatic:"+ socksStatic);
    	
    	long pairOfSock = 0;
    	
    	for (Map.Entry<Integer, Long> sockEntry : socksStatic.entrySet()) {
    		pairOfSock = pairOfSock + sockEntry.getValue() / 2;
    	}
    	
    	return (int) pairOfSock;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println("pair of socks:" + result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}



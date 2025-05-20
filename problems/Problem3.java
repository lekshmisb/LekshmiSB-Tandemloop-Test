package problems;

import java.util.Scanner;

public class Problem3 
{
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a: ");
	        int a = sc.nextInt();

	        int length = a % 2 == 0 ? a - 1 : a;

	        for (int i = 0; i < length; i++) {
	            int val = 2 * i + 1;
	            if (val > (2 * length - 1)) break;
	            System.out.print(val);
	            if (i < length - 1) System.out.print(", ");
	        }
	    }

}

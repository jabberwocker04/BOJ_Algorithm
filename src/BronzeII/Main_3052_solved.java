package BronzeII;

import java.util.Arrays;
import java.util.Scanner;

public class Main_3052_solved {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
				        int count=1;
						int[] result = new int[10];
						for(int i=0; i<result.length; i++) {
							int a = sc.nextInt();
							result[i] = a%42;
							}
						Arrays.sort(result);
				        for(int i=0; i<9; i++) {
				            if(result[i]!=result[i+1]) {
				                count++;
				            }
				        }
				        System.out.println(count);
						}
				    }
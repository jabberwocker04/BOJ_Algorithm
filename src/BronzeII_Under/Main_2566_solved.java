package BronzeII_Under;

import java.util.Scanner;

public class Main_2566_solved {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int[][] arrays = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int in=sc.nextInt();
				arrays[i][j] = in;
			}
		}
		
		int max = 0;
		int a=0, b=0;
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
			if(arrays[i][j]>max) {
				max = arrays[i][j];
				a=i+1; b=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(a+" "+b);
		}
	}
	

package BronzeII;

import java.util.Scanner;

public class Main_2577_solved {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a * b * c;
		
		for(int i=0; i<array.length; i++) {
			int count = 0;
		int temp = result;
		
		while(temp !=0) {
		if(temp%10 == array[i]) {
			count++;
		}
			temp = temp / 10;
			}
		System.out.println(count);	
			}
		}
    }
package BronzeII_Under;

import java.io.*;
import java.util.Scanner;

public class Main_2576 { // 홀수

	public static void main(String[] args) throws NumberFormatException, IOException {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//선언
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int odd[] = new int[7];
		int min = Integer.MAX_VALUE; // 정수의 값에 임의의 최대값을 넣어주는 메쏘드
		
		for(int i=0; i<odd.length; i++) {
			odd[i] = sc.nextInt(); // 홀수 넣음
			if(odd[i] % 2 >= 1) { // 홀수 판별
				sum = sum+odd[i];
				if(min > odd[i]) {
					min = odd[i]; // 최소 홀수 입력
				}
			}
		} 
		if(sum == 0) { // 0이면 조건대로 출력
			sum = -1 ; 
			System.out.println(sum);
		} else if ( sum != 0) { // 0이 아닐 때 합과 최소홀수 출력
		System.out.println(sum);
		System.out.println(min);		
		}
	}
}

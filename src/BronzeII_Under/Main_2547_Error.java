package BronzeII_Under;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_2547_Error {

	public static void main(String[] args) throws IOException {
		int T, N, Candy;//Test case || 학생수 || 각각 사탕갯수
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//T = br.read(); // Test Case 횟수 입력
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();
		
		int sum=0;
		String answer=null;
			for(int i=0; i<T; i++) {
			//	N = br.read(); // T별 학생 수 입력
				N = sc.nextInt();
					for(int j=0; j<N; j++) {
					//	Candy = br.read(); // N명의 각 학생별로 Candy수 입력
						Candy = sc.nextInt();
						sum = sum + Candy;
					}
			if((sum/N)*N==sum) {
				answer = "YES";
			} else
				answer = "NO";
		System.out.println(answer);
		}
		
	}

} // BOJ 제출 시 컴파일에러 && 런타임에러가뜬다 왜그런지 공부해야 할 듯.

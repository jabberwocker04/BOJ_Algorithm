package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1676_notsolved {

	public static void main(String[] args) throws Exception {// 팩토리얼 0의 개수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int result = 1;
		for(int i=1; i<a+1; i++) {
			result = result*i; // 팩토리얼
		}
		
		System.out.println(result);
		
	}
}

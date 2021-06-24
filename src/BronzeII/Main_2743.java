package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2743 { // 10초컷 문제, BufferedReader 를 아는지 확인
	// https://www.acmicpc.net/blog/view/56
	public static void main(String[] args) throws IOException {
		 	
	//알파벳 입력후 길이 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String a = br.readLine();
		
		System.out.println(a.length());
	}
}

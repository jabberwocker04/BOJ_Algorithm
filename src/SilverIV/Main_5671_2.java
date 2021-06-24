package SilverIV;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_5671_2 {

	public static void main(String[] args) throws Exception{
		
		while(true) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int temp = 0; // count
		
		int result = 0;
		for(int i=a; i<=b; i++) {
			String ab = Integer.toString(i);
			String[] ab_array = ab.split(""); // 배열에 숫자를 넣어줌 ex)i=88 -> ab_array=[8, 8]
			
			/*
			 if(ab_array[0].equals(ab_array[1])) {
				temp ++;
			}
			*/
			for(int j=0; j<ab_array.length; j++) { // 중복검사 시작 ab_array의 첫번째 배열부터 검사
				boolean asdf;
				for(int k=j+1; k<ab_array.length; k++) { // 브루탈포스?
				
					} // 숫자 안에서 중복된 쌍둥이 숫자가 있는가?
				 
				} // 브루탈포스 검사 끝
			} // 중복검사끝
			
			result = b-a-temp;
		System.out.println(result+1);
		}
		
		} // 무한반복
	}


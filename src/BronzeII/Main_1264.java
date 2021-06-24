package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1264 {

	public static void main(String[] args) throws IOException {

		String in;
		String arrays[];
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		while(true) {
			in = br.readLine(); // 입력
			String[] inin; // 배열로 만들어줄 스트링배열
			if(in.equals("#")) { // #입력되면 
				System.exit(0); // 시스템 종료
			}
			
			inin = in.toLowerCase().split(""); //in배열 소문자로 초기화 및 inin배열에 삽입
			
			for(int i=0; i<in.length(); i++) { // 카운트 증가용 반복 시작
				if(inin[i].equals("a") || inin[i].equals("e")
					||	inin[i].equals("i") || inin[i].equals("o")
					|| inin[i].equals("u")){ // a랑 같으면
					count++; // 카운트 증가
				}
			}
			
			System.out.println(count); // count 갯수 출력
			count = 0; // count를 0으로 초기화
		}
	}
}

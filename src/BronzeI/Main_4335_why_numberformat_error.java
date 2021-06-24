package BronzeI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4335_why_numberformat_error {

	public static void main(String[] args) throws Exception {
		//거짓말하면 stans is dishonest 출력
		//거짓말이 없었으면 stan may be honest 출력
		//수는 1보다 크거나 같고, 10보다 작거나 같다
		int[] lie = new int[11]; 
		while( true ) { // 게임시작 및 반복
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());		
			if(a == 0) {
					break;
			}
			
			String stanshorse = br.readLine();
				
			if(stanshorse.equals("too high")) {
				for(int i=a; i<11; i++) {
				lie[i]++;
				}	
			}
			
			if(stanshorse.equals("too low")) {
				for(int i=a; i>0; i--) {
				lie[i] ++;			
				}
			}
			
			if(stanshorse.equals("right on")) {
				if(lie[a] >= 1) {
					System.out.println("Stan is dishonest");
					} else if(lie[a] == 0) {
						System.out.println("Stan may be honest");
					}
			}
			
		}
		
		
	}
}

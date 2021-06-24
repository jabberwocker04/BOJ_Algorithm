package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4641 { // Doubles

	public static void main(String[] args) throws IOException {
		//2~15개의 서로 다른 자연수 리스트
		//정확히 2배인 수가 있는 수의 개수를 구하기
		//0 입력시 거기서 입력 종료
		//-1입력시 프로그램 종료
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		while(true) {
			int count = 0;
			String[] a = br.readLine().split(" ");
			
			if(a[0].equals("-1")) {
				System.exit(0);
			}
			
			int list[] = new int[16];
			for(int i=0; i<a.length -1; i++) {
				list[i] = Integer.parseInt(a[i]);
			}
			Arrays.sort(list);
			
			
			
			for(int i=0; i<16; i++) {
				for(int j=0; j<16; j++) {
					if(list[i] == 0 || list[j] ==0) {
						continue;
					}
					if(list[i] == list[j] *2)
						count++;
				}
			}
			System.out.println(count);
			}
		}
	}

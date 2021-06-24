package today_solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_2578 { // ¸øÇ°
	static int Bingo[][];
	static int Line = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Bingo = new int [5][5];
		int Bingo2[];
		//ºù°í1 ¹è¿­ ÀÎÇ²
		for(int i=0; i<Bingo.length; i++) {
			String a = br.readLine();
			for(int j=0; j<Bingo[i].length; j++) {
				String[] temp = a.split(" ");
				Bingo[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
		for(int k=1; k<=25; k++) {
			Bingo2[k] = sc.nextInt();
			//ºù°í2 ÀÔ·Â && ºñ±³
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
					if(Bingo[i][j] == Bingo2[k]) {
						Bingo[i][j] = 0;
			}
		}
				
		_check();
		lCheck();
		L_R();
		R_L();
		
		
		if(Line >=3) {
			System.out.println(k);	
			break;
		}
		
		Line = 0;
		}
	}
	
	
	
	public static void _check() {
		for(int i=0; i<5; i++) {
			int count = 0;
			for(int j=0; j<5; j++) {
				if(Bingo[i][j] == 0) count ++;
			}
			if(count == 5) Line++;
		}
	}
	public static void lCheck() {
		for(int i=0; i<5; i++) {
			int count = 0;
			for(int j=0; j<5; j++) {
				if(Bingo[j][i] == 0) count ++;
			}
			if(count == 5) Line++;
		}
	}
	public static void L_R() {
		int count = 0;
		for(int i=0; i<5; i++) {
				if(Bingo[i][i] == 0) count ++;
		}
			if(count == 5) Line++;
	}
	public static void R_L() {
		int count = 0;
		for(int i=0; i<5; i++) {
				if(Bingo[i][4-i] == 0) count ++;
		}
				if(count == 5) Line++;
	}
	
	
}
	

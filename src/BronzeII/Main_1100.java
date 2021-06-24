package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_1100 {

	public static void main(String[] args) throws IOException {
				
		//체스판은 8*8 검하검하 가장 왼쪽 위칸은 (0,0)은 하얀색
		//체스판의 상태가 있으면 하얀칸위에 말이 몇개인지 count++
		//'.'은 빈 칸 | 'F'는 말이 있는  칸
		//0,0은 하얀색 0,2는 하얀색 1,1은 하얀색 1,3은 하얀색
		String[][] chess = new String [8][8];
		int count = 0;
		String key = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<chess.length; i++) {
			String[] str = br.readLine().split(""); // 한줄 전체 입력받은 후 ""를 기준으로 나눠줌
			for(int j=0; j<chess.length; j++) {
			chess[i][j] = str[j]; // i=0이고 j=0~chess.length까지 한줄로 입력받고 나눠준 String을 나눠줌
			}
		}
		
		for(int i=0; i<chess.length; i++) {
			for(int j=0; j<chess.length; j++) {
				if((i+j)%2 == 0 && chess[i][j].equals("F")){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

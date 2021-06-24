package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main_5533 { // 유니크

	public static void main(String[] args) throws IOException {
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int People= Integer.parseInt(br.readLine());//사람 수
		
		int[][] score = new int[(People)][3];
		
		for(int i=0; i<People; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<People; i++) {
			for(int j=0; j<3; j++) {
				
				int sw=0;//판단스위치
							
				for(int k=0; k<People; k++) {
					if(i != k && score[i][j] == score[k][j]) {
						score[k][j]=0;
						sw=1;
					}
				}
				if(sw==1) {
					score[i][j] = 0;
				}
			}
			System.out.println(score[i][0]+score[i][1]+score[i][2]);
		}			
	}
}

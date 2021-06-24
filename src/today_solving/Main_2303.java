package today_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main_2303 {
	static int Combination_zumsu;
	public static void main(String[] args) throws Exception { //아직 못품(05.30)
		//N명이 숫자게임
		//각 사람에게 1~10사이의 수가 적힌 5개의 카드
		//세장의 합을 골라 일의 자리수가 가장 큰 사람이 이김
		// 세장의 카드가 7,8,10인경우 25가되고 일의자리수는 5임
		// 다른놈이 7 5 5 4 9 인 경우 7 4 9를 선택하면
		//합이 20이 되어 일의 자리 수는 0이 되고 5 5 9를 선택하면 19가 되어 일의 자리 수는 9가 된다
		// 이기려면 일의자리 수가 가장 커야한다(9가 제일 강함)
		
		//예를 들어 N이 3일 때 7 5 5 4 9 | 1 1 1 1 1 | 2 3 3 2 10 이면
		//1번 사람은 5 5 9 에서 9 | 2번사람은 1 1 1 에서 3 | 3번사람은 2 3 3 에서 8
		//->첫번째가 이긴다. 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] score = new int [N][5];
		
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max_value = 0;
		int[][] score_save = new int[N][10];
	
		for(int i=0; i<N; i++) { // N명의 2차원 배열
			for(int a=0; a<10; a++) {
			for(int j=0; j<5; j++) { // 5개 카드중 3개 조합으로 최대값 구할것임 || 이것은 첫번째 것
				
				for(int k=j+1; k<5; k++) { // 5개 카드중 3개의 조합중 2번째 고른 것
					
					for(int l= k+1; l<5; l++) { // 5개 카드중 3개의 조합중 3번째로 고른 것
						
					score_save[i][j] = ((score[i][j] + score[i][k] + score[i][l]) % 10);
					System.out.print("score_save["+i+"]["+a+"]는"+score_save[i][a]+"입니다.");
					
					System.out.println("끊기");
					} // l
					
					
				}
				
				}
			if(max_value<score_save[i][a]) {
				max_value = i;
			}
		}
		}
		for(int i=0; i<score_save.length; i++) {
			
			for(int j=0; j<score_save[i].length; j++) {
		System.out.print(score_save[i][j]+" ");	
			}
			System.out.println("");}
		
	}
}

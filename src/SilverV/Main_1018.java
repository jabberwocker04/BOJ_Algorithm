package SilverV;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1018 {

	public static void main(String[] args) throws Exception { // 05.24
		//MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드
		//검은색, 흰색으로 칠해져 있음 이 M*N을 잘라서 8*8크기의 체스판 만들기
		//체스판처러 검흰검흰 번갈아서 칠해짐
		//(0,0)이 흰색인 경우 || (0,0)이 검은색인 경우
		//M*N에서 최대한 비슷한 8*8을 떼어낸 후 
		//몇개의 정사각형을 다시 칠해야겠다고 생각함.
		//다시 칠할 정사각형의 최소 개수를 구하는 프로그램
		
		//N,M>=8 || N,M<=8 
		//둘째줄부터 N개의 줄에는 보드의 각 행 상태가 주어진다.
		//B는 검은색 W는 흰색이다
		int value = Integer.MIN_VALUE;
		String[][] firstW = new String[8][8];
		
		for(int i=0; i<firstW.length; i++) {
			for(int j=0; j<firstW[i].length; j++) {
				if( (i+j)%2 ==0 ) {
					firstW[i][j] = "W";
				} else if ( (i+j)%2 == 1) {
					firstW[i][j] = "B";
				
				}
			}
		}
		
		String[][] firstB = new String[8][8];
		
		for(int i=0; i<firstB.length; i++) {
			for(int j=0; j<firstB[i].length; j++) {
				if( (i+j)%2 ==0 ) {
					firstB[i][j] = "B";
				} else if ( (i+j)%2 == 1) {
					firstB[i][j] = "W";
				
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int g = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		String Chess[][] = new String [g][s];

		//2차원 배열 인풋
		for(int i=0; i<Chess.length; i++) {
			String a = br.readLine();
			for(int j=0; j<Chess[i].length; j++) {
				String[] temp = a.split("");
				Chess[i][j] = temp[j];
			}
		}
		
	/*
		for(int i=0; i<g; i++) {
		System.out.println("");
			System.out.print(Arrays.toString(firstB[i])); ;
		}
	 */
		
		
		int AnswerB[][] = new int[g-7][s-7];
		int AnswerW[][] = new int[g-7][s-7];
		
		int Whitemin = Integer.MAX_VALUE, Blackmin = Integer.MAX_VALUE;
		int count = 0;
		
		for(int h=0; h<AnswerB.length; h++) {
		for(int i=0; i<AnswerB[h].length;i++) { // 블랙 체스판을 탐색	
					for(int l=0; l<8; l++) {
						for(int m=0; m<8; m++) {
					
					if(Chess[l+h][m+i].equals(firstB[l][m])) {
						count  ++ ;
					}		
					
				} // m
			} // l
			AnswerB[h][i] =  count;	
			count = 0;	
			if(Blackmin>AnswerB[h][i]) {
				Blackmin = AnswerB[h][i];
			}
		} // i
	} // h
		
		for(int h=0; h<AnswerW.length; h++) {
			for(int i=0; i<AnswerW[h].length;i++) { // 화이트 체스판을 탐색	
						for(int l=0; l<8; l++) {
							for(int m=0; m<8; m++) {
						
						if(Chess[l+h][m+i].equals(firstW[l][m])) {
							count  ++ ;
						}		
						
					} // m
				} // l
				AnswerW[h][i] =  count;	
				count = 0;
				if(Whitemin>AnswerW[h][i]) {
					Whitemin = AnswerW[h][i];
				}
			} // i
		} // h
		
	/*
	for(int i=0; i<AnswerW.length; i++) {
		for(int j=0; j<AnswerW[i].length; j++) {
			System.out.print(AnswerW[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.println("위는 화이트 아래는 블랙");
	
	for(int i=0; i<AnswerB.length; i++) {
		for(int j=0; j<AnswerB[i].length; j++) {
			System.out.print(AnswerB[i][j]+" ");
		}System.out.println("");
	}
	*/
	if(Blackmin<Whitemin)	{
		System.out.println(Blackmin);
	} else
		System.out.println(Whitemin);
	
	}
}

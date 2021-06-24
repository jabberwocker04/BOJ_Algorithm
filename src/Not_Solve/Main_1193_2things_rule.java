package Not_Solve;

import java.util.Scanner;

public class Main_1193_2things_rule {

	public static void main(String[] args) {
			
		//무한히 큰 2차원 배열
		//열은 분모가 커지고 행은 분자가 커짐
		// 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 ->
		// … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수
		// X번째 분수는 무엇인가?
		
		Scanner sc = new Scanner(System.in);
		int X;
		
		
		/*
		X = sc.nextInt()+1;
		String bunsu[][] = new String[X+1][X+1]; // [X}행[X]열의 2차원 배열 만들어짐.

		
		for(int i=1; i < bunsu.length; i++) { // 무한배열
			for(int j=1; j < bunsu.length; j++) {
				bunsu[i][j] = Integer.toString(i)+"/"+Integer.toString(j);
				//bunsu[i][j] = Integer.toString(i);
			}
		}
		
		
		for(int i=1; i<X; i++) { // 무한배열 출력
			System.out.println("");
			for(int j=1; j<X; j++) {
				System.out.print(bunsu[i][j]+" ");
			}
		}
		System.out.println();
		 */
		
		
		//==================================================//
		
		
		X = sc.nextInt();
		int line = 0;
		int count = 0;
		while (count < X) {
			line++;
			count = line * (line + 1) / 2; // 등차수열
		}

		if (line % 2 == 0) {
			int bunza = line - (count - X);
			int bunmo = 1 + (count - X);
			System.out.println(bunza + "/" + bunmo);

		} else {
			int bunza = 1 + (count - X);
			int bunmo = line - (count - X);
			System.out.println(bunza + "/" + bunmo);
		}
	
	
	
	}
}


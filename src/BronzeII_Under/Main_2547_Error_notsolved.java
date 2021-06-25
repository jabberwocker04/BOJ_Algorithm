package BronzeII_Under;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_2547_Error_notsolved {

	public static void main(String[] args) throws IOException {
		int T, N, Candy;//Test case || �л��� || ���� ��������
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//T = br.read(); // Test Case Ƚ�� �Է�
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();
		
		int sum=0;
		String answer=null;
			for(int i=0; i<T; i++) {
			//	N = br.read(); // T�� �л� �� �Է�
				N = sc.nextInt();
					for(int j=0; j<N; j++) {
					//	Candy = br.read(); // N���� �� �л����� Candy�� �Է�
						Candy = sc.nextInt();
						sum = sum + Candy;
					}
			if((sum/N)*N==sum) {
				answer = "YES";
			} else
				answer = "NO";
		System.out.println(answer);
		}
		
	}

} // BOJ ���� �� �����Ͽ��� && ��Ÿ�ӿ�������� �ֱ׷��� �����ؾ� �� ��.

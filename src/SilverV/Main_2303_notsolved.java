package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main_2303_notsolved {
	static int Combination_zumsu;
	public static void main(String[] args) throws Exception { //���� ��ǰ(05.30)
		//N���� ���ڰ���
		//�� ������� 1~10������ ���� ���� 5���� ī��
		//������ ���� ��� ���� �ڸ����� ���� ū ����� �̱�
		// ������ ī�尡 7,8,10�ΰ�� 25���ǰ� �����ڸ����� 5��
		// �ٸ����� 7 5 5 4 9 �� ��� 7 4 9�� �����ϸ�
		//���� 20�� �Ǿ� ���� �ڸ� ���� 0�� �ǰ� 5 5 9�� �����ϸ� 19�� �Ǿ� ���� �ڸ� ���� 9�� �ȴ�
		// �̱���� �����ڸ� ���� ���� Ŀ���Ѵ�(9�� ���� ����)
		
		//���� ��� N�� 3�� �� 7 5 5 4 9 | 1 1 1 1 1 | 2 3 3 2 10 �̸�
		//1�� ����� 5 5 9 ���� 9 | 2������� 1 1 1 ���� 3 | 3������� 2 3 3 ���� 8
		//->ù��°�� �̱��. 
		
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
	
		for(int i=0; i<N; i++) { // N���� 2���� �迭
			for(int a=0; a<10; a++) {
			for(int j=0; j<5; j++) { // 5�� ī���� 3�� �������� �ִ밪 ���Ұ��� || �̰��� ù��° ��
				
				for(int k=j+1; k<5; k++) { // 5�� ī���� 3���� ������ 2��° �� ��
					
					for(int l= k+1; l<5; l++) { // 5�� ī���� 3���� ������ 3��°�� �� ��
						
					score_save[i][j] = ((score[i][j] + score[i][k] + score[i][l]) % 10);
					System.out.print("score_save["+i+"]["+a+"]��"+score_save[i][a]+"�Դϴ�.");
					
					System.out.println("����");
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

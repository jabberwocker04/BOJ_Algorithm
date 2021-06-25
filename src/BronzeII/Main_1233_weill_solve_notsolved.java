package BronzeII;

import java.util.Scanner;

public class Main_1233_weill_solve_notsolved {

	public static void main(String[] args) {

		//3���� �ֻ��� S1,S2,S3|| 2 =< S1 =< 20 || 2 =< S2 =< 20
		//2 =< S3 =< 40 || ���� ���� �󵵷� ������ �� �ֻ����� ��
		//ex) S1=3, S2=2, S3=3 -> S1�� 3���� ���� �����Ƿ� (1,2,3)
		// S2 -> 2�̹Ƿ� 2���� ��(1,2)
		// S3 -> 3�̹Ƿ� 3���� ��(1,2,3) �� �ֻ������� ���� ����
		// 1,1,1 / 1,1,2, 1,1,3 ... 3,2,1, 3,2,2, 3,2,3 �� ���� ��
		//�̿� ���� ���� ���� �߻��ϴ� ���� ����?
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int a_1[] = new int[a], b_1[] = new int[b], c_1[] = new int[c];
		
		for(int i=0; i<=a; i++) {
			if(a_1.length >= i+1){
				a_1[i] = i;
			}
		}
		for(int i=0; i<=b; i++) {
			if(b_1.length >= i+1) {
				b_1[i] = i;
				}
		}
		for(int i=0; i<=c; i++) {
			if(c_1.length >= i+1) {
				c_1[i] = i;
				}
		} // �迭�� ��� ���� �־��ֱ�.
			
		int sum[];
		for(int i=0; i<a_1.length; i++) {
			System.out.print(a_1[i]+1);
			}
		System.out.println("");
		for(int i=0; i<b_1.length; i++) {
			System.out.print(b_1[i]+1);
			}
		System.out.println("");
		for(int i=0; i<c_1.length; i++) {
			System.out.print(c_1[i]+1);
			} // �迭���� �ϼ����־���. 21.04.29 || ����Ž������
		
		for(int i=0; i<a_1.length; i++) {
			for(int j=0; j<b_1.length; j++ ){
				for(int k=0; k<c_1.length; k++) {
					sum[i+j+k]++;
				}
			}
		}
		
		
		}
	}
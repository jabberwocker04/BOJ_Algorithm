package BronzeII;

import java.util.Scanner;

public class Main_1193_2things_rule_solved {

	public static void main(String[] args) {
			
		//������ ū 2���� �迭
		//���� �и� Ŀ���� ���� ���ڰ� Ŀ��
		// 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 ->
		// �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м�
		// X��° �м��� �����ΰ�?
		
		Scanner sc = new Scanner(System.in);
		int X;
		
		
		/*
		X = sc.nextInt()+1;
		String bunsu[][] = new String[X+1][X+1]; // [X}��[X]���� 2���� �迭 �������.

		
		for(int i=1; i < bunsu.length; i++) { // ���ѹ迭
			for(int j=1; j < bunsu.length; j++) {
				bunsu[i][j] = Integer.toString(i)+"/"+Integer.toString(j);
				//bunsu[i][j] = Integer.toString(i);
			}
		}
		
		
		for(int i=1; i<X; i++) { // ���ѹ迭 ���
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
			count = line * (line + 1) / 2; // ��������
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


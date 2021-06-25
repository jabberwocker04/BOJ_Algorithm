package BronzeII_Under;

import java.io.*;
import java.util.Scanner;

public class Main_2576_solved { // Ȧ��

	public static void main(String[] args) throws NumberFormatException, IOException {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//����
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int odd[] = new int[7];
		int min = Integer.MAX_VALUE; // ������ ���� ������ �ִ밪�� �־��ִ� �޽��
		
		for(int i=0; i<odd.length; i++) {
			odd[i] = sc.nextInt(); // Ȧ�� ����
			if(odd[i] % 2 >= 1) { // Ȧ�� �Ǻ�
				sum = sum+odd[i];
				if(min > odd[i]) {
					min = odd[i]; // �ּ� Ȧ�� �Է�
				}
			}
		} 
		if(sum == 0) { // 0�̸� ���Ǵ�� ���
			sum = -1 ; 
			System.out.println(sum);
		} else if ( sum != 0) { // 0�� �ƴ� �� �հ� �ּ�Ȧ�� ���
		System.out.println(sum);
		System.out.println(min);		
		}
	}
}

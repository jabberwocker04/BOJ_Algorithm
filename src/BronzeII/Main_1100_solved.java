package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_1100_solved {

	public static void main(String[] args) throws IOException {
				
		//ü������ 8*8 ���ϰ��� ���� ���� ��ĭ�� (0,0)�� �Ͼ��
		//ü������ ���°� ������ �Ͼ�ĭ���� ���� ����� count++
		//'.'�� �� ĭ | 'F'�� ���� �ִ�  ĭ
		//0,0�� �Ͼ�� 0,2�� �Ͼ�� 1,1�� �Ͼ�� 1,3�� �Ͼ��
		String[][] chess = new String [8][8];
		int count = 0;
		String key = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<chess.length; i++) {
			String[] str = br.readLine().split(""); // ���� ��ü �Է¹��� �� ""�� �������� ������
			for(int j=0; j<chess.length; j++) {
			chess[i][j] = str[j]; // i=0�̰� j=0~chess.length���� ���ٷ� �Է¹ް� ������ String�� ������
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

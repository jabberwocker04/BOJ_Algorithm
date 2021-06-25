package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1264_solved {

	public static void main(String[] args) throws IOException {

		String in;
		String arrays[];
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		while(true) {
			in = br.readLine(); // �Է�
			String[] inin; // �迭�� ������� ��Ʈ���迭
			if(in.equals("#")) { // #�ԷµǸ� 
				System.exit(0); // �ý��� ����
			}
			
			inin = in.toLowerCase().split(""); //in�迭 �ҹ��ڷ� �ʱ�ȭ �� inin�迭�� ����
			
			for(int i=0; i<in.length(); i++) { // ī��Ʈ ������ �ݺ� ����
				if(inin[i].equals("a") || inin[i].equals("e")
					||	inin[i].equals("i") || inin[i].equals("o")
					|| inin[i].equals("u")){ // a�� ������
					count++; // ī��Ʈ ����
				}
			}
			
			System.out.println(count); // count ���� ���
			count = 0; // count�� 0���� �ʱ�ȭ
		}
	}
}

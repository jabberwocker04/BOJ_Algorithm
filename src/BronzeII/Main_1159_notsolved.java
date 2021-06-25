 package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main_1159_notsolved {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		//int a = br.read();
		int a = sc.nextInt(); // �޾ƾ��ϴ� �̸��� ��
		int count = 0; // 5���� �̻����� Ȯ�ο� count
		String b = null; // �̸��� ���� ����
		String b_1; // �迭�̾ƴϰ� ��Ʈ������ �޾ƺ���
		String[] a_1 = new String[a]; // �̸��� ����ŭ �迭����
		String[] c_1 = null;
		for(int i=0; i<a; i++) {
			b = br.readLine(); // �̸��� �켱������ ����
			a_1[i] = b.substring(0,1); // �̸��� ��ü�Ͽ� ù��° ���ڸ� String a_1[]�� ����

			System.out.print(a_1[i]);
		}
		Arrays.sort(a_1); // ù���� �迭�� �޾��� �� �������� �迭����
		b_1 = Arrays.toString(a_1);
		
		for(int i=0; i<a_1.length; i++) {
			for(int j=0; j<a_1.length; j++) {
				if(a_1[i].equals(a_1[j])) {
					count++;
				}
				if(count==5) {
					c_1[i]=a_1[i];
					a_1[i]=null;
					count=0;
				}
			}
		}
		Arrays.sort(c_1);
		System.out.println(c_1);
	}
}
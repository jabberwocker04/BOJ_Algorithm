package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_1871_will_solve_notsolved {

	public static void main(String[] args) throws IOException {
		// ABC-0123(������,�׼���)
		// nice ��ȣ���� ù�κа� �ι�°�κ��� ��ġ�� ���̰� 100�� ���� ����
		//���ڷ� �̷���� ù��° �κ��� ��ġ�� ���ڸ� 26���� ��ó�� �����.
		//ex) ABC�� ��ġ�� 28�̴�.(0*26^2 + 1*26^1 + 2*26^0)
		//�� ABC-0123 �� | 28 - 123 | <= 100 �̱� ������ ���� ��ȣ���̴�.
		//�ڵ��� ��ȣ���� �־����� ���� ��ȣ������ �ƴ��� ���ϴ� ���α׷� �ۼ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bunhopan;
		int Test = Integer.parseInt(br.readLine()); // TestCase �Է�
		for(int i=0; i<Test; i++) {
			
			
			bunhopan = br.readLine();
			
			System.out.println(Integer.parseInt(bunhopan));
			
		}
		
	}
}

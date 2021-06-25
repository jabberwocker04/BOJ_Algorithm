package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1439_solved {

	public static void main(String[] args) throws Exception {
		//�ټ��̴� 0�� 1�θ� �̷���� ���ڿ� S�� ������.
		//S�� �ִ� ��� ���ڸ� ���� ���� ������� �Ѵ�.
		//S���� ���ӵ� �ϳ� �̻��� ���ڸ� ��� ��� ������ ���̴� = 0�� 1��, 1�� 0����
		
		//ex)S=0001100 �̸� �� �������� 1110011
		//4��° ���ڿ����� 5��° ���ڱ��� �������� 1111111 �� �Ǿ 2������ ��� �������ڷ� ���� �� �ִ�.
		//������ ó������ 4������5�������� �������� 00000000�� �Ǿ 1������ ��� �������ڷ� ���� �� �ִ�.
		//���ڿ� S�� �־����� �� �ټ��̰� �ؾ��ϴ� �ּ��ൿȽ��
		//S<1000001
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int count_1 = 0;
		int count_0 = 0;
		String s[] = temp.split("");
		
		if(s[0].equals("0")) {
			count_0 ++;
		} else
			count_1 ++;
		
		for(int i=1; i<s.length; i++) {
			if(s[i].equals(s[i-1])==false) {
				if(s[i].equals("0")) {
					count_0 ++;
				} else
					count_1 ++;
			}	
		}
		
		System.out.println(Math.min(count_1, count_0));
		
	}
}

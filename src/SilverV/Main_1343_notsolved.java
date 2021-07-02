package SilverV;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Main_1343_notsolved {

	public static void main(String[] args) throws Exception {
		//�������̳� AAAA�� BB 2���� ���Ѵ�� ����
		//'.'�� 'X'�� �̷���� �����ǿ��� 'X'�� ��� ����, '.'�� ������ �ȵȴ�.
		//�������̳�� ��� ���� �������� ����϶�
		
		//�Է�)�������� ũ��� �ִ� 500
		//���)���������� ���� �ռ��� ���� ����ϰ�, �������� -1 ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		String[] a_a = input.split("");
		String [] arr = new String [500];
		int [] temp = new int [500];
		
		
		for(int i = 0; i<input.length(); i++) {
			if(a_a[i].equals("X")) {
				temp[i] = 1;				
			}
		}// X�� 1�� ��ȯ��
		int count = 0;
		int num = 0;//�迭�� ��ġ �����ϴ� ����
		boolean possible = true;
		for(int i=0; i<input.length(); i++) {
			if(temp[i] == 1) {
				count++;
			if(count % 4 == 0) {
				arr[num] = "AAAA";
				num++;
				count = 0; // 4�� ���������� AAAA
			} else if(count % 4 != 0 && count % 2 == 0 && temp[i+1] != 1) {
				arr[num] = "BB";
				num++;
				count = 0;
			}
			}else {
				if(count %2 != 0) {
					possible = false;
					break;
				} else {
					arr[num] = ".";
					num++;
				}
			}
		}
		
		if(possible == false || count==1) {
			System.out.println(-1);
		} else {
			for(int i=0; i<num; i++) {
				System.out.print(arr[i]);
			}
		}
		
	}
}

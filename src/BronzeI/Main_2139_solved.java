package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2139_solved { // ���� �ʰ� ��ƿ� ���� �˰� �ִ�
	public static void main(String[] args) throws IOException {
		//������ �Ϸ簡 ����
		//������ �ش��ϴ� ������ 4�� ������ ��������
		//�׷��� 100���� ������ ���� ������ ����
		//�׷��� 400���� ������ �������� ����
		//2000���� ���� 1976�⵵ ����
		//�׷��� 1900���� ����ƴ�
		//28��,30��,31�Ϸ� �̷���� ������ ����
		//��¥�� ī��Ʈ �ؾ���.
		//input - dd-mm-yyyy but 0 0 0 -> exit
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int dd, mm, yyyy; // ��, ��, ���� ��ü����
		String[] dmy = new String[3]; // ����� �ϳ��ε� ���ڹ迭 ����(Split���� ������ �뵵)
		
		
		while(true) { // ���ѹݺ� ����
		dmy = br.readLine().split(" "); // 14 8 2004 �Է½� [0]==14||[1]==8||[2]==2004
		dd = Integer.parseInt((dmy[0])); // ��
		mm = Integer.parseInt(dmy[1]); // ��
		yyyy = Integer.parseInt(dmy[2]); // ��
		// == �̺κб��� �Է¹޴� ��Ʈ == //
		int result = 0;	
		
		if( dd == 0 && mm == 0 && yyyy == 0) {
			System.exit(0);
		} // �Է½� 0 0 0 �̸� ����
		
		 int m[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };	
		//�޸����� ��¥�� �Է�����, 1���� ��� 
		 boolean yoon = false; //���� �Ǵ�(�⺻������ ���� �ƴ�)
		 
		 
		 if ((yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0) { // ������
			yoon = true; // �����Ǵ�(4�� ���������鼭 100���� ������������ ����) or 400���� ��������
		 }
		 if (yoon == true) { // ������ ��
			m[2] = 29; // 2���� 29�Ϸ� �������
		 }
		 
		 for(int i=0; i<mm; i++) {
			 result = result + m[i]; // ������¥ ��� ������
		 } // 3��1�� �� ��� m[0]+m[1]+m[2] + result
		 //�̰��� �����̸�, 0+31+29 = 60
		 
		 // ====���� �� ���� ���� || �Ʒ��� memory ���� Ŀ�� ====//
		 
		 /*
			 if(yoon == true && mm > 2) {
				 result = result + 1;// 2���̻��̸� +1�������
			  for(int i=0; i<mm; i++) {
			 result = result + m[i]; // ������¥ ��� ������
		 }} else for(int j=0; j<mm; j++) {
				 result = result + m[j]; // ������¥ ��� ������ 
			 }
		*/ 
		
		 //������ 3�� 1���̾��� ������ 0+31+29(m�迭) + 1(dd)
		 result = result + dd; // �ٷ� �Է��� dd �����༭ �� ��¥ ���
		 System.out.println(result); // �� ��¥ ���
		} // ���� ���� while
	}
}
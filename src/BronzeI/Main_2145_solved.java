package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2145_solved { // try catch�� ��������.

	public static void main(String[] args) throws IOException {
		//������ �� �ڸ��� ���ϱ�
		//���ڸ����� �ɶ����� �ݺ�
		//�־����� ���ڴ� 100000���ٴ� ���� ���� ������.
		//0 �Է¹����� ���� <- �̺κп��� ������
	try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	while(true) {

	String a; 
	a = br.readLine(); //���ڸ����� ������� ���� �Է�����
	
	if(a.equals(0)) { //���ڰ� 0�̸� 
		System.exit(0);//�ý��� ����
	}
	String[] b;
	b = a.split(""); //String�迭�� �Է¹��� ���ڸ� ���� �ɰ���
		//ex)1234 => b[0]==1 b[1]==2 b[2]==3 b[3]==4
	
	Test(b); // ����Լ� �޼ҵ� ȣ�� || �Ű����� b�迭
			
		}
	
	} catch (NumberFormatException e) {
		System.exit(0); //������ ������ ��������...
	} catch (Exception e) {
		System.exit(0); //���� ������ ������ ��������. 
	} // try catch ����
	
	}


	static void Test(String[] b) { // String[]b�迭�� ���ڷ� �������� 
		
		int c = 0;
		for(int i=0; i<b.length; i++) {
			c = c + Integer.parseInt(b[i]);
		} // c������ b�� ��� �����ִ� ������
		
			if((c / 10) == 0 && c != 0) { // 10���� ����� ���� �ȳ����� ���ڸ���
				System.out.println(c); // ���ڸ������� �˻��Ͽ� ���ڸ����� ���
			} else if( c == 0) { // c�� 0�̶�� ���� b�迭�� "0"�̶�� ���� �ǹ���
				System.out.println(""); //�־����� ������ �޸��ʰ��� ������ ��
			}
			else { // ���ڸ����� �ƴ� ��� 
				Test(String.valueOf(c).split("")); // �� ���ߴ� c�� �ٽ� ���� b�� split���� ���� �־���
			}
	}
}
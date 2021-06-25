package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1152_solved {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine(); // ���� �Է�
		int count = 0; // ī����
		
		
		//String arrays[]= a.split(" ");
		// (2) ->split�Լ��� �����ִ� ��ĵ� Ʋ����
		
		/*	
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i) == ' '){
				count++;
			}
		} (1)' '�� ���ִ� ����� Ʋ����
		*/
		
		
		StringTokenizer st = new StringTokenizer(a," ");
		// StringTokenizer�� ������ ������(����)�� ���ڿ��� �ɰ��� �ش�.
		// �����ڸ� �������� �ʰ� ���ڿ��� ������ ������ �������� ������ ��.("")
		System.out.println(st.countTokens()); //st�� ȣ���ϰ�, countTokens���
		//�޽�带 ����Ͽ� ��ū�� ������ ��ȯ�Ѵ�.
	
	
	}
}

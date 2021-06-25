package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110_infinite_roop2 {

	public static void main(String[] args) throws IOException {

		//0 =< N <= 99
		//���� �־��� ���� 10���� ������ �տ� 0�� �ٿ� ���ڸ����� ����
		// �� �ڸ��� ���ڸ� ���Ѵ�.
		// �־��� ���� ���� ������ �ڸ� ����
		// �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ��
		
		// 26���� �����Ѵ� -> 2+6=8 ���ο���� 68�̴�(�־��� ���� ����������ڸ� �� 6/ ���Ѽ� 8)
		//6+8 = 14 -> 8�� 4 84 -> 4�� 2 42 ||4 + 2 = 6 ���ο���� 26
		// ���� ���� 4������ ���� ���� ���ƿ´�. ���� 26�� ����Ŭ�� ���̴� 4.
		//N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� ���Ͻÿ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a; 
		
		a = br.readLine(); // ó�� �޾��ִ� ����
		int aa = Integer.parseInt(a);
		String[] b; // �޾��� ���ڸ� �ɰ��� ������ �迭
		int count = 0; // ī��Ʈ�� �� ����
		int c;
		b = a.split("");
		String d;
		while (true) {	
							 //if) 26-> 2 + 6 -> c==8
			c = Integer.parseInt(b[0])+Integer.parseInt(b[1]);
				
			//d�� String b[]�� String c�� int�� String���� �ٲ���
			// d == 68
			d = b[1] + Integer.toString(c%10); // (String) 68
			
			count ++;
			
			if(d == a) { // ���ѷ��� Ŭ���� ����
			break;
			} else if(d != a) {
			b = d.split(""); // -> b = [6,8]
			} 
		} // ���ѷ��� ����
	
		System.out.println("count = " + count);	
		System.out.println("a = "+a+" c= "+c+" d= "+d + " aa = "+aa);
	}
}

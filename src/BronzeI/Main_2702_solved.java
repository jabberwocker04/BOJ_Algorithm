package BronzeI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_2702_solved {
	public static void main(String[] args) throws IOException {
		// �� ���� a�� v�� �ּ� ������� �μ��� ����� ����� ���� �۰�
		// ex)2, 3 = 6
		// �ִ������� �ν��� ����� ����� ���� ū ���̴�.
		// ex)30, 50 == 150
		
		//�׽�Ʈ ���̽� T = 1<=T<=1000
		// �� �׽�Ʈ ���̽��� a�� b�� �̷���� + �������� ����
		// �׽�Ʈ ���̽��� �ּҰ����, �ִ����� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine()); // Testcase �Է�
		int a, b;// �ִ����� �ִ����� ������ a b
		for (int i = 0; i<Testcase; i++){
			String ab = br.readLine();//a b�� Line���� �޾������(���ٷ�)
			String a_b[];
			a_b = (ab.split(" "));
			a = Integer.parseInt(a_b[0]);
			b = Integer.parseInt(a_b[1]);		
			//������� a b�� �޾���
			System.out.print(baesu(a, b)+" "); // baesu �޽�忡 ab �Է��ϰ� ����� ���� ����
			System.out.println(yaksu(a, b)); // yaksu �޽�忡 ab�ְ� ��� ����
		} // Testcase ����
	}
	
	public static int yaksu(int a, int b) { // a�� b�� ���ڷ� ����
		
		while(b != 0) { // ��Ŭ���� ȣ���� || b�� 0�� �ƴϸ� ��� �ݺ�
			int r = a%b; // �ӽ��Լ� r�� a�� b�� ���� ���� �������� �־��� 
			a = b; // a�� b�� �־���
			b = r; // b���� ���������� �ٽ� �־���
		}
		return a;
	}
	
	public static int baesu(int a, int b) {
		return a * b / yaksu(a, b);
	} 
	// baesu ����
	
}


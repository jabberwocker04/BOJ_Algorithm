package BronzeII_Under;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
public class Main_1009_solved_but_memoryissue { // �л�ó��

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // String���� �޾���, ������
		// https://www.acmicpc.net/blog/view/56 �Է� �ӵ� �� ��ũ
		Scanner sc = new Scanner(System.in); // �׳� ��ĳ�ʾ�
		int Test; // �׽�Ʈ ���̽�
		int a, b; // a�� b��
		BigInteger results[]; // a�� b���� �迭�� ���� ������	
		Test = sc.nextInt(); // TestCase �Է�
		results = new BigInteger [Test]; // �迭 �� �Է�
		for(int i=0; i<Test; i++) { // Test ����
			a = sc.nextInt(); // ���� �Է�
			b = sc.nextInt(); // ���� �Է�
			
			results[i] = BigInteger.valueOf(a); // �����̱⶧���� �켱 results[i]�� a�� �־�� �Ѵ�.
			for(int j=1; j < b; j++) { // a�� b�� ����
			results[i] = results[i].multiply(BigInteger.valueOf(a));
				} // multiply�� ���ϴ� �޽���̰� BigInteger.vlaueof�� ���־�� 
			//BigInteger�� ���� �迭�� ���ڰ��� ����� �� �ִ�
			}	
		for(int i=0; i<Test; i++) { // ������
			if((results[i].mod(BigInteger.valueOf(10)) != BigInteger.valueOf(0))) {
				System.out.println(results[i].mod(BigInteger.valueOf(10)));
			} else if ((results[i].mod(BigInteger.valueOf(10)) == BigInteger.valueOf(0))) {
				System.out.println("10"); // �������� ������ 10 ���
			}
		}
	}
} // ��Ŭ�������� ��������� ���ؿ����� ������ �ȵǾ���. BigInteger�� ����Ͽ�����
// �޸� �̽��� ��. �ƹ����� �� Ǯ�̹��� �ƴ� �� ����.
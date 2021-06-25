package BronzeII;

import java.util.Scanner;

public class Main_1434_solved {

	public static void main(String[] args) {
		 
		//�� �ڽ� N���� ���ٷ� ����(�迭?)
		//�ڽ��� å M�� �������� ��(�ؽ����̺�?)
		//�ڽ��� 1������ N������ ��ȣ�� ����.
		//å�� 1������ M������ ��ȣ�� ����.
		
		//å�� �ڽ��� ���� ������ 3�� or 2������ ����.
		//���� å�� �ڽ��� �ְ� ���� å�� �տ� ���� 1������
		//���� �ڽ��� �ٸ� ������ ġ�� �Ŀ� ����.
		
		//i�� �ڽ��� �뷮�� A(i)�̰�, J�� å�� ũ��� B(j)�̴�.
		//å�� ũ��� �ڽ��� �ִ� å�� ũ���� ���� �ڽ��� �뷮�� �ȳ����� å�� ���� �� ����.
		
		//����� �뷮�� ����?
		
		//ù°�ٿ� �ڽ��� ���� N�� å�� ���� M�� �־���.
		//��°�ٿ� �ڽ��� �뷮�� �־���.
		//��°�ٿ� å�� ũ�Ⱑ �־���.
		int Box, Book;
		Scanner sc = new Scanner(System.in);
		Box = sc.nextInt(); // �ڽ�ũ��
		Book = sc.nextInt(); // åũ��
		int sum = 0; // ������ ��
		
		int boxs[] = new int[Box];
		int books[] = new int[Book];
		int boxsum=0, booksum=0;
		
		for(int i=0; i<Box; i++) { // Box���� ũ�� �Է�
			boxs[i] = sc.nextInt(); // �ڽ����� �뷮 �Է�
			boxsum = boxsum + boxs[i];
		}
		
		for(int i=0; i<Book; i++) { // Book���� ũ�� �Է�
			books[i] = sc.nextInt(); // å���� �뷮 �Է�
			booksum = booksum + books[i];
		}
		
		sum = boxsum-booksum;
		System.out.println(sum);
		
	}
}

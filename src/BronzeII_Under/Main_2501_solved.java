package BronzeII_Under;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2501_solved { // ������ϱ�
	//������� ������ ���Ƽ� ������

	public static void main(String[] args) {
		
		int p, q; // ����
		
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		q = sc.nextInt();
		
		for (int i = 1; i <= p; i++) {
            if(p % i == 0) // p�� i�� ���� �������� 0�� ��
            	q--; // q�� ����
            if(q == 0) {
                System.out.println(i);
                break;
            }
        }
        if(q != 0)  
            System.out.println(0); 
	}

}

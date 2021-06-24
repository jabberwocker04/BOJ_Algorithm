package BronzeII_Under;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2501 { // 약수구하기
	//정답률이 은근히 낮아서 선정함

	public static void main(String[] args) {
		
		int p, q; // 정수
		
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		q = sc.nextInt();
		
		for (int i = 1; i <= p; i++) {
            if(p % i == 0) // p를 i로 나눈 나머지가 0일 때
            	q--; // q를 뺀다
            if(q == 0) {
                System.out.println(i);
                break;
            }
        }
        if(q != 0)  
            System.out.println(0); 
	}

}

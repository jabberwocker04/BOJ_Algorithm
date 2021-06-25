package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1173_Time_over_sotsolved {

	public static void main(String[] args) throws IOException {

		// � or �޽�
		// � -> �ƹ��� T��ŭ ����, �ƹ��� X���ٸ� 1���� X+T
		// �ƹ��� M�� �ѱ�� �ȵ� -> X+T <= M�̾�� ��
		
		// �޽� -> �ƹ��� R��ŭ ����, �ƹ��� X���ٸ� 1���� X-R
		// �ƹ��� m���� �������� �ȵ� -> X-R >= m�̾�� ��.
		
		//������ �ʱ�ƹ��� m�̰� ��� N�� �Ϸ��� ��.
		//�� �� ��� N���ϴµ� �ʿ��� �ð��� �ּڰ��� ���غ���.
		//N, m, M, T, R�� �Է����ֱ�.
		
		//N�� �޽�(X-R)�� �(X+T)�� �̷���� ����.
		int N, m, M, T, R;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(st.nextToken()); //� �ϰ��� �ð�
		m = Integer.parseInt(st.nextToken()); // �ּҸƹ� & �ʱ�ƹ�
		M = Integer.parseInt(st.nextToken()); // �ִ�ƹ�
		T = Integer.parseInt(st.nextToken()); // �����ƹ�
		R = Integer.parseInt(st.nextToken()); // ���Ҹƹ�
		int count = 0;
		int RealM = m; // ����ƹ�
		int time=0;
		while(count<N) {
			// �
			if (M >= T+RealM) {
				RealM = RealM+T;
				time=time+1;
				count++;
			}
			// �޽�
			else {
				if(m > RealM-R) { // �ִ�ƹ� �̻��϶� �޽�
				RealM = m;
				time = time+1;
			} else {
				RealM = RealM - R;
				time++;
				}
			}
		}
		
			if(RealM + T > M && RealM == m) { // ����ƹ�+� >> �ִ�ƹ��̰� ����ƹ��� �����ƹ��̶��
				System.out.println("-1");
				//System.exit(0);
				return; 
				}
			System.out.println(time);
			}
		}


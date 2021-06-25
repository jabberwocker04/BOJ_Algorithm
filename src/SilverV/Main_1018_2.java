package SilverV;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1018_2 {

	public static void main(String[] args) throws Exception { // 05.24
		//MN���� ���� ���簢������ �������� �ִ� M*N ũ���� ����
		//������, ������� ĥ���� ���� �� M*N�� �߶� 8*8ũ���� ü���� �����
		//ü����ó�� ������� �����Ƽ� ĥ����
		//(0,0)�� ����� ��� || (0,0)�� �������� ���
		//M*N���� �ִ��� ����� 8*8�� ��� �� 
		//��� ���簢���� �ٽ� ĥ�ؾ߰ڴٰ� ������.
		//�ٽ� ĥ�� ���簢���� �ּ� ������ ���ϴ� ���α׷�
		
		//N,M>=8 || N,M<=8 
		//��°�ٺ��� N���� �ٿ��� ������ �� �� ���°� �־�����.
		//B�� ������ W�� ����̴�
		int value = Integer.MIN_VALUE;
		String[][] firstW = new String[8][8];
		
		for(int i=0; i<firstW.length; i++) {
			for(int j=0; j<firstW[i].length; j++) {
				if( (i+j)%2 ==0 ) {
					firstW[i][j] = "W";
				} else if ( (i+j)%2 == 1) {
					firstW[i][j] = "B";
				
				}
			}
		}
		
		String[][] firstB = new String[8][8];
		
		for(int i=0; i<firstB.length; i++) {
			for(int j=0; j<firstB[i].length; j++) {
				if( (i+j)%2 ==0 ) {
					firstB[i][j] = "B";
				} else if ( (i+j)%2 == 1) {
					firstB[i][j] = "W";
				
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int g = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		String Chess[][] = new String [g][s];

		//2���� �迭 ��ǲ
		for(int i=0; i<Chess.length; i++) {
			String a = br.readLine();
			for(int j=0; j<Chess[i].length; j++) {
				String[] temp = a.split("");
				Chess[i][j] = temp[j];
			}
		}
		
	/*
		for(int i=0; i<g; i++) {
		System.out.println("");
			System.out.print(Arrays.toString(firstB[i])); ;
		}
	 */
		
		
		int AnswerB[][] = new int[g-7][s-7];
		int AnswerW[][] = new int[g-7][s-7];
		
		int Whitemin = Integer.MAX_VALUE, Blackmin = Integer.MAX_VALUE;
		int count = 0;
		
		for(int h=0; h<AnswerB.length; h++) {
		for(int i=0; i<AnswerB[h].length;i++) { // �� ü������ Ž��	
					for(int l=0; l<8; l++) {
						for(int m=0; m<8; m++) {
					
					if(Chess[l+h][m+i].equals(firstB[l][m])) {
						count  ++ ;
					}		
					
				} // m
			} // l
			AnswerB[h][i] =  count;	
			count = 0;	
			if(Blackmin>AnswerB[h][i]) {
				Blackmin = AnswerB[h][i];
			}
		} // i
	} // h
		
		for(int h=0; h<AnswerW.length; h++) {
			for(int i=0; i<AnswerW[h].length;i++) { // ȭ��Ʈ ü������ Ž��	
						for(int l=0; l<8; l++) {
							for(int m=0; m<8; m++) {
						
						if(Chess[l+h][m+i].equals(firstW[l][m])) {
							count  ++ ;
						}		
						
					} // m
				} // l
				AnswerW[h][i] =  count;	
				count = 0;
				if(Whitemin>AnswerW[h][i]) {
					Whitemin = AnswerW[h][i];
				}
			} // i
		} // h
		
	/*
	for(int i=0; i<AnswerW.length; i++) {
		for(int j=0; j<AnswerW[i].length; j++) {
			System.out.print(AnswerW[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.println("���� ȭ��Ʈ �Ʒ��� ��");
	
	for(int i=0; i<AnswerB.length; i++) {
		for(int j=0; j<AnswerB[i].length; j++) {
			System.out.print(AnswerB[i][j]+" ");
		}System.out.println("");
	}
	*/
	if(Blackmin<Whitemin)	{
		System.out.println(Blackmin);
	} else
		System.out.println(Whitemin);
	
	}
}

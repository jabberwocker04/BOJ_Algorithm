package BronzeII;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_2546_solved {
	
 private static final int MAX_P = 200001;
 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Testcase; i++) {
			String gong = br.readLine(); // ���ٷ� �����ϱ� ���� �����Ⱚ
			
			int[] C = new int[MAX_P]; // C�������� �ڸ��� MAX_P��ŭ ����
			int[] Math = new int[MAX_P]; // Math�������� �ڸ��� MAX_P��ŭ ����
			boolean[] CWithMath = new boolean[MAX_P]; // �ΰ� ���ؼ� true�� ī��Ʈ ������
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			double N = Double.parseDouble(st.nextToken());
			double M = Double.parseDouble(st.nextToken());
			//N�� M �Է�����(�����ڷ� �����ϱ⶧���� br.nextLine()���� ����)
			
			double Cavg = 0; // C��������� ���
			double Mathavg = 0; // ����������� ��
			
			st = new StringTokenizer(br.readLine()); // �ٽ� ȣ���� ������ nexttoken�� �ѹ���뿡 �ѹ��� ���;� ��
			//https://cofs.tistory.com/300 && https://hannamedia.tistory.com/26
			for(int j=0; j<N; j++) {
				int CIQ = Integer.parseInt(st.nextToken());
				//�����ڷ� �����̽� �������� �Էµ� ==> ������
				C[CIQ] = C[CIQ] + 1; // C[CiQ]�ڸ���  1�� ������
				Cavg = Cavg + CIQ;
				// System.out.println("C[CIQ]="+C[CIQ]+" "+CIQ+"��° �ڸ�");
			}
			Cavg = Cavg/N;
			// C��� IQ ��� �Է� �� ��� ���Ͽ���
			
			st = new StringTokenizer(br.readLine());
			//33��°�� ���� ����
			for(int j=0; j<M; j++) {
				int MIQ = Integer.parseInt(st.nextToken());
				//������³�� iq �Է�
				Math[MIQ] = Math[MIQ] + 1; // ������³�� iq�ڸ��� 1�� �־���
				Mathavg = Mathavg + MIQ; // ��վƴϰ� sum��. ����iq��sum�� ������
			}
			double tmpMath = Mathavg/M; // ������ �������� ��� ����ť�� ������
			//�ֳ��ϸ� �Ʒ����� �񱳸� �ؾߵǱ� ���� ����iq�� sum�� ����iq�� ����� ���� ����.
			
			
			//������ IQ ��� �Է� �� ��� ���Ͽ���
	
			for(int j=1; j<200; j++) {
				if(C[j] != 0) {
					if( j < Cavg ) { // C��պ��� ������� ���� true(1)�� �ٲ���
						CWithMath[j] = true;
						System.out.println("j="+j+"CWM="+CWithMath[j]);
						//������ ���� SOP�� || j=100�� 101�� ��(����� 102�̹Ƿ�) ���� �� �ڸ����� boolean�� true��
					}
				}
			}
			// CIQ�ڸ��� I�� Cavg���� ������ true(��պ��� ��������� True) == C��� ����� ���
			
			for(int j=1; j<MAX_P; j++) {
				if(CWithMath[j]) {
					double temp = (Mathavg + j) / (M + 1.0); // C��� ��� ������ ����ť(j)�� ���� �ٽ� ����� ����
					//(����iq���� �� + j / ������³��+1.0)
					System.out.println("temp"+temp); // ������ ����ť ��տ� C��� ��� ������ ����ť�� ���Ͽ� �ٽ� ����� ���Ѱ���
					if(tmpMath >= temp) { 
						System.out.println("����"+j);
						CWithMath[j] = false; //(�������IQ >= �������+C������������ ���) �����ϸ� false�� ���� else ������ true��
					}
				}
			}
			
			// �Ͻ������� ������ Double�� IQ ����� ������ ����ť ��տ� C��� ������� Iq�� ���ؼ� ��ձ���
			// �ӽ�IQ temp <= Mathavg �ϰ�� C��� ��� ���� ����ť ������ ���� ������ ��
			int result = 0;
			
			for(int j = 1; j<MAX_P; j++) {
				if(CWithMath[j]) {
					result = result + C[j];
				}
			}	
		System.out.println(result);
		} // Testcase For��			
	
	}
}
/*
//C����� �����п��� -> �ΰ��� �������� ���IQ ��
// �� �л��� IQ ���´�.
// C�� ����ϰ� �����п����� �����ؼ� �� ������ ��� IQ�� ��� �÷��� ���
// �׽�Ʈ���̽� T
// �� ���̽��� ���ٷ� ���еȴ�.
// C��� ������ N�� ������ ������ M�� �־�����.
//�η��߿��� N+M���� ���ڰ� �������� ���еǸ� �־�����.
// N�� M�� 200000���� �۰ų� ���� �ڿ����̰�, N�� 2���� ũ�ų� ����.
// IQ�� 100000���� �۰ų� ���� �ڿ����̴�.
*/
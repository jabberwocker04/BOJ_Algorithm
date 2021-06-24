package BronzeI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main_2546 {
	
 private static final int MAX_P = 200001;
 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Testcase; i++) {
			String gong = br.readLine(); // 한줄로 구분하기 위한 쓰레기값
			
			int[] C = new int[MAX_P]; // C수강생의 자리를 MAX_P만큼 생성
			int[] Math = new int[MAX_P]; // Math수강생의 자리를 MAX_P만큼 생성
			boolean[] CWithMath = new boolean[MAX_P]; // 두개 비교해서 true로 카운트 셀거임
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			double N = Double.parseDouble(st.nextToken());
			double M = Double.parseDouble(st.nextToken());
			//N과 M 입력해줌(구분자로 구분하기때문에 br.nextLine()보다 나음)
			
			double Cavg = 0; // C언어수강놈들 평균
			double Mathavg = 0; // 경제수강놈들 평
			
			st = new StringTokenizer(br.readLine()); // 다시 호출한 이유는 nexttoken은 한번사용에 한번만 나와야 함
			//https://cofs.tistory.com/300 && https://hannamedia.tistory.com/26
			for(int j=0; j<N; j++) {
				int CIQ = Integer.parseInt(st.nextToken());
				//구분자로 스페이스 쓸때마다 입력돔 ==> 더빠름
				C[CIQ] = C[CIQ] + 1; // C[CiQ]자리에  1을 더해줌
				Cavg = Cavg + CIQ;
				// System.out.println("C[CIQ]="+C[CIQ]+" "+CIQ+"번째 자리");
			}
			Cavg = Cavg/N;
			// C언어 IQ 모두 입력 및 평균 구하였음
			
			st = new StringTokenizer(br.readLine());
			//33번째줄 위와 같음
			for(int j=0; j<M; j++) {
				int MIQ = Integer.parseInt(st.nextToken());
				//경제듣는놈들 iq 입력
				Math[MIQ] = Math[MIQ] + 1; // 경제듣는놈들 iq자리에 1을 넣어줌
				Mathavg = Mathavg + MIQ; // 평균아니고 sum임. 경제iq의sum을 구해줌
			}
			double tmpMath = Mathavg/M; // 경제학 수강생의 평균 아이큐를 구해줌
			//왜냐하면 아래에서 비교를 해야되기 때문 경제iq의 sum과 경제iq의 평균은 따로 사용됨.
			
			
			//경제학 IQ 모두 입력 및 평균 구하였음
	
			for(int j=1; j<200; j++) {
				if(C[j] != 0) {
					if( j < Cavg ) { // C평균보다 낮은놈들 전부 true(1)로 바꿔줌
						CWithMath[j] = true;
						System.out.println("j="+j+"CWM="+CWithMath[j]);
						//설명을 위한 SOP임 || j=100과 101이 됨(평균이 102이므로) 또한 그 자릿수의 boolean은 true임
					}
				}
			}
			// CIQ자리의 I가 Cavg보다 낮으면 true(평균보다 낮은놈들이 True) == C언어 드랍할 놈들
			
			for(int j=1; j<MAX_P; j++) {
				if(CWithMath[j]) {
					double temp = (Mathavg + j) / (M + 1.0); // C언어 평균 이하의 아이큐(j)를 더해 다시 평균을 구함
					//(경제iq들의 합 + j / 경제듣는놈수+1.0)
					System.out.println("temp"+temp); // 경제학 아이큐 평균에 C언어 평균 이하의 아이큐를 더하여 다시 평균을 구한것임
					if(tmpMath >= temp) { 
						System.out.println("제이"+j);
						CWithMath[j] = false; //(경제평균IQ >= 경제평균+C언어평균이하의 평균) 만족하면 false로 변경 else 여전히 true임
					}
				}
			}
			
			// 일시적으로 비교해줄 Double형 IQ 만들고 경제학 아이큐 평균에 C언어 평균이하 Iq를 더해서 평균구함
			// 임시IQ temp <= Mathavg 일경우 C언어 평균 이하 아이큐 수강의 값은 거짓이 됨
			int result = 0;
			
			for(int j = 1; j<MAX_P; j++) {
				if(CWithMath[j]) {
					result = result + C[j];
				}
			}	
		System.out.println(result);
		} // Testcase For문			
	
	}
}
/*
//C언어드랍 경제학원론 -> 두과목 수강생의 평균IQ 업
// 각 학생의 IQ 나온다.
// C언어를 드랍하고 경제학원론을 수강해서 두 과목의 평균 IQ를 모두 올려줄 사람
// 테스트케이스 T
// 각 케이스는 빈줄로 구분된다.
// C언어 수강생 N과 경제학 수강생 M이 주어진다.
//두래중에는 N+M개의 숫자가 공백으로 구분되며 주어진다.
// N과 M은 200000보다 작거나 같은 자연수이고, N은 2보다 크거나 같다.
// IQ는 100000보다 작거나 같은 자연수이다.
*/
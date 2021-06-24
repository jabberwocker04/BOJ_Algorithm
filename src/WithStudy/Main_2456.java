package WithStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2456 {

	public static void main(String[] args) throws IOException {
		//N명의 학생이 모인 초등학교반 학습회장선거
		//후보 3명, 선호도 적기
		//3점,2점,1점 주기
		//동률이면 3점이많은애가 1등 3점도 동률이면 2점이 1등 아니면 없어
		//세 후보의 점수를 계산하여 회장이 결정되는 경우 번호와 최고점수 출력
		//결정 못하면 번호0과 최고점수 출력
		int Testcase;
		String abc;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Testcase = Integer.parseInt(br.readLine());
		int a[] = new int[Testcase];
		int b[] = new int[Testcase];
		int c[] = new int[Testcase];
		int suma=0, sumb=0, sumc=0;
		int counta=0, countb=0, countc=0;
		for(int i=0; i<Testcase; i++) {
			abc = br.readLine();
			String[] getabc = abc.split(" ");
			a[i] = Integer.parseInt(getabc[0]);
			b[i] = Integer.parseInt(getabc[1]);
			c[i] = Integer.parseInt(getabc[2]);
			suma = suma + a[i];
			sumb = sumb + b[i];
			sumc = sumc + c[i];
		}
		
		//1등이 명확할 때
		if(suma > sumb && suma > sumc) {
			System.out.println("1 "+suma);
		} else if(sumb > suma && sumb > sumc) {
			System.out.println("2 "+sumb);
		} else if(sumc > suma && sumc > sumb) {
			System.out.println("3 "+sumc);
		}
		
		
		//동률일때 시작
		if(suma == sumb) {
			for(int i=0; i<Testcase; i++) {
					if(a[i] == 3) {
						counta = counta+3;
				} if(a[i] == 2) {
						counta = counta+2;
				} if(b[i] == 3) {
					countb = countb+3;
			} if(b[i] == 2) {
					countb = countb+2;
			}
			} // a와 b비교
			} 
		
		
		if (suma == sumc) {
			for(int i=0; i<Testcase; i++) {
				if(a[i] == 3) {
					counta = counta+3;
			} if(a[i] == 2) {
					counta = counta+2;
			} if(c[i] == 3) {
				countc = countc+3;
		} if(b[i] == 2) {
				countc = countc+2;
		}
		} // a와 c비교
		} 
		
		if (sumb == sumc) {
			for(int i=0; i<Testcase; i++) {
				if(b[i] == 3) {
					countb = countb+3;
			} if(b[i] == 2) {
					countb = countb+2;
			} if(c[i] == 3) {
				countc = countc+3;
		} if(b[i] == 2) {
				countc = countc+2;
		}
		} // c와 b비교
		}
		
		if(counta > countb && counta > countc) {
			System.out.println("1 "+ suma);
		} else if(countb > counta && countb > countc) {
			System.out.println("2 "+sumb);
		} else if((countc > counta && countc > countb) && countc-(countb+counta) != 0) {
			System.out.println("3 "+sumc);
		} else if((counta == countb && counta == countc) && (suma == sumb && suma == sumc)) {
			System.out.println("0 "+suma);
		}
		System.out.println(counta+" "+countb+" "+countc);
	}
}

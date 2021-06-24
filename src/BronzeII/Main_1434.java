package BronzeII;

import java.util.Scanner;

public class Main_1434 {

	public static void main(String[] args) {
		 
		//빈 박스 N개가 한줄로 있음(배열?)
		//박스에 책 M개 넣으려고 함(해쉬테이블?)
		//박스는 1번부터 N번까지 번호가 있음.
		//책도 1번부터 M번까지 번호가 있음.
		
		//책이 박스에 들어가지 않으면 3번 or 2번으로 간다.
		//현재 책을 박스에 넣고 다음 책을 손에 집고 1번으로
		//현재 박스를 다른 쪽으로 치운 후에 봉인.
		
		//i번 박스의 용량은 A(i)이고, J번 책의 크기는 B(j)이다.
		//책의 크기와 박스에 있는 책의 크기의 합이 박스의 용량을 안넘으면 책을 넣을 수 있음.
		
		//낭비된 용량의 합은?
		
		//첫째줄에 박스의 개수 N과 책의 개수 M이 주어짐.
		//둘째줄에 박스의 용량이 주어짐.
		//셋째줄에 책의 크기가 주어짐.
		int Box, Book;
		Scanner sc = new Scanner(System.in);
		Box = sc.nextInt(); // 박스크기
		Book = sc.nextInt(); // 책크기
		int sum = 0; // 낭비의 합
		
		int boxs[] = new int[Box];
		int books[] = new int[Book];
		int boxsum=0, booksum=0;
		
		for(int i=0; i<Box; i++) { // Box들의 크기 입력
			boxs[i] = sc.nextInt(); // 박스들의 용량 입력
			boxsum = boxsum + boxs[i];
		}
		
		for(int i=0; i<Book; i++) { // Book들의 크기 입력
			books[i] = sc.nextInt(); // 책들의 용량 입력
			booksum = booksum + books[i];
		}
		
		sum = boxsum-booksum;
		System.out.println(sum);
		
	}
}

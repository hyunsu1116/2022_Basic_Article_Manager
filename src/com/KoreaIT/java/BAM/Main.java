package com.KoreaIT.java.BAM;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("--프로그램 시작--");
		
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		while(true) {
			System.out.print("명령어) ");
			String cmd =sc.nextLine();
			
			if(cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요.");
				continue;
			}
			
			if(cmd.equals("exit")) {	
				break;	
			}
			
			if(cmd.equals("article write")){
				int Id = lastArticleId + 1;
				lastArticleId = Id;
				System.out.printf("제목: ");
				String title = sc.nextLine();
				System.out.printf("내용: ");
				String body = sc.nextLine();
				
				lastArticleId++;
				
				System.out.printf("%d번째 글\n", Id);
				
			}else if(cmd.equals("article list")){
				System.out.println("l");
				
			}else if(cmd.equals("article modify")){
	
			}else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}
		
		System.out.println("--프로그램 끝--");
	}
}

class Article{
	String title;
	String content;
}

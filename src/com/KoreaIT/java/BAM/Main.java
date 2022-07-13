package com.KoreaIT.java.BAM;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("--프로그램 시작--");
		
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;
		
		List<ArrayList> articles = new ArrayList<>();
	
		
		while(true) {
			System.out.print("명령어) ");
			String cmd =sc.nextLine().trim();
			
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
				
				Article article = new Article(Id, title, body);
				
				lastArticleId++;
				
				System.out.printf("%d번째 글\n", Id);
				
			}else if(cmd.equals("article list")){
				if(lastArticleId > 0) {
					System.out.println("번호  /  제목");
					System.out.println("%d   /  %d");
					
				}
				
			}else if(cmd.equals("article modify")){
	
			}else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}
		}
		
		System.out.println("--프로그램 끝--");
	}
}

class Article{
	int id;
	String title;
	String body;
	
	Article(int id, String title, String body){
		this.id = id;
		this.title = title;
		this.body = body;
	}
}

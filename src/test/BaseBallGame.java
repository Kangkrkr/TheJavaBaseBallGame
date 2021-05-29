package test;

import java.util.Scanner;

import feature.CreateGameNumber;
import feature.Referee;
import feature.UserInputNumber;

/* 클래스 이름, 변수명 명사화 -> 동사사용 금지 
 * 이름에 약자로 적기 금지 
 * 접근제한자를 활용한 코드 짜기 */

public class BaseBallGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfGames = 0;
		String gameNumber = new CreateGameNumber().createGameNumber();
		String userInputNumber = "";
		
		System.out.println(gameNumber);
		
		while(!gameNumber.equals(userInputNumber)) {
			
			numberOfGames += 1;
			
			System.out.println(numberOfGames + "번째 게임");
			userInputNumber = new UserInputNumber().userInputNumber(scan);
			
			System.out.println(new Referee().judgment(gameNumber, userInputNumber));
			
		}
		
		scan.close();
		
		if(gameNumber.equals(userInputNumber)) System.out.println("축하합니다.");
		
	}
	
}

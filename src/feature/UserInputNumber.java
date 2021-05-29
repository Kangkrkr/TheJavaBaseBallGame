package feature;

import java.util.Scanner;

public class UserInputNumber {

	String userInputNumber = "";
	
	public UserInputNumber() {
		
		
		
	}
	
	public String userInputNumber(Scanner scan) {
		
		System.out.println("원하는 세자리 숫자를 입력하세요.");
		userInputNumber = scan.next();
		
		return userInputNumber;
		
	}
	
}

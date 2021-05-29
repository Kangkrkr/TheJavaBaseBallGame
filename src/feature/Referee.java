package feature;

public class Referee {
	
	public int strike = 0;
	public int ball = 0;
	
	public Referee() {
		
	}
	
	public String judgment(String gameNumber, String userInputNumber) {
		
		String result = "";
		
		int loop = gameNumber.length();
		for(int i = 0; i < loop; i++) {
			
			checkStrike(gameNumber.charAt(i), userInputNumber.charAt(i));
			
		}
		
		for(int i = 0; i < loop; i++) {
			
			String removeCharUserInputNumber = removeIndexChar(i, userInputNumber);
			
			checkBall(gameNumber.charAt(i), removeCharUserInputNumber);
			
		}
		
		result = strike + " 스트라이크 " + ball + " 볼";
		
		return result;
		
	}
	
	public int checkStrike(char gameNumber, char userInputNumber) {
		
		if(gameNumber == userInputNumber)
			strike += 1;
		
		return strike;
		
	}
	
	public int checkBall(char gameNumber, String userInputNumber) {
		
		int loop = userInputNumber.length();
		
		for(int i = 0; i < loop; i++) {
			
			charComparison(gameNumber, userInputNumber.charAt(i));
			
		}
		
		return ball;
		
	}
	
	public void charComparison(char gameNumber, char userInputNumber) {
		
		if(gameNumber == userInputNumber)
			ball += 1;
		
	}
	
	public String removeIndexChar(int index, String userInputNumber) {
		
		StringBuilder builder = new StringBuilder(userInputNumber);
		builder = builder.deleteCharAt(index);
		userInputNumber = builder.toString();
		
		return userInputNumber;
		
	}
	
}

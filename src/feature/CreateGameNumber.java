package feature;

public class CreateGameNumber {

	public String gameNumber = "";
	
	public CreateGameNumber(){
		
		
		
	}
	
	public String createGameNumber() {
		
		while(gameNumber.length() < 3) duplicateCheck();
		
		return gameNumber;
		
	}
	
	public String createRandomNumber() {
		
		return String.valueOf(((int) (Math.random() * 10)));
		
	}
	
	public void duplicateCheck() {
		
		String makeNum = createRandomNumber();
		
		if(!gameNumber.contains(makeNum)) gameNumber += makeNum;
		
	}
	
}

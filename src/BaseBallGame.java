import java.util.Map;

public class BaseBallGame {

	public static void main(String[] args) {

		Computer computer = new Computer();
		Output.printMessage(computer.getRandomAnswerNumbers());

		User user = new User();
		Input.setNumbersFromUser(user);

		Output.printMessage(user.getUserNumbers());
		
		Checker checker = new Checker(computer, user);
		Map<ResultCategory, Integer> gameResult = checker.getGameResult();
		
		Output.printResult(gameResult);
		
		/*
		while (Checker.gameStatus != GameStatus.END) {
			
		}
		*/
	}

	
}

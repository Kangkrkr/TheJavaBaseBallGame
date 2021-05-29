import java.util.HashMap;
import java.util.Map;

public class Checker {

	public static GameStatus gameStatus = GameStatus.START;
	
	private Computer computer;
	private User user;
	
	public Checker(Computer computer, User user) {
		this.computer = computer;
		this.user = user;
	}
	
	public Map<ResultCategory, Integer> getGameResult() {
		if (computer == null || user == null) {
			throw new TargetNotFoundException("대상이 지정되지 않았습니다.");
		}
		
		return this.compareAnswer();
	}
	
	private Map<ResultCategory, Integer> compareAnswer() {
		Map<ResultCategory, Integer> result = new HashMap<>();
		String userNumbers = user.getUserNumbers();
		
		for (int userIndex=0; userIndex < userNumbers.length(); userIndex++) {
			char userNumber = userNumbers.charAt(userIndex);
			ResultCategory category = getResultCategory(userNumber, userIndex);
			
			Integer categoryCount = result.getOrDefault(category, 0);
			result.put(category, categoryCount + 1);
		}
		
		return result;
	}

	private ResultCategory getResultCategory(char userNumber, int index) {
		String answerNumbers = computer.getRandomAnswerNumbers();

		if (answerNumbers.charAt(index) == userNumber) return ResultCategory.STRIKE;
		if (answerNumbers.contains(String.valueOf(userNumber))) return ResultCategory.BALL;
		
		return ResultCategory.NOTHING;
	}
	
	
}

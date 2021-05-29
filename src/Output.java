import java.util.Map;

public class Output {

	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static void printResult(Map<ResultCategory, Integer> result) {
		int strike = result.getOrDefault(ResultCategory.STRIKE, 0);
		int ball = result.getOrDefault(ResultCategory.BALL, 0);
		int nothing = result.getOrDefault(ResultCategory.NOTHING, 0);
		
		if (strike == 3) {
			printMessage("모든 숫자를 맞추었습니다.");
			return;
		}
		if (nothing == 3) {
			printMessage("아무것도 맞히지 못했습니다.");
			return;
		}
		
		printMessage("스트라이크: " + strike + ", 볼: " + ball);
	}
	
}

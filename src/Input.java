import java.util.Arrays;
import java.util.Scanner;

public class Input {

	private static final String KEEP_GOING = "1";
	private static final String GAME_END   = "2";
	
	private static final Scanner scanner = new Scanner(System.in);
	private static final int VALID_MAX_LENGTH = 3;
	
	public static void setNumbersFromUser(User user) throws InvalidNumberException {
		String userNumbers = scanner.nextLine();
		
		if (! isValidNumbers(userNumbers)) throw new InvalidNumberException("올바른 숫자가 아닙니다");
		
		Output.printMessage("숫자를 입력해 주세요 : ");
		user.setUserNumbers(userNumbers);
	}
	

	public static void getOptionFromUser(boolean isStrikeAll) throws InvalidNumberException {
		if (! isStrikeAll) {
			return;
		}
		
		Output.printMessage("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
		
		String userOption = scanner.nextLine();
		if (! Arrays.asList(KEEP_GOING, GAME_END).contains(userOption)) {
			throw new InvalidNumberException("올바른 숫자가 아닙니다");
		}
		
		
	}
	
	private static boolean isValidNumbers(String numbers) {
		return numbers != null && numbers.length() == VALID_MAX_LENGTH;
	}
}

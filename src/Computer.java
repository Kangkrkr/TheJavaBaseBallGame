import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Computer {

	private static final Random RANDOM = new Random();
	private static final int MAX_SEED = 9;
	
	private String randomAnswerNumbers;
	
	public Computer() {
		this.randomAnswerNumbers = this.generateRandomUniqueNumbers();
	}
	
	private String generateRandomUniqueNumbers() {
		Set<Integer> randomNumbers = new LinkedHashSet<>();
		
		while (randomNumbers.size() < 3) {
			randomNumbers.add(RANDOM.nextInt(MAX_SEED) + 1);
		}
		
		return concatIntegerToString(randomNumbers);
	}
	
	private String concatIntegerToString(Set<Integer> randomNumbers) {
		String result = randomNumbers.stream()
				 .map(num -> String.valueOf(num))
				 .reduce((l, r) -> l.concat(r))
				 .get();
		
		return result;
	}

	public String getRandomAnswerNumbers() {
		return randomAnswerNumbers;
	}
	
}

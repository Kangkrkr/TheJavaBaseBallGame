package baseball_test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class BaseBallTest {

	@Test
	@DisplayName("랜덤값이 0부터 9까지의 사이인지 테스트")
	public void isValidRandomNumberTest() {
		Random random = new Random();
		for (int i=0; i<100; i++) {
			int randomNumber = random.nextInt(9) + 1;
			
			if (randomNumber < 0 || randomNumber > 9) {
				fail("올바르지 않은 수가 생성되었습니다.");
			}
		}
	}
	
	@Test
	@DisplayName("3자리 난수 생성 테스트")
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void generateUniqueRandomNumbersTest() {
		Random random = new Random();
		
		for (int i=0; i<10; i++) {
			Set<Integer> randomNumbers = new LinkedHashSet<>();
			
			while (randomNumbers.size() < 3) {
				randomNumbers.add(random.nextInt(9) + 1);
			}
			
			if (randomNumbers.size() < 3 || randomNumbers.size() > 3) {
				fail("3자리 미만 또는 초과 되었습니다.");
			}
		}
	}
	
	@Test
	@DisplayName("Set 원소를 String 문자연결 처리 테스트")
	public void concatIntegerToStringTest() {
		Set<Integer> randomNumbers = new LinkedHashSet<>();
		randomNumbers.add(1);
		randomNumbers.add(2);
		randomNumbers.add(3);
		
		String result = randomNumbers.stream()
									 .map(num -> String.valueOf(num))
									 .reduce((l, r) -> l.concat(r))
									 .get();
		
		Assertions.assertEquals("123", result);
	}

}

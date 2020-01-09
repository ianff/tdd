import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void should_return_fizz_when_fizz_buzz_given_a_number_of_multiple_of_3() {
    int number = 9;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Fizz", actual);
  }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void should_return_fizz_when_fizz_buzz_given_a_number_of_multiple_of_3() {
    int number = 9;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Fizz", actual);
  }

  @Test
  void should_return_buzz_when_fizz_buzz_given_a_number_of_multiple_of_5() {
    int number = 10;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Buzz", actual);
  }

  @Test
  void should_return_whizz_when_fizz_buzz_given_a_number_of_multiple_of_7() {
    int number = 14;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Whizz", actual);
  }
}
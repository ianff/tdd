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

  @Test
  void should_return_fizz_when_fizz_buzz_given_a_number_contains_3_but_not_5() {
    int number = 13;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Fizz", actual);
  }

  @Test
  void should_return_buzz_when_fizz_buzz_given_a_number_contains_5_but_not_7() {
    int number = 15;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Buzz", actual);
  }

  @Test
  void should_return_buzzwhizz_when_fizz_buzz_given_a_number_contains_5_but_not_7_and_is_multiple_of_5_and_7() {
    int number = 35;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("BuzzWhizz", actual);
  }

  @Test
  void should_return_buzz_when_fizz_buzz_given_a_number_contains_5_but_not_7_and_is_multiple_of_5_and_3() {
    int number = 45;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Buzz", actual);
  }

  @Test
  void should_return_whizz_when_fizz_buzz_given_a_number_contains_7_but_not_5_and_is_multiple_of_7_and_5() {
    int number = 70;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("Whizz", actual);
  }

  @Test
  void should_return_fizzwhizz_when_fizz_buzz_given_a_number_contains_7_but_not_5_and_is_multiple_of_7_and_3() {
    int number = 147;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("FizzWhizz", actual);
  }

  @Test
  void should_return_fizzbuzz_when_fizz_buzz_given_a_number_is_multiple_of_3_and_5_but_not_contains_3_or_5() {
    int number = 60;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("FizzBuzz", actual);
  }

  @Test
  void should_return_fizzbuzz_when_fizz_buzz_given_a_number_is_multiple_of_3_and_7_but_not_contains_3_or_7() {
    int number = 21;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("FizzWhizz", actual);
  }

  @Test
  void should_return_fizzbuzz_when_fizz_buzz_given_a_number_is_multiple_of_5_and_7_but_not_contains_5_or_7() {
    int number = 140;

    String actual = new Solution().fizzBuzz(number);

    assertEquals("BuzzWhizz", actual);
  }
}
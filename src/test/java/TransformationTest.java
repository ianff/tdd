import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformationTest {

  @Test
  void should_return_fizz_given_a_number_is_multiple_of_3() {
    int number = 6;

    assertEquals("Fizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_buzz_given_a_number_is_multiple_of_5() {
    int number = 10;

    assertEquals("Buzz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_whizz_given_a_number_is_multiple_of_7() {
    int number = 14;

    assertEquals("Whizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_as_is_given_a_number_is_not_multiple_of_3_or_5_7() {
    int number = 8;

    assertEquals("8", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzbuzz_given_a_number_is_multiple_of_3_and_5() {
    int number = 60;

    assertEquals("FizzBuzz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzbuzz_given_a_number_is_multiple_of_3_and_7() {
    int number = 21;

    assertEquals("FizzWhizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzbuzz_given_a_number_is_multiple_of_5_and_7() {
    int number = 245;

    assertEquals("BuzzWhizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizz_given_a_number_contains_3() {
    int number = 13;

    assertEquals("Fizz", new Transformation().fizzBuzz(number));
  }
}
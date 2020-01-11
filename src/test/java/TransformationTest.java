import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformationTest {

  @Test
  void should_return_fizz_given_a_number_is_a_multiple_of_3() {
    int number = 3;

    assertEquals("Fizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizz_given_a_number_is_a_multiple_of_5() {
    int number = 5;

    assertEquals("Buzz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizz_given_a_number_is_a_multiple_of_7() {
    int number = 7;

    assertEquals("Whizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizz_given_a_number_is_not_a_multiple_of_7_or_5_or_3() {
    int number = 4;

    assertEquals("4", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzbuzz_given_a_number_is_a_multiple_of_3_and_5() {
    int number = 15;

    assertEquals("FizzBuzz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_buzzwhizz_given_a_number_is_a_multiple_of_7_and_5() {
    int number = 35;

    assertEquals("BuzzWhizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzwhizz_given_a_number_is_a_multiple_of_7_and_3() {
    int number = 21;

    assertEquals("FizzWhizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzbuzzwhizz_given_a_number_is_a_multiple_of_7_and_3_and_5() {
    int number = 105;

    assertEquals("FizzBuzzWhizz", new Transformation().fizzBuzz(number));
  }
}
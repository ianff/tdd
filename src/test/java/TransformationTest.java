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
}
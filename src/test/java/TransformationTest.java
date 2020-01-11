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
}
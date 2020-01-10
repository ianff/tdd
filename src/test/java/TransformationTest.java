import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
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

  @Test
  void should_return_buzz_given_a_number_contains_5_but_can_not_be_divided_by_7() {
    int number = 15;

    assertEquals("Buzz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_buzz_given_a_number_contains_5_and_3_and_can_be_divided_by_7() {
    int number = 35;

    assertEquals("BuzzWhizz", new Transformation().fizzBuzz(number));
  }

  @Mock
  private Numbers numbers;

  @InjectMocks
  private Transformation transformation;

  @Test
  void should_return_fizzwhizz_given_a_number_contains_7_but_not_3_nor_5_and_can_be_divided_by_3_5_7() {
    int number = 4;
    when(numbers.multipleOf3(number)).thenReturn(true);
    when(numbers.multipleOf5(number)).thenReturn(true);
    when(numbers.multipleOf7(number)).thenReturn(true);

    when(numbers.contains5(number)).thenReturn(false);
    when(numbers.contains3(number)).thenReturn(false);
    when(numbers.contains7(number)).thenReturn(true);

    assertEquals("FizzWhizz", transformation.fizzBuzz(number));
  }
}
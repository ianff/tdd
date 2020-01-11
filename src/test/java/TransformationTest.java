import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

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
    Transformation transformation = spy(Transformation.class);

    doReturn(true).when(transformation).contains(anyString(), eq(5));
    doReturn(false).when(transformation).contains(anyString(), eq(3));

    doReturn(true).when(transformation).isDivisible(anyInt(), eq(3));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(5));
    doReturn(false).when(transformation).isDivisible(anyInt(), eq(7));

    assertEquals("Buzz", transformation.fizzBuzz(anyInt()));
  }

  @Test
  void should_return_buzzwhizz_given_a_number_is_a_multiple_of_7_and_5() {
    Transformation transformation = spy(Transformation.class);

    doReturn(true).when(transformation).isDivisible(anyInt(), eq(5));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(7));
    doReturn(false).when(transformation).isDivisible(anyInt(), eq(3));

    doReturn(false).when(transformation).contains(anyString(), eq(3));

    assertEquals("BuzzWhizz", transformation.fizzBuzz(anyInt()));
  }

  @Test
  void should_return_fizzwhizz_given_a_number_is_a_multiple_of_7_and_3() {
    int number = 21;

    assertEquals("FizzWhizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_fizzbuzzwhizz_given_a_number_is_a_multiple_of_7_and_3_and_5() {
    Transformation transformation = spy(Transformation.class);

    doReturn(false).when(transformation).contains(anyString(), eq(5));
    doReturn(false).when(transformation).contains(anyString(), eq(3));

    doReturn(true).when(transformation).isDivisible(anyInt(), eq(3));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(5));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(7));

    assertEquals("FizzBuzzWhizz", transformation.fizzBuzz(anyInt()));
  }

  @Test
  void should_return_fizz_given_a_number_contains_3() {
    int number = 13;

    assertEquals("Fizz", new Transformation().fizzBuzz(number));
  }

  @Test
  void should_return_buzzwhizz_given_a_number_contains_5_but_not_3_and_can_be_divided_by_3_and_5_and_7() {
    Transformation transformation = spy(Transformation.class);

    doReturn(true).when(transformation).contains(anyString(), eq(5));
    doReturn(false).when(transformation).contains(anyString(), eq(3));

    doReturn(true).when(transformation).isDivisible(anyInt(), eq(3));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(5));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(7));

    assertEquals("BuzzWhizz", transformation.fizzBuzz(anyInt()));
  }

  @Test
  void should_return_buzzwhizz_given_a_number_contains_5_but_not_3_and_can_be_divided_by_3_and_5_but_not_7() {
    Transformation transformation = spy(Transformation.class);

    doReturn(true).when(transformation).contains(anyString(), eq(5));
    doReturn(false).when(transformation).contains(anyString(), eq(3));

    doReturn(true).when(transformation).isDivisible(anyInt(), eq(3));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(5));
    doReturn(false).when(transformation).isDivisible(anyInt(), eq(7));

    assertEquals("Buzz", transformation.fizzBuzz(anyInt()));
  }

  @Test
  void should_return_buzzwhizz_given_a_number_contains_5_and_3_and_can_be_divided_by_7() {
    Transformation transformation = spy(Transformation.class);

    doReturn(true).when(transformation).contains(anyString(), eq(5));
    doReturn(true).when(transformation).contains(anyString(), eq(3));

    doReturn(true).when(transformation).isDivisible(anyInt(), eq(3));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(5));
    doReturn(true).when(transformation).isDivisible(anyInt(), eq(7));

    assertEquals("BuzzWhizz", transformation.fizzBuzz(anyInt()));
  }

  @Test
  void should_return_true_when_is_divisible_given_a_number_can_be_divided_by_another_number() {
    int number = 15;
    int anotherNumber = 3;

    assertTrue(new Transformation().isDivisible(number, anotherNumber));
  }

  @Test
  void should_false_true_when_is_divisible_given_a_number_can_not_be_divided_by_another_number() {
    int number = 16;
    int anotherNumber = 5;

    assertFalse(new Transformation().isDivisible(number, anotherNumber));
  }

  @Test
  void should_return_true_when_contains_given_a_number_contains_another_number() {
    String number = "13";
    int anotherNumber = 3;

    assertTrue(new Transformation().contains(number, anotherNumber));
  }

  @Test
  void should_return_false_when_contains_given_a_number_contains_another_number() {
    String number = "15";
    int anotherNumber = 4;

    assertFalse(new Transformation().contains(number, anotherNumber));
  }
}
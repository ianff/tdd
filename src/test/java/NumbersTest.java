import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

  @Test
  void should_return_true_when_multiple_of_3_given_a_number_is_a_multiple_of_3() {
    int number = 6;

    assertTrue(new Numbers().multipleOf3(number));
  }

  @Test
  void should_return_false_when_multiple_of_3_given_a_number_is_not_a_multiple_of_3() {
    int number = 5;

    assertFalse(new Numbers().multipleOf3(number));
  }

  @Test
  void should_return_true_when_multiple_of_5_given_a_number_is_a_multiple_of_5() {
    int number = 10;

    assertTrue(new Numbers().multipleOf5(number));
  }

  @Test
  void should_return_false_when_multiple_of_5_given_a_number_is_not_a_multiple_of_5() {
    int number = 7;

    assertFalse(new Numbers().multipleOf5(number));
  }

  @Test
  void should_return_true_when_multiple_of_7_given_a_number_is_a_multiple_of_7() {
    int number = 14;

    assertTrue(new Numbers().multipleOf7(number));
  }

  @Test
  void should_return_false_when_multiple_of_7_given_a_number_is_not_a_multiple_of_7() {
    int number = 10;

    assertFalse(new Numbers().multipleOf7(number));
  }

  @Test
  void should_return_true_when_contains_3_given_a_number_contains_3() {
    int number = 13;

    assertTrue(new Numbers().contains3(number));
  }

  @Test
  void should_false_true_when_contains_3_given_a_number_not_contains_3() {
    int number = 14;

    assertFalse(new Numbers().contains3(number));
  }

  @Test
  void should_return_true_when_contains_5_given_a_number_contains_5() {
    int number = 15;

    assertTrue(new Numbers().contains5(number));
  }

  @Test
  void should_false_true_when_contains_5_given_a_number_not_contains_5() {
    int number = 14;

    assertFalse(new Numbers().contains5(number));
  }

  @Test
  void should_return_true_when_contains_7_given_a_number_contains_7() {
    int number = 17;

    assertTrue(new Numbers().contains7(number));
  }

  @Test
  void should_false_true_when_contains_7_given_a_number_not_contains_7() {
    int number = 14;

    assertFalse(new Numbers().contains7(number));
  }
}
public class Transformation {
  private static String FIZZ = "Fizz";
  private static String BUZZ = "Buzz";
  private static String WHIZZ = "Whizz";

  private Numbers numbers = new Numbers();

  public String fizzBuzz(int number) {
    String result = handleFizzBuzzTransformation(number);

    if(numbers.contains5(number) && !numbers.contains7(number)) {
      result = result.replace(FIZZ, "");
    }

    if(numbers.contains3(number) && !numbers.contains5(number)) {
      result = FIZZ;
    }

    if(numbers.contains7(number)) {
      result = result.replace(BUZZ, "");
    }
    return result.length() == 0 ? String.valueOf(number) : result;
  }

  private String handleFizzBuzzTransformation(int number) {
    StringBuilder sb = new StringBuilder();

    if(numbers.multipleOf3(number)) {
      sb.append(FIZZ);
    }
    if(numbers.multipleOf5(number)) {
      sb.append(BUZZ);
    }
    if(numbers.multipleOf7(number)) {
      sb.append(WHIZZ);
    }

    return sb.length() == 0 ? String.valueOf(number) : sb.toString();
  }
}

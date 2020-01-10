public class Transformation {
  private static String FIZZ = "Fizz";
  private static String BUZZ = "Buzz";
  private static String WHIZZ = "Whizz";
  public String fizzBuzz(int number) {
    StringBuilder sb = new StringBuilder();
    if(number % 3 == 0) {
      sb.append(FIZZ);
    }
    if(number % 5 == 0) {
      sb.append(BUZZ);
    }
    if(number % 7 == 0) {
      sb.append(WHIZZ);
    }
    return sb.length() == 0 ? String.valueOf(number) : sb.toString();
  }
}

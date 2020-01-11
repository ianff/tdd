public class Transformation {

  private static String FIZZ = "Fizz";
  private static String BUZZ = "Buzz";
  private static String WHIZZ = "Whizz";

  public String fizzBuzz(int number) {
    String res = handleTransformation(number);

    String strNumber = String.valueOf(number);
    if(contains(strNumber, 5) && !contains(strNumber, 7)) {
      res = res.replace(FIZZ, "");
    }
    if(contains(strNumber, 3) && !contains(strNumber, 5)) {
      return FIZZ;
    }
    if(contains(strNumber, 7)) {
      res = res.replace(BUZZ, "");
    }

    return res.length() == 0 ? String.valueOf(number) : res;
  }

  private String handleTransformation(int number) {
    StringBuilder sb = new StringBuilder();
    if(isDivisible(number, 3)) {
      sb.append(FIZZ);
    }
    if(isDivisible(number, 5)) {
      sb.append(BUZZ);
    }
    if(isDivisible(number, 7)) {
      sb.append(WHIZZ);
    }
    return sb.length() == 0 ? String.valueOf(number) : sb.toString();
  }

  public boolean isDivisible(int number, int divisor) {
    return number % divisor == 0;
  }

  public boolean contains(String strNumber, int anotherNumber) {
    return strNumber.contains(String.valueOf(anotherNumber));
  }
}

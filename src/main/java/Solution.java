public class Solution {
  public String fizzBuzz(int number) {
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }
    if(number % 7 == 0) {
      return "Whizz";
    }
    String strNumber = String.valueOf(number);
    if(strNumber.contains("3") && !strNumber.contains("5")) {
      return "Fizz";
    }
    return String.valueOf(number);
  }
}

public class Solution {
  public String fizzBuzz(int number) {
    String strNumber = String.valueOf(number);
    if(strNumber.contains("5")) {
      if(number % 5 == 0 && number % 7 == 0) {
        return "BuzzWhizz";
      }
      if(number % 5 == 0) {
        return "Buzz";
      }
    }
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }
    if(number % 7 == 0) {
      return "Whizz";
    }
    if(strNumber.contains("3") && !strNumber.contains("5")) {
      return "Fizz";
    }
    return String.valueOf(number);
  }
}
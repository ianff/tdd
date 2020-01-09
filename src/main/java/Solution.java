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
    if(strNumber.contains("7")) {
      if(number % 3 == 0 && number % 7 == 0) {
        return "FizzWhizz";
      }
      if(number % 7 == 0) {
        return "Whizz";
      }
    }
    if(strNumber.contains("3") && !strNumber.contains("5")) {
      return "Fizz";
    }
    if(number % 5 == 0 && number % 7 == 0 && number % 3 == 0) {
      return "FizzBuzzWhizz";
    }
    if(number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }
    if(number % 3 == 0 && number % 7 == 0) {
      return "FizzWhizz";
    }
    if(number % 5 == 0 && number % 7 == 0) {
      return "BuzzWhizz";
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
    return String.valueOf(number);
  }
}

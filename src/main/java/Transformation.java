public class Transformation {
  public String fizzBuzz(int number) {
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }
    return null;
  }
}

public class Numbers {
  public boolean multipleOf3(int number) {
    return number % 3 == 0;
  }

  public boolean multipleOf5(int number) {
    return number % 5 == 0;
  }

  public boolean multipleOf7(int number) {
    return number % 7 == 0;
  }

  public boolean contains3(int number) {
    return String.valueOf(number).contains("3");
  }

  public boolean contains5(int number) {
    return String.valueOf(number).contains("5");
  }

  public boolean contains7(int number) {
    return String.valueOf(number).contains("7");
  }
}

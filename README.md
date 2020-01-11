## run all tests
```./gradlew clean test```

tasks:

given: if the number is a multiple of 3
then: return Fizz

given: if the number is a multiple of 5
then: return Buzz

given: if the number is a multiple of 7
then: return Whizz

given: if the number is not a multiple of 7 or 5 or 3
then: return as is

given: if the number is a multiple of 3 and 5
then: return FizzBuzz

given: if the number is a multiple of 3 and 7
then: return FizzWhizz

given: if the number is a multiple of 5 and 7
then: return BuzzWhizz

given: if the number is a multiple of 3 and 5 and 7
then: return FizzBuzzWhizz

given: if the number contains 3
then: return Fizz

given: if the number contains 5 but not 3
	
	given: if the number can be divided by 3, and also 5 and 7
	then: return BuzzWhizz

given: if the number contains 5 and 3

	given: if the number can be divided by 7
	then: return BuzzWhizz

given: if the number contains 7 but not 5

	given: if the number can be divided by 5, and 3 and 7
	then: return FizzWhizz

	given: if the number can be divided by 5, but not 3 or 7
	then: return as is
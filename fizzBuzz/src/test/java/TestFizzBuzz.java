import kata.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {

    @Test
    void verifyIsFizzWhenNumberIsMultipleOfThree(){
        int numberMultipleOfThree = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void verifyIsBuzzWhenNumberIsMultipleOfFive(){
        int numberMultipleOfFive = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfFive);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void verifyNumberIsMultipleOfThreeAndFive(){
        int numberNonMultipleOfFive = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberNonMultipleOfFive);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void verifySizeListOfResultsAfterPrinter(){
        int expectedListSize = 100;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printerResult();
        Assertions.assertEquals(expectedListSize, fizzBuzz.getResults().size());
    }


    @Test
    void verifyIsFizzWhenNumberContainsCharacterThree(){
        int numberMultipleOfThree = 32;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void verifyIsBuzzWhenNumberContainsCharacterFive(){
        int numberMultipleOfThree = 56;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void verifyIsFizzBuzzWhenNumberContainsCharacterFiveAndThree(){
        int numberMultipleOfThree = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void verifyIsFizzBuzzWhenNumberIsNotMultipleOfThreeAndContainsCharacterFiveAndThree(){
        int numberMultipleOfThree = 53;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);
        Assertions.assertEquals("FizzBuzz", result);
    }

}

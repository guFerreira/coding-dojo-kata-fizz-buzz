import kata.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void initObjects(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void verifyIsNumberWhenValueIsNonMultipleAndNonContainsThreeAndFiveCharacter(){
        int numberNonMultipleOfThreeOrFive = 1;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberNonMultipleOfThreeOrFive);

        Assertions.assertEquals(Integer.toString(numberNonMultipleOfThreeOrFive), result);
    }

    @Test
    void verifyIsFizzWhenNumberIsMultipleOfThree(){
        int numberMultipleOfThree = 3;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void verifyIsBuzzWhenNumberIsMultipleOfFive(){
        int numberMultipleOfFive = 5;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfFive);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void verifyNumberIsMultipleOfThreeAndFive(){
        int numberMultipleOfFive = 15;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfFive);

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void verifySizeListOfResultsAfterPrinter(){
        int expectedListSize = 100;

        fizzBuzz.printerResult();

        Assertions.assertEquals(expectedListSize, fizzBuzz.getResults().size());
    }


    @Test
    void verifyIsFizzWhenNumberContainsCharacterThree(){
        int numberContainingCharacterThree = 32;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberContainingCharacterThree);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void verifyIsBuzzWhenNumberContainsCharacterFive(){
        int numberContainingCharacterFive = 56;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberContainingCharacterFive);

        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void verifyIsFizzBuzzWhenNumberContainsCharacterFiveAndThree(){
        int numberContainingCharacterThreeAndFive = 35;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberContainingCharacterThreeAndFive);

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void verifyIsFizzBuzzWhenNumberIsNotMultipleOfThreeAndContainsCharacterFiveAndThree(){
        int numberMultipleOfThree = 53;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(numberMultipleOfThree);

        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void verifyConvertionWithNegativeNumber(){
        int negativeNumber = -1;

        String result = fizzBuzz.convertNumberToFizzBuzzFormat(negativeNumber);

        Assertions.assertEquals(Integer.toString(negativeNumber), result);
    }
}

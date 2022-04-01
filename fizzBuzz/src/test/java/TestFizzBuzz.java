import kata.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {

    @Test
    @DisplayName("Verificar se retorna \"Fizz\" quando o número passado for múltiplo de 3.")
    void verifyIsFizzWhenNumberIsMultipleOfThree(){
        int numberMultipleOfThree = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.verifyNumberIsFizz(numberMultipleOfThree);
        Assertions.assertEquals("Fizz", result);
    }
    @Test
    @DisplayName("Verificar se retorna o número de entrada como string quando" +
            " o número passado não for múltiplo de 3.")
    void verifyReturnIsNumberWhenEntryIsNotMultipleOfThree(){
        int numberNonMultipleOfThree = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.verifyNumberIsFizz(numberNonMultipleOfThree);
        Assertions.assertEquals(Integer.toString(numberNonMultipleOfThree), result);
    }

}

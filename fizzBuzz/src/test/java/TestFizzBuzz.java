import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {

    @Test
    @DisplayName("Verifica se o método retorna Fizz se o número de entrada for múltiplo de 3")
    void verifyNumberIsFizzWhenNumberIsMultipleOfThree(){
        int numberMultipleOfThree = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.verifyNumberIsFizz(numberMultipleOfThree);
        Assertions.assertEquals("Fizz", result);
    }

}

package kata;

public class FizzBuzz {
    public String verifyNumberIsFizz(int number){
        if (this.verifyNumberIsMultipleOfThree(number))
            return "Fizz";
        return Integer.toString(number);
    }

    private boolean verifyNumberIsMultipleOfThree(int number){
        return number % 3 == 0;
    }

}

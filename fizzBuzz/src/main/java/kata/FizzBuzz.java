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

    public String verifyNumberIsBuzz(int number){
        if (this.verifyNumberIsMultipleOfFive(number))
            return "Buzz";
        return Integer.toString(number);
    }

    private boolean verifyNumberIsMultipleOfFive(int number){
        return number % 5 == 0;
    }
}

package kata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<String> results = new ArrayList<>();

    public void printerResult(){
        this.generateResults();
        for (String result: results) {
            System.out.println(result);
        }
    }

    private void generateResults(){
        for (int i = 1; i <= 100; i ++){
            this.results.add(this.convertNumberToFizzBuzzFormat(i));
        }
    }

    public String convertNumberToFizzBuzzFormat(int number){
       return "";
    }

    private String verifyNumberIsFizz(int number){
        if (this.verifyNumberIsMultipleOfThree(number))
            return "Fizz";
        return "";
    }

    private boolean verifyNumberIsMultipleOfThree(int number){
        return number % 3 == 0;
    }

    private String verifyNumberIsBuzz(int number){
        if (this.verifyNumberIsMultipleOfFive(number))
            return "Buzz";
        return "";
    }

    private boolean verifyNumberIsMultipleOfFive(int number){
        return number % 5 == 0;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }
}

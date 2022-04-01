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
        this.results = new ArrayList<>();
        for (int i = 1; i <= 100; i ++){
            this.results.add(this.convertNumberToFizzBuzzFormat(i));
        }
    }

    public String convertNumberToFizzBuzzFormat(int number){
        String result = "";
        if(isMultipleForThreeAndFive(number)) {
            return "FizzBuzz";
        }
        if (this.isMultipleOfThree(number) || this.verifyNumberContainsCharacterThree(number)){
            result += "Fizz";
        }if (this.isMultipleOfFive(number) || this.verifyNumberContainsCharacterFive(number)){
            result += "Buzz";
        }
        if(result.equals(""))
            result = Integer.toString(number);

        return result;
    }

    private boolean isMultipleForThreeAndFive(int number){
        return this.isMultipleOfThree(number) && this.isMultipleOfFive(number);
    }

    private boolean isMultipleOfThree(int number){
        return number % 3 == 0;
    }

    private boolean isMultipleOfFive(int number){
        return number % 5 == 0;
    }

    private boolean verifyNumberContainsCharacterFive(int number){
        return Integer.toString(number).contains("5");
    }

    private boolean verifyNumberContainsCharacterThree(int number){
        return Integer.toString(number).contains("3");
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }
}

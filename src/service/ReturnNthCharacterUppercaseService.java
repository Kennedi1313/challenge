package service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ReturnNthCharacterUppercaseService {
    public String returnNthCharacterUppercase(String givenText, int givenN) {
        if(!isValid(givenText, givenN)) return "";
        String returnText = doFilteringInGivenText(givenText, givenN);
        printTheCountOfEachCharacter(returnText);
        return returnText;
    }

    private String doFilteringInGivenText(String givenText, int givenN) {
        return IntStream.range(0, givenText.length())
                .filter(i -> (i+1) % givenN == 0)
                .filter(i -> Character.isUpperCase(givenText.charAt(i)) || !Character.isAlphabetic(givenText.charAt(i)))
                .mapToObj(i -> Character.toString(givenText.charAt(i)))
                .reduce("", String::concat);
    }

    private void printTheCountOfEachCharacter(String returnText) {
        Map<Character, Long> amountsOfCharacters = new LinkedHashMap<>();
        System.out.println(" --------------------------- ");

        returnText.chars().mapToObj(intCode -> (char) intCode)
                .forEach(characterOfReturnText ->
                        amountsOfCharacters.put(characterOfReturnText,
                                returnText.chars().filter(character -> (char) character == characterOfReturnText).count()));

        amountsOfCharacters.keySet().forEach(
                character -> System.out.println(character + " = " + amountsOfCharacters.get(character)));

    }

    private boolean isValid(String givenText, int givenN) {
        return givenText != null && givenN > 0;
    }
}
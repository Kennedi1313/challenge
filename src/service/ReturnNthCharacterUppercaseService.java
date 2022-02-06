package service;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnNthCharacterUppercaseService {
    public String returnNthCharacterUppercase(String givenText, int givenN) {
        if(givenN <= 0) return "";
        return IntStream.range(0, givenText.length())
                .filter(i -> (i+1) % givenN == 0)
                .filter(i -> Character.isUpperCase(givenText.charAt(i)))
                .mapToObj(i -> Character.toString(givenText.charAt(i)))
                .collect(Collectors.toList())
                .stream().reduce("", String::concat);
    }
}

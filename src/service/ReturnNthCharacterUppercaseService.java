package service;

import java.util.stream.Collectors;

public class ReturnNthCharacterUppercaseService {
    public String returnNthCharacterUppercase(String givenText, int givenN) {
        return givenText.chars()
                .filter(character -> Character.isUpperCase((char) character))
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.toList())
                .stream().reduce("", String::concat);
    }
}

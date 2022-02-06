package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import service.ReturnNthCharacterUppercaseService;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnNthCharacterUppercaseServiceTest {
    ReturnNthCharacterUppercaseService service;
    @Before
    public void setUp() {
        service = new ReturnNthCharacterUppercaseService();
    }

    @Test
    public void methodReturnsAString() {
        assertNotNull(service.returnNthCharacterUppercase("ITCLiNicAl", 1));
    }

    @Test
    public void methodReturnsANotEmptyString() {
        assertFalse(service.returnNthCharacterUppercase("ITCLiNicAl", 1).isEmpty());
    }

    @Test
    public void methodReturnsOnlyUppercaseCharacters() {
        String textWithUppercaseAndLowercaseCharacters = "ITCLiNicAl";
        boolean thereAreAtLeastOneLowerCase = service.returnNthCharacterUppercase(textWithUppercaseAndLowercaseCharacters, 1)
                .chars()
                .anyMatch(character -> !Character.isUpperCase((char) character) );

        System.out.println(service.returnNthCharacterUppercase(textWithUppercaseAndLowercaseCharacters, 1));
        assertFalse(thereAreAtLeastOneLowerCase);
    }

    @Test
    public void methodReturnsOnlyTheNthCharacters() {
        int givenN = 2;
        String givenText = "ITCLiNicAl";
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "TLN");

        givenN = 3;
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "CNA");

    }
}

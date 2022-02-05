package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import service.ReturnNthCharacterUppercaseService;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class ReturnNthCharacterUppercaseServiceTest {
    ReturnNthCharacterUppercaseService service;
    @Before
    public void setUp() {
        service = new ReturnNthCharacterUppercaseService();
    }

    @Test
    public void methodReturnsAString() {
        assertNotNull(service.returnNthCharacterUppercase("STRING"));
    }

    @Test
    public void methodReturnsANotEmptyString() {
        assertFalse(service.returnNthCharacterUppercase("STRING").isEmpty());
    }

    @Test
    public void methodReturnsOnlyUppercaseCharacters() {
        String textWithUppercaseAndLowercaseCharacters = "ITClinical";
        boolean thereAreAtLeastOneLowerCase = service.returnNthCharacterUppercase(textWithUppercaseAndLowercaseCharacters)
                .chars()
                .anyMatch(character -> !Character.isUpperCase((char) character) );
        assertFalse(thereAreAtLeastOneLowerCase);
    }

}

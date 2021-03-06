package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import service.ReturnNthCharacterUppercaseService;

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
        assertEquals(
                service.returnNthCharacterUppercase(textWithUppercaseAndLowercaseCharacters, 1),
                "ITCLNA");
    }

    @Test
    public void methodReturnsOnlyTheNthCharacters() {
        int givenN = 2;
        String givenText = "ITCLiNicAl";
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "TLN");

        givenN = 3;
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "CNA");
    }

    @Test
    public void zeroOrNegativeNShouldReturnAnEmptyString() {
        int givenN = -2;
        String givenText = "ITCLiNicAl";
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "");

        givenN = 0;
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "");
    }

    @Test
    public void methodShouldReturnTheNthLetterNumberOrSpecialCharacter() {
        int givenN = 1;
        String givenText = "!tCL1Nical";
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "!CL1N");
    }

    @Test
    public void testPrintCountOfCharacters() {
        int givenN = 1;
        String givenText = "ItCLINiCAL";
        assertEquals(service.returnNthCharacterUppercase(givenText, givenN), "ICLINCAL");
    }

    @Test()
    public void nullGivenTextShouldReturnAnEmptyString() {
        assertEquals(service.returnNthCharacterUppercase(null, 1), "");
    }
}

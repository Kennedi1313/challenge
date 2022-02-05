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
        assertNotNull(service.returnNthCharacterUppercase("STRING"));
    }
}

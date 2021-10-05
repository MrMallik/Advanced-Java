package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import testing.code.Calculator;

import org.junit.jupiter.api.Test;

public class FirstJUnitTest {
    private final Calculator calc = new Calculator();

    @Test
    void addition(){
        assertEquals(2, calc.add(1,1));
    }
}

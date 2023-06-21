package com.srosales.cashcard;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class CashCardJsonTest {
    @Test
    public void myFirstTest() {
        int number = 42;
        assertThat(number).isEqualTo(42);
        //This test fails
        //assertThat(1).isEqualTo(42);
    }
}

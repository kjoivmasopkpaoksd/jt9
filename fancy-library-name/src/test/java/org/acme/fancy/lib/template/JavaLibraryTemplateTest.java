package org.acme.fancy.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaLibraryTemplateTest {

    @Test
    void toFunkyCase() {
        // given
        String input = "hello world!!!";

        // when
        String output = JavaLibraryTemplate.toFunkyCase(input);

        // then
        assertEquals("hElLo wOrLd!!!", output);
    }
}

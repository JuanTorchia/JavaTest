package com.platzi.javatests;

import org.junit.Test;

import static com.platzi.javatests.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(WEAK, PasswordUtil.assessPassword("1234567") );
    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh") );
    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234") );
    }

    @Test
    public void string_when_has_letters_symbols_and_numbers() {

        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!") );
    }


}
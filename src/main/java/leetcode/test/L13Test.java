package leetcode.test;

import leetcode.solutions.L13;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L13Test {
    @Test
    public void test() {
        System.out.println("***Test Roman to Integer***");
        assertEquals(L13.romanToInt("IV"), 4);
        assertEquals(L13.romanToInt("VI"), 6);
        assertEquals(L13.romanToInt("VIII"), 8);
        assertEquals(L13.romanToInt("IX"), 9);
        assertEquals(L13.romanToInt("XV"), 15);
        assertEquals(L13.romanToInt("XIX"), 19);
        assertEquals(L13.romanToInt("XL"), 40);
        assertEquals(L13.romanToInt("XLII"), 42);
        assertEquals(L13.romanToInt("LX"), 60);
        assertEquals(L13.romanToInt("LXXX"), 80);
        assertEquals(L13.romanToInt("LXXXIII"), 83);
        assertEquals(L13.romanToInt("XCIV"), 94);
        assertEquals(L13.romanToInt("XC"), 90);
        assertEquals(L13.romanToInt("CL"), 150);
        assertEquals(L13.romanToInt("CCLXXXIII"), 283);
        assertEquals(L13.romanToInt("DCCC"), 800);
        assertEquals(L13.romanToInt("MCMLXXXVIII"), 1988);
        assertEquals(L13.romanToInt("MMDCLXXXIII"), 2683);
        assertEquals(L13.romanToInt("MMDDCCLLXXVVII"), 3332);
        assertEquals(L13.romanToInt("MMMD"), 3500);
    }
}

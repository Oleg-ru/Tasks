package leetcode.test;

import leetcode.solutions.L14;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L14Test {
        @Test
        public void test() {
            System.out.println("*** Test Longest Common Prefix ***");
            assertEquals(L14.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
            assertEquals(L14.longestCommonPrefix(new String[]{"flower","flow","fight"}), "f");
            assertEquals(L14.longestCommonPrefix(new String[]{"flower"}), "flower");
            assertEquals(L14.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
            assertEquals(L14.longestCommonPrefix(new String[]{"",""}), "");
            assertEquals(L14.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}), "flower");
            assertEquals(L14.longestCommonPrefix(new String[]{"abca","abc"}), "abc");

    }
}

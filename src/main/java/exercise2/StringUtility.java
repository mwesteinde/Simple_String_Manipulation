package exercise2;

import java.util.Arrays;

public class StringUtility {

    /*
     * Consult the methods that are declared in class String. Visit
     * docs.oracle.com/javase/8/docs/api/java/lang/String.html. Some important
     * methods are charAt, length(), trim, substring, indexOf, isEmpty,
     * lastIndexOf, startsWith, endsWith, split.
     */

    /**
     * Return true iff str is a palindrome: it reads the same backwards and
     * forwards.
     * <p>
     * Examples: For str = "", return true For str = "ab", return false For str
     * = "aba", return true. For str = "abba", return true. For str = "Madam,
     * I'm Adam", return false. For str = "MadamImAdam", return false. For str =
     * "madamimadam", return true.
     *
     * @param str is not null
     * @return true if str is a palindrome and false otherwise
     */
    public static boolean isPalindrome(String str) {
        // Do not visit each character of the string more than once
        // each.

        // TODO: Implement this method

        return false;
    }

    /**
     * Return true if str is a palindrome or if it contains a smaller substring
     * of length >=2 that is a palindrome.
     * <p>
     * Examples: 'abba' would return true because it is a palindrome. 'dabba'
     * would also return true because 'abba' is a substring that is a
     * palindrome. 'decorum' would return 'false' because it is not a palindrome
     * and no substring of length >= 2 is a palindrome.
     *
     * @param str is not null
     * @return true if str has a substring with at least two characters that is
     * a palindrome and false otherwise.
     */
    public static boolean hasPalindromicSubstring(String str) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Return the number of times query occurs as a substring of mainString (the
     * different occurrences may overlap). Precondition: query is not null and
     * query is not the empty string "". Examples: For mainString = "ab", query
     * = "b", return 1. For mainString = "Luke Skywalker", query = "ke", return
     * 2. For mainString = "abababab", query = "aba", return 3. For mainString =
     * "abc", query = "", return 4
     *
     * @param mainString is not null and neither is it the empty string
     * @return a count of the number of times query appears in mainString
     */
    public static int countOccurrences(String mainString, String query) {
        // TODO: Implement this method
        return -1;
    }

    /**
     * Return true iff s1 and s2 are anagrams of each other. An anagram of a
     * string is another string that has the same characters, but possibly in a
     * different order. Like other methods of this class, this method too is
     * case-sensitive, so 'a' and 'A' are considered different characters.
     * <p>
     * Examples: For s1 = "mary", s2 = "army", return true. For s1 = "tom
     * marvolo riddle", s2 = "i am lordvoldemort", return true. For s1 =
     * "tommarvoloriddle", s2 = "i am lordvoldemort", return false. For s1 =
     * "foo", s2 = "bar", return false.
     *
     * @param s1 and s2 are not null
     * @return true if s2 is an anagram of s1, and false otherwise
     */
    public static boolean areAnagrams(String s1, String s2) {
        // TODO: Implement this method

        // You do not need to use iteration/recursion.
        // Hint: how can a sequence of characters be uniquely ordered
        // You might need to first convert the string to an array of
        // characters, and then use a function from class
        // [`Arrays`](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html).

        return false;
    }

}

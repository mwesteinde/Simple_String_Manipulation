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
        int StringLength=str.length();
        int i;

        if (str==null){
            return false;
        }

        if (str.isEmpty()){
            return true;
        }

        for (i=0;i<StringLength/2;i++){
            if (str.charAt(i)!=str.charAt(StringLength-1-i)){
                return false;
            }
        }
        return true;
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
        int StringLength=str.length();
        int i;

        if (str.isEmpty()||(str == null)){
            return false;
        }
        if (isPalindrome(str)){
            return true;
        }
        for (i=0;i<StringLength-1;i++){
            if (str.charAt(i)==str.charAt(i+1)){
                return true;
            }
        }
        for (i=0;i<StringLength-2;i++) {
            if (str.charAt(i) == str.charAt(i + 2)) {
                return true;
            }
        }
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
        int SubStringLength=query.length();
        int MainStringLength=mainString.length();
        int count=0;
        int counter=0;
        int i=0;
        int j;

        for (i=0;i<=(MainStringLength-SubStringLength);i++){
            for (j=0;j<SubStringLength;j++){
                if (mainString.charAt(i+j)!=query.charAt(j)){
                    break;
                }
                else {
                    counter++;

                }

            }
            if(counter==SubStringLength){
                count++;
                counter=0;
            }

        }

        return count;
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
        int [] array1=new int[53];
        int [] array2=new int[53];
        int lengths1=s1.length();
        int lengths2=s2.length();
        int i;
        char c;
        int place;

        for (i=0;i<lengths1;i++){
            c=s1.charAt(i);
            place= (int) c;
            if (place==32)
                array1[52]++;
            if (place>64&&place<91)
                array1[place-65]++;
            if (place>96&&place<123)
                array1[place-71]++;
        }
        for (i=0;i<lengths2;i++){
            c=s2.charAt(i);
            place= (int) c;
            if (place==32)
                array2[52]++;
            if (place>64&&place<91)
                array2[place-65]++;
            if (place>96&&place<123)
                array2[place-71]++;
        }
        if (Arrays.equals(array1,array2))
            return true;
        else
            return false;



        // You do not need to use iteration/recursion.
        // Hint: how can a sequence of characters be uniquely ordered
        // You might need to first convert the string to an array of
        // characters, and then use a function from class
        // [`Arrays`](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html).

    }

}
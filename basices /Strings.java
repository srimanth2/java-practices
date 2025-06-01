public class Strings {
    public static void main(String[] args) {
        // String declaration
        String str1 = "Hello";
        String str2 = "World";

        // String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // String length
        int length = str3.length();
        System.out.println("Length of the string: " + length);

        // String comparison
        boolean isEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + isEqual);

        // Substring
        String substring = str3.substring(0, 5);
        System.out.println("Substring: " + substring);

        // Character at a specific index
        char charAtIndex = str3.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex);
    }
    // String methods
    // 1. length() - returns the length of the string
    // 2. charAt(int index) - returns the character at the specified index
    // 3. substring(int beginIndex, int endIndex) - returns the substring from
    // beginIndex to endIndex
    // 4. equals(Object anObject) - compares this string to the specified object
    // 5. equalsIgnoreCase(String anotherString) - compares this string to another
    // string, ignoring case
    // 6. compareTo(String anotherString) - compares two strings lexicographically
    // 7. compareToIgnoreCase(String str) - compares two strings lexicographically,
    // ignoring case
    // 8. indexOf(int ch) - returns the index of the first occurrence of the
    // specified character
    // 9. indexOf(String str) - returns the index of the first occurrence of the
    // specified substring
    // 10. lastIndexOf(int ch) - returns the index of the last occurrence of the
    // specified character
    // 11. lastIndexOf(String str) - returns the index of the last occurrence of the
    // specified substring
    // 12. toLowerCase() - converts all characters in the string to lowercase
    // 13. toUpperCase() - converts all characters in the string to uppercase
    // 14. trim() - removes leading and trailing whitespace
    // 15. replace(char oldChar, char newChar) - replaces all occurrences of oldChar
    // with newChar
    // 16. replaceAll(String regex, String replacement) - replaces each substring of
    // this string that matches the given regular expression with the given
    // replacement
    // 17. split(String regex) - splits the string into an array of substrings based
    // on the given regular expression
    // 18. contains(CharSequence sequence) - returns true if this string contains
    // the specified sequence of char values
    // 19. startsWith(String prefix) - returns true if this string starts with the
    // specified prefix
    // 20. endsWith(String suffix) - returns true if this string ends with the
    // specified suffix
    // 21. isEmpty() - returns true if the string is empty
    // 22. valueOf(int i) - returns the string representation of the int argument
    // 23. valueOf(char[] data) - returns the string representation of the char
    // array argument
    // 24. valueOf(char[] data, int offset, int count) - returns the string
    // representation of the char array argument, starting at the specified offset
    // and extending for the specified count
    // 25. valueOf(Object obj) - returns the string representation of the object
    // argument
    // 26. format(String format, Object... args) - returns a formatted string using
    // the specified format string and arguments
    // 27. toCharArray() - converts the string to a new character array
    // 28. getBytes() - converts the string to a byte array
    // 29. getBytes(String charsetName) - converts the string to a byte array using
    // the specified charset
    // 30. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) - copies
    // characters from this string into the destination character array
    // 31. regionMatches(int toffset, String other, int ooffset, int len) - tests if
    // two string regions are equal
    // 32. regionMatches(boolean ignoreCase, int toffset, String other, int ooffset,
    // int len) - tests if two string regions are equal, ignoring case
    // 33. lastIndexOf(String str, int fromIndex) - returns the index of the last
    // occurrence of the specified substring, searching backward starting at the
    // specified index
    // 34. lastIndexOf(int ch, int fromIndex) - returns the index of the last
    // occurrence of the specified character, searching backward starting at the
    // specified index
    // 35. indexOf(String str, int fromIndex) - returns the index of the first
    // occurrence of the specified substring, searching forward starting at the
    // specified index
    // 36. indexOf(int ch, int fromIndex) - returns the index of the first
    // occurrence of the specified character, searching forward starting at the
    // specified index
    // 37. concat(String str) - concatenates the specified string to the end of this
    // string
    // 38. format(Locale l, String format, Object... args) - returns a formatted
    // string using the specified locale, format string, and arguments
    // 39. matches(String regex) - tells whether or not this string matches the
    // given regular expression
    // 40. replaceFirst(String regex, String replacement) - replaces the first
    // substring of this string that matches the given regular expression with the
    // given replacement
}

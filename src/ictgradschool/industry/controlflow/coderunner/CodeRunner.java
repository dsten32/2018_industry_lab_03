package ictgradschool.industry.controlflow.coderunner;

/**
 * Please run TestCodeRunner to check your answers
 */
public class CodeRunner {
    /**
     * Q1. Compare two names and if they are the same return "Same name",
     * otherwise if they start with exactly the same letter return "Same
     * first letter", otherwise return "No match".
     *
     * @param firstName
     * @param secondName
     * @return one of three Strings: "Same name", "Same first letter",
     * "No match"
     */
    public String areSameName(String firstName, String secondName) {
        String message = "";
        // TODO write answer to Q1
        if (firstName.equals(secondName)) {
            message = "Same name";
        } else if (firstName.charAt(0)==secondName.charAt(0)){
            message="Same first letter";
        } else {
            message="No match";
        }
        return message;
    }
    /** areSameName(String, String) => String **/


    /**
     * Q2. Determine if the given year is a leap year.
     *
     * @param year
     * @return true if the given year is a leap year, false otherwise
     */
    public boolean isALeapYear(int year) {
        boolean leapYear = false;
        // TODO write answer for Q2
        if (year % 4==0){
            leapYear=true;

        }
        if (year%100==0 && year%400!=0){
            leapYear=false;
        }

        return leapYear;
    }
    /** isALeapYear(int) => boolean **/


    /**
     * Q3. When given an integer, return an integer that is the reverse (its
     * numbers are in reverse to the input).
     * order.
     *
     * @param number
     * @return the integer with digits in reverse order
     */
    public int reverseInt(int number) {
        int reverseNum = 0;
        // TODO write answer for Q3
        String numString = "";


        while (number>0){
            int digit = number % 10;

            number/=10;

            numString=numString+digit;
        }
        reverseNum=Integer.parseInt(numString);
        return reverseNum;
    }
    /** reverseInt(int) => void **/


    /**
     * Q4. Return the given string in reverse order.
     *
     * @param str
     * @return the String with characters in reverse order
     */
    public String reverseString(String str) {
        String reverseStr = "";
        // TODO write answer for Q4
        int i=str.length();
        while (i>0){
            reverseStr=reverseStr+str.charAt(i-1);
            i--;
        }
        return reverseStr;
    }
    /** reverseString(String) => void **/


    /**
     * Q5. Generates the simple multiplication table for the given integer.
     * The resulting table should be 'num' columns wide and 'num' rows tall.
     *
     * @param num
     * @return the multiplication table as a newline separated String
     */
    public String simpleMultiplicationTable(int num) {
        String multiplicationTable = "";
        // TODO write answer for Q5
        return multiplicationTable;
    }
    /** simpleMultiplicationTable(int) => void **/


    /**
     * Q6. Determines the Excel column name of the given column number.
     *
     * @param num
     * @return the column title as a String
     */
    public String convertIntToColTitle(int num) {
        String columnName = "";
        // TODO write answer for Q6
        return columnName;
    }
    /** convertIntToColTitle(int) => void **/


    /**
     * Q7. Determine if the given number is a prime number.
     *
     * @param num
     * @return true is the given number is a prime, false otherwise
     */
    public boolean isPrime(int num) {
        // TODO write answer for Q7
        return true;
    }
    /** isPrime(int) => void **/


    /**
     * Q8. Determine if the given integer is a palindrome (ignoring negative
     * sign).
     *
     * @param num
     * @return true is int is palindrome, false otherwise
     */
    public boolean isIntPalindrome(int num) {
        // TODO write answer for Q8
        return false;
    }
    /** isIntPalindrom(int) => boolean **/


    /**
     * Q9. Determine if the given string is a palindrome (case folded).
     *
     * @param str
     * @return true if string is palindrome, false otherwise
     */
    public boolean isStringPalindrome(String str) {
        // TODO write answer for Q9
        return false;
    }
    /** isStringPalindrome(String) => boolean **/


    /**
     * Q10. Generate a space separated list of all the prime numbers from 2
     * to the highest prime less than or equal to the given integer.
     *
     * @param num
     * @return the primes as a space separated list
     */
    public String printPrimeNumbers(int num) {
        String primesStr = "";
        // TODO write answer for Q10
        return primesStr;
    }
}

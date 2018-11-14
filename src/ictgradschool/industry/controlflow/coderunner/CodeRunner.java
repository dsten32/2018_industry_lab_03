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
        //  write answer to Q1
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
        //  write answer for Q2
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
        //  write answer for Q3
        String numString = "";
        if (number==0){
            numString = "0";
        }
        Boolean isNegative = (number < 0);

        while (Math.abs(number)>0){
            int digit = Math.abs(number) % 10;

            numString=numString+digit;

            number/=10;

        }

        reverseNum=Integer.parseInt(numString);

        if (isNegative){
            reverseNum = reverseNum * -1;
        }
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
        //  write answer for Q4
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
        //  write answer for Q5
        int row=1;
        while (row<=num){

            int i=1;
            while (i<=num){
                if (i>1) {
                    multiplicationTable = multiplicationTable + " " + (i * row);
                } else {
                    multiplicationTable = multiplicationTable + (i * row);
                }
                i++;
            }
            if (row<num) {
                multiplicationTable = multiplicationTable + "\n";
            }

            row++;
        }

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
        if(num<=0){
            return "Input is invalid";
        }

        while (Math.abs(num)>0){
                if (num%26==0){
                    columnName = "Z"+columnName;
                    num -= 26;
                } else {
                    char colChar = (char) (num % 26 + 64);
                    columnName = colChar + columnName;

                    num /= 26;
                }

        }

//        else if (num % 26 ==0){
//            character=(char)(num+64);
//            columnName+=character;
//        }

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
        //  write answer for Q7
        int maxDiv = num/2;
        if(maxDiv==0){
            return false;
        }
        for (int i = 2;i<=maxDiv;i++){
            if (num % i == 0){
                return false;
            }
        }
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
        //  write answer for Q8

        int reverseTheNumber = reverseInt(num);
        if(Math.abs(num)== Math.abs(reverseTheNumber)){
            return true;
        }
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
        //  write answer for Q9
        String trimmedStr = (String) str.replaceAll(" ","");
        String reverseStr = reverseString(trimmedStr);
        if(trimmedStr.equals(reverseStr)){
            return true;
        }
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
        //  write answer for Q10

        int testPrime = 1;
        while (testPrime<=num) {
            if (isPrime(testPrime)) {
            primesStr=primesStr+testPrime+" ";

            }
            testPrime++;
        }
        primesStr=primesStr.trim();
        if (primesStr.equals("")){
            primesStr="No prime number found";
        }
        return primesStr;
    }
}

// Gulkaran Singh
// Roman Numeral Conversion Algorithm
// 2021.12.09

public class Roman {

    // Instance data - two arrays that have a 1:1 correspondence so values[5] holds the value associated to symbols[5]
    private static short[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    // Creating the constructor
    public Roman() {}

    // Getting the index if given a String parameter (1:1 correspondence) - helps find the num equivalent to the roman symbol
    private static int getIndex(String current) {
        int index = 0;

        // transversing the symbols array to find the element that matches the parameter
        // once the parameter equals one of the elements in the String array, it returns the index of that element
        for (String symbol : symbols) {
            if (current.equals(symbol)) {
                return index;
            } else
                index++;
        }

        // returns index if the parameter is the last element
        return index;
    }


    // Converting a string of Roman Numerals into a short
    public static short convertToInt(String romanString) {

        /* EXPLANATION - transverse the String input and add the corresponding numeric value to a running total.
           For example, "MCM", first iteration we add 1000. We continue this process and after the first element, we check
           whether the symbol before was smaller (e.g "MCM" at the third iteration we check if 'C' is smaller in terms of numeric value)
           If this statement is true we subtract twice the numerical value of the previous symbol total -= (2 * 100) */

        short numTotal = 0;

        // transversing the string keeping track of the current symbol and total
        for (int i = 0; i < romanString.length(); i++) {
            String currentSymbol = Character.toString(romanString.charAt(i));

            // start by adding the corresponding number value of the roman numeral symbol
            numTotal += values[getIndex(currentSymbol)];

            // once we've passed the first symbol, we need to check whether the symbol before was smaller
            // if the symbol before is smaller, we need to account for the roman subtraction rule
            if (i>0) {
                String beforeCurrentSymbol = Character.toString(romanString.charAt(i-1));

                // subtract 2 times the number value of the symbol before as we already added it once before
                if ((values[getIndex(currentSymbol)] > values[getIndex(beforeCurrentSymbol)]))
                    numTotal -= (2* values[getIndex(beforeCurrentSymbol)]);
            }
        }
        return numTotal;
    }


    // Converting a number into a string of Roman Numerals
    public static String convertToString(short number) {

        /* EXPLANATION - comparing the number input to the values array. Since the array is sorted in descending order,
           we are checking for how many times the highest valued roman symbols are present within our number input. For example
           1900 --> we check how many 'M' or 1000's are within the number 1900 using integer division. We can then concatenate
           to a string total that many times. We then want to continue to the next highest valued roman symbol which is "CM" or 900,
           so we can repeat this process. We do this with modular division (1900 % 1000 = 900) and repeat the initial process */

        String stringResult = "";

        // transversing the descending ordered values array
        for (int i = 0; i < values.length; i++) {
            short symbolCount = 0;

            // checking if the number passed is greater than the current element in the array
            if (number >= values[i]) {

                // dividing the number passed by the values of the values array (largest to smallest, M -> I)
                // this short division will tell us how many times that roman numeral needs to be added
                symbolCount = (short) (number / values[i]);

                // using the result from the short division (which rounds down), we concatenate to our result string that many times
                for (int j = 0; j < symbolCount; j++) {
                    stringResult += symbols[i];
                }

                // we use modular division to look at the next set of numbers --> e.g 1900 % 1000 = 900
                number %= values[i];
            }
        }
        // returns the final result after the values array has been transversed
        return stringResult;
    }
}

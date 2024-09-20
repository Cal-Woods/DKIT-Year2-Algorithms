package utils;

/**
 *
 * @author michelle
 * Contributed by Cal Woods
 */
public class ExerciseUtilities {
    // This class should contain your isOdd method. For utility methods 
    // such as this one, i.e. one where there's no stored data, it's just 
    // calculating a result and returning it without saving anything, or using any
    // saved information, it's better practice to make the method static
    //
    // e.g. public static void sayHello(String name)
    // This would print out "Hello, $name", i.e. the name contained in the name
    // variable. 
    // There's no information saved, there's no information used that isn't
    // supplied as a method parameter, so there's no point in making it an 
    // instance method, i.e. a method tied to a specific instance of a class
    /**
     * Checks if a given number is odd (i.e. not divisible by 2)
     * @param num The number to be checked
     * @return boolean True if the number is odd, false otherwise.
     */
    // todo: isOdd()

    //Cal Woods' work from here
    /**
     * This method will take in an int number value & will return a boolean true answer if number is odd, else false
     * @param int number used as value to check even/odd
     * @return A boolean value
     */
    public static boolean isOdd(int number) {
        if(number % 2 == 1 || number % 2 == -1) {
            return true;
        }
        //else number is even so return false
        else {
            return false;
        }
    }
                    // todo: evenOut()
                
    /**
    * This method takes an array & multiplies all odd values by two, leaving the even values untouched.
    * 
    * @param arr An int array to be iterated to find odd numbers & multiply each by 2
    * @Return nothing method returns nothing
    */
    public static void evenOut(int[] arr) {
        //Initialise for each loop
        for(int i = 0; i < arr.length; i++) {
            //Use if statement to check for odd value in every element of arr
            if(isOdd(arr[i])) {
                //multiply element value by 2
                arr[i] = arr[i] * 2;
            }
        }
    }

    // todo: findLongest()
    /**
     * This method will loop through a supplied String array to search for the longest String.
     * 
     * Iterates through a supplied String array, keeping track of the length of each String value.
     * 
     * @param arr A String array
     * 
     * @return String longest String value
     */
    public static String findLongest(String[] arr) {
        //Create int variable stored & initialise to 0
        int stored = 0;

        //Create String variable to store longest element in arr
        String longest = "";

        //If arr length is less than 1
        if(arr.length < 1) {
            //Return null
            return null;
        }

        //Initialise for each loop to iterate through arr
        for(String curr:arr) {
            //Check if String value length is greater than stored
            if(curr.length() > stored) {
                //Set stored value to the length of the element
                stored = curr.length();

                //Set longest String to current element value
                longest = curr;
            }
        }

        //Return longest value
        return longest;
    } 
}
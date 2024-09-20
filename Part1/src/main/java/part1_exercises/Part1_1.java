package part1_exercises;

import utils.ExerciseUtilities;
import utils.FileHandlingUtilities;

/**
 *
 * @author michelle
 * 
 * Contributed by Cal Woods
 */
public class Part1_1 {

    public static void main(String[] args) {
        // Reading in a file of numbers
        // This will read in the file specified and return an array containing all the numbers from that file
        int[] fileNumbers = FileHandlingUtilities.readNumericFile("SampleInput/Part1SampleInput2.txt");

        //Create two int variables to track count of even/odd numbers
        int even = 0, odd = 0;

        //Print fileNumbers array
        //Initialise for loop
        for(int i = 0; i < fileNumbers.length; i++) {
            //Print current element value
            System.out.println(fileNumbers[i]);
        }


        //Initialise for each loop
        for (int i : fileNumbers) {
            //Check if a number is odd
            if(ExerciseUtilities.isOdd(i)) {
                //Increment odd by 1
                odd++;
            }
            else {
                //Increment even by 1
                even++;
            }
        }

        //Multiply odd values in an array by 2
        //Call ExerciseUtilities.evenOut(int[] arr) from ExerciseUtilities class
        ExerciseUtilities.evenOut(fileNumbers);

        
        //Print empty line
        System.out.println();
        //Print fileNumbers array
        //Initialise for loop
        for(int i = 0; i < fileNumbers.length; i++) {
            //Print current element value
            System.out.println(fileNumbers[i]);
        }

        //Output number of even & odd numbers
        System.out.println("\nYou entered "+even+" even and "+odd+" odd numbers.");
    }
}
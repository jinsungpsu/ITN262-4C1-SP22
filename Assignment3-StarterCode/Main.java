/**
 * @author Jin An, Delaware Technical Community College
 * ITN262: Programming III
 * Assignment 1 Starter Code
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // The following is adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/
        BufferedReader br = null;
        try
        {
            //Reading the csv file
            br = new BufferedReader(new FileReader("src/pokemon.csv"));

            //Create List for holding Pokemon objects
            List<Pokemon> pokemonList = new ArrayList<Pokemon>();

            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null)
            {
                String[] pokemonDetails = line.split(",");
                // When the string is split, it will result in an array with the following information in the corresponding index
                // 0 - #
                // 1 - Name
                // 2 - Type1
                // 3 - Type2
                // 4 - Total
                // 5 - HP
                // 6 - Attack
                // 7 - Defense
                // 8 - Sp. Atk
                // 9 - Sp. Def
                // 10 - Speed
                // 11 - Generation
                // 12 - Legendary
                // *Note that pokemonDetails is an array of strings, so it must be cast to the appropriate data type when used in your program

                //System.out.println(pokemonDetails[1] + ", HP: " + pokemonDetails[5]);

                if(pokemonDetails.length > 0 )
                {
                    //Create a temporary pokemon
                    Pokemon pokemon = new Pokemon();

                    // Save the Pokemon details in Pokemon object
                    // ########### WHAT GOES HERE? #############
                    // Or, you can create a different constructor that initializes all the pokemon data

                    // Add the temporary pokemon to the ArrayList object
                }
            } // end of the while loop

            System.out.print(pokemonList);

            for (int i = 0; i < pokemonList.size(); i++) {
                System.out.println(pokemonList.get(i));
            }

        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
        // End of code adapted from Example 1. Using Buffered Reader and String.split() from https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/



    }

}



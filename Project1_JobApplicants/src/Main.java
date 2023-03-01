import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Path path = Paths.get("applicants.csv");

        try(Scanner input = new Scanner(path)){

            while(input.hasNext()){

                //saves next line of file as string
                String currentLine=input.nextLine();

                //divides into tokens
                String[] currentTokens = currentLine.split(",");

                for(int i = 0 ; i < currentTokens.length; i++){

                    currentTokens[i] = currentTokens[i].strip();

                }


                //error cases
                //1. missing @ symbol
                int validAddress = currentTokens[4].indexOf('@');

                //print error message if missing @ symbol
                if(validAddress<0){

                    System.out.println("invalid email");

                } else{

                //2. invalid character in first or last name

                    System.out.println(currentTokens[2]);

                    System.out.println(currentTokens[3]);


                } /* else {

                    System.out.println();

                //print email (pass tokens to separate function]

                }
*/


            }

        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

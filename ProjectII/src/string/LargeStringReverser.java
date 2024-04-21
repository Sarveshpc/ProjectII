package string;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LargeStringReverser {
    
	//if i say programmer get designed my own custom static private method :
    // Method to reverse a string
    private static String reverseString(String input) {
    	
    	//if you want designed faster execution using stringBuilder we can be modifierbale we can change and manipulating current object !
        StringBuilder reversed = new StringBuilder();
        
        //if you can do using foreach loop or for loop its very complex recurison you can be do collection  its work its !
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
    
    // Method to read a large string from file and reverse it
    public static void reverseLargeString(String inputFile, String outputFile) {
    	
    	//if you get decalred the exception using to built proper config designed my own custom instance object designed get exception occurs !
    	//if you want passed Regex package its better worked 
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            StringBuilder largeString = new StringBuilder();
            String line;
            
            // Read lines from the input file and append to largeString
            while ((line = reader.readLine()) != null) {
                largeString.append(line);
                largeString.append(System.lineSeparator()); // Add line separator if needed
            }
            //its inmutable string get invoke using toString() non-static data member easily invoked !
            
            // Reverse the large string
            String reversedString = reverseString(largeString.toString());
            
            // Write the reversed string to the output file
            writer.write(reversedString);
            
            System.out.println("Large string reversed successfully and written to " + outputFile);
            
            //if you ca i passed developer my own handle exception occurs best pratice programmer practice using multi-ple nested catch block its better practice !
            //if you can be declared and handle the exception occurs its jvm throws handle checkedException occurs using complie time exception !
            
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }

    
    //if i say developer get controller the programmes using JVM its controller its should be handle easily ! 
    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        // Reverse the large string from input file and write to output file
        reverseLargeString(inputFile, outputFile);
        
        //i just shows my error occurs its my file that my task i get completed ! 
        }
}






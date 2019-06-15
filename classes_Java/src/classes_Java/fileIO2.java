package classes_Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class fileIO2 {

	public static void main(String[] args) {
		BufferedReader reader;
		FileWriter writer;
		String fileContentsRead = "";

		// attempt to run code that may cause an error
		try{
		    // open the file for writing
		    writer = new FileWriter("story.txt");
		    // write the letter "a" inside of the file
		    writer.write("ass");
		    // close the file (finished writing)
		    writer.close();

		    // open the file for reading
		    reader = new BufferedReader(new FileReader("story.txt"));
		    String line;
		    while ((line = reader.readLine()) != null) {
		        fileContentsRead = fileContentsRead + line;
		    }
		    // close the file (finished reading)
		    reader.close();
		}
		// catch errors that happened in the try block
		catch(Exception e){
		    // print the stack trace (error)
		    e.printStackTrace();
		}
		finally{
		    System.out.println(fileContentsRead);

	}

}
}

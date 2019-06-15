package com.nickfonseca.L06HandsOn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class HandsOn {

	public static void main(String[] args) {
		//FileReader inputStream;
		//FileWriter outputStream;
		// --------STEP 1------------
		// array
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		StringBuilder sb = new StringBuilder();
		for(int i =0; i <songs.length; i++) {
			sb.append(songs[i]);
			
			sb.append(",");
		}
		//System.out.println(sb);

		/* --------STEP 2------------
		 * Take the previously built StringBuilder object and write the data inside of a file called songs.txt. 
		 * Add exception handling to the code to prevent errors from crashing the application. Errors should print 
		 * the stack trace along with the message "Error when writing songs.txt."
		 */
		//StringBuilder sb = new StringBuilder();
		//FileReader reader;
		//FileWriter writer;
		//String fileContentsRead = "";
		
		try {
			//open file for writing
			FileWriter writer = new FileWriter("songs.txt");			
			writer.write(sb.toString());			
			//Close file
			writer.close();		
		} catch (IOException ex) {
			System.out.println("Error when writing songs.txt");
		}
		// read the contents of the file
		try {			
			// setup a buffered read
			BufferedReader reader = new BufferedReader(new FileReader("songs.txt"));
			// holder for each line of text
			String line;
			// loop while there is content
			while ((line = reader.readLine()) != null)  {
				System.out.println(line);
			}
			
			// close you reader
			reader.close();
			
		} catch (IOException ex) {
			System.out.println("Error when reading songs.txt");			
		}
		
	}
}

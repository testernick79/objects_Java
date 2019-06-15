package classes_Java;
import java.io.FileReader;
import java.io.FileWriter;


public class fileIO {

	public static void main(String[] args) {
		FileReader inputStream;
		FileWriter outputStream;
		
		FileReader reader;
		FileWriter writer;
		String fileContentsRead = "";
		
		try {
			//open file for writing
			writer = new FileWriter("story.txt");
			
			//write a few lwtters in file
			writer.write("Hello My Name Is BOB!");
			
			//Close file
			writer.close();
			
			//Open file to read
			reader = new FileReader("story.txt");
			
			//Save characters as int
			int c;
			
			// while more charaters to be read store them
			while ((c = reader.read()) != -1) {
				fileContentsRead = fileContentsRead + c;
			}
			reader.close();
		}
catch(Exception e) {
	e.printStackTrace();
}
finally {
	System.out.println(fileContentsRead);
}
	}

}

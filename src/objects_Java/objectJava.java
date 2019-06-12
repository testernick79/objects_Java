package objects_Java;

public class objectJava {

	public static void main(String[] args) {
		String simpleString = "simple string";
		System.out.println(simpleString);
		
		String fancyString = new String("I'm so damn fancy!");
		System.out.println(fancyString);
		
		System.out.println(fancyString.length());
		
		String imEmpty = "";
		System.out.println(imEmpty.isEmpty());
		
		String fillText = "I'm added text";
		System.out.println(fillText.isEmpty());
		
		String quote = "I'm a great quote";
		
		quote = quote.replace('e', 'y');
		System.out.println(quote);

	}

}

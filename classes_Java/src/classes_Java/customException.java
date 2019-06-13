package classes_Java;

public class customException {

	public static void main(String[] args) throws Exception {
		int ssn = 123456789;
		
		try {
			if(ssn == 000000000) {
				 throw new Exception("Invalid SSN, Try again");
			}
			else {
				System.out.println("Valid SSN");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

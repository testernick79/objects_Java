package classes_Java;

public class exceptionHandle {

	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = 1/0;
		}
		catch(Exception e) {
			System.out.println("An error occured while calcultating");
			result = -1;
			e.printStackTrace();
		}
		finally {
			System.out.println("New result is: " + result);
		}

	}

}

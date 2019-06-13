package classes_Java;

public class classes_JavaBuiltIn {

	public static void main(String[] args) {
		//String finalString = "";
		String city[] = {"Portland", "New York", "LA", "Chicago"};
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < city.length; i++) {
			//finalString = finalString + city[i] + ", ";
			sb.append(city[i]);
			
			sb.append(", ");
		}
		System.out.println(sb);

	}

}

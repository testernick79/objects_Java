package objects_Java;

public class getterSetter {

	public static void main(String[] args) {
		student student1 = new student();
	    student student2 = new student("James", "Gosling", "Java");
	    
	    //Get first name
	    String firstNameStudent2 = student2.getfName();
	    System.out.println(firstNameStudent2);
	    
	    //Update first name
	    student2.setfName("Jorge Bob");
	    System.out.println(student2.getfName());
	    
	 // instantiate three student objects
	    student student11 = new student();
	    student student21 = new student();
	    student student3 = new student();

	    // set the information for student 1
	    student11.setFirstName("Harry");
	    student11.setLastName("Potter");
	    student11.setCourseFocus("Flying");

	    // set the information for student 2
	    student21.setFirstName("Ron");
	    student21.setLastName("Weasley");
	    student21.setCourseFocus("Herbology");

	    // set the information for student 3
	    student3.setFirstName("Hermione");
	    student3.setLastName("Granger");
	    student3.setCourseFocus("Potions");

	    // print information for each student
	    System.out.println(student11.getFirstName() + " " + student11.getLastName() + " is studying " + student11.getCourseFocus());
	    System.out.println(student21.getFirstName() + " " + student21.getLastName() + " is studying " + student21.getCourseFocus());
	    System.out.println(student3.getFirstName() + " " + student3.getLastName() + " is studying " + student3.getCourseFocus());
	}

	}



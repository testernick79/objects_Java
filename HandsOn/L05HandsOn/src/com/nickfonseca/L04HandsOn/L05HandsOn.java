package com.nickfonseca.L04HandsOn;

public class L05HandsOn {

	public static void main(String[] args) {
		class person {


		    public String first;
		    public String last;
		    public int age;


		    public person() {
		        first = "";
		        last = "";
		        age = 0;
		    }


		    public person(String firstName) {
		        this.first = firstName;
		        last = "";
		        age = 0;
		    }

		    public person(String firstName, String lastName) {
		        this.first = firstName;
		        this.last = lastName;
		        age = 0;
		    }

		    public person(String firstName, String lastName, int age) {
		        this.first = firstName;
		        this.last = lastName;
		        this.age = age;
		        validateAge();
		    }


		    private void validateAge() {
		        if(age < 0) {
		            age = 0;
		            System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
		        }
		    }


		    public String getFirstName() {
		        return first;
		    }

		    public void setFirstName(String firstName) {
		        this.first = firstName;
		    }

		    public String getLastName() {
		        return last;
		    }

		    public void setLastName(String lastName) {
		        this.last = lastName;
		    }

		    public int getAge() {
		        return age;
		    }

		    public void setAge(int age) {
		        this.age = age;
		        validateAge();
		    }
		}
		
		
        System.out.println("CREATE Bob1");
        person Bob1 = new person();
        System.out.println("Bob1 (no params) age = " + Bob1.getAge());

        // create `Person` with first name and print age
        System.out.println("CREATE P2");
        person Bob2 = new person("Billy");
        System.out.println("P2 (1 param) age = " + Bob2.getAge());

        // create `Person` with first and last names and print age
        System.out.println("CREATE P3");
        person Bob3 = new person("Sally", "Smith");
        System.out.println("P3 (2 params) age = " + Bob3.getAge());

        // create `Person` with all params and print age
        System.out.println("CREATE P4");
        person Bob4 = new person("Sofia", "Gonzalez", 24);
        System.out.println("P4 (all params) age = " + Bob4.getAge());

        // create `Person` with all params and bad age and print age
        //		The warning about the invalid age should be shown
        System.out.println("CREATE P5");
        person Bob5 = new person("Bad", "Age", -10);
        System.out.println("Bob5 (all params bad age) age = " + Bob5.getAge());

        // change age to invalid value
        //		The warning about the invalid age should be shown
        System.out.println("SET INVALID AGE");
        Bob4.setAge(-2);
        System.out.println("Set P4 age = " + Bob4.getAge());
    }

			
			
	}



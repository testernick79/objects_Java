package objects_Java;

public class student {
	String fName;
	String lName;
	String majorProfession;
	
	//Constructor
	public student() {
		fName = "";
		lName = "";
		majorProfession = "";
	}
	// overload constructor
	public student(String f, String l, String pro) {
		fName = f;
		lName = l;
		majorProfession = pro;
	}
	//Getter method
	public String getfName() {
		return fName;
	}
	//Setter method
	public void setfName(String newfName) {
		fName = newfName;
	}
	// getter method
    public String getFirstName(){
        return fName;
    }

    // setter method
    public void setFirstName(String newFirstName){
        fName = newFirstName;
    }

    // getter method
    public String getLastName(){
        return lName;
    }

    // setter method
    public void setLastName(String newLastName){
        lName = newLastName;
    }

    // getter method
    public String getCourseFocus(){
        return majorProfession;
    }

    // setter method
    public void setCourseFocus(String newCourseFocus){
        majorProfession = newCourseFocus;
    }

}

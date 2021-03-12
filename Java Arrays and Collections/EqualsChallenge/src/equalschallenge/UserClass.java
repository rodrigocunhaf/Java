package equalschallenge;

public class UserClass {
	//Name
	String name;
	
	//EMail
	String email;
	
	//Class contructor
	UserClass(String name , String email){
		this.name = name;
		this.email = email;
	}
	
	//Equals class method
	boolean EqualsMethod( Object object) {
		UserClass user = (UserClass) object;
		if (user.name.equals(this.name) && (user.email.equals(this.email))) {
			return true;
		}
		else {
			return false;
		}
	}
}

package equalschallenge;

public class EqualsChallengeMain {
	public static void main(String[] args) {
		
		UserClass p1 = new UserClass("ryan king","ryanking@???.com.br");
		
		UserClass p2 = new UserClass("ryan king","ryanking@???.com.br");
		
		//Wrong method verification
		System.out.printf("Wrong method [==]: %b\n",p1==p2);
		
		//Right method of verification
		System.out.printf("Right method verification [equals]: %b ",p1.EqualsMethod(p2));
	}
}

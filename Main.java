
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Diana", "Anderson", 36);
		Person person1 = new Person("King Artur", "Awsome", 128);
		
		String exampleString = "Example String";
        int exampleInt = 100;
        boolean isHappyBoolean = true;
        
        GenericMethods.printArguments(person, exampleString, exampleInt);
        GenericMethods.printArguments(isHappyBoolean, person1, isHappyBoolean);
	}

}

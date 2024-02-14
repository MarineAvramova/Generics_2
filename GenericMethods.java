
public class GenericMethods {

	
	public static <T, U, V> void printArguments(T thingsToPrint, U anotherToPrint, V oneMoreToPrint) {
		
		System.out.println(thingsToPrint + " Bla bla bla! I am a argument of T ");
		System.out.println(anotherToPrint + " I am argument of U!!! ");
		System.out.println(oneMoreToPrint + " I am an argument of V !! ");
	}
}

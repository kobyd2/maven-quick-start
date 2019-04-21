
package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class Application {

    public Application() {
        System.out.println ("Inside Application");
    }
	
	public static int countWords(String words) {
		String[] separatedWords = StringUtils.split(words, ' ');
		return (separatedWords == null) ? 0 : separatedWords.length;
	}
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
	
		for (String greeting : greetings) {
			System.out.println("Greeting: " + greeting);
		}
	}
    
	
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		System.out.println("Number of words is: " + countWords("I have four words"));
    }
}
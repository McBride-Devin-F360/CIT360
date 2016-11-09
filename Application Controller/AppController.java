import java.util.HashMap;

public class AppController {
	public static HashMap<String, doMath> hashMapOfOptions = new HashMap<String, doMath>();

	public void AppController(){

	}

	public static void optionsHandler(String option, Double num1, Double num2){
			hashMapOfOptions.put("one", new tipAmount());
			hashMapOfOptions.put("two", new splitTheCheck());

			doMath handler = hashMapOfOptions.get(option);

			handler.calculate(num1, num2);
	}






}
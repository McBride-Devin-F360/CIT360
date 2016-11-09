public class tipAmount implements doMath {
  
  public void calculate(Double num1, Double num2){
	  	Double checkTotal = num1 * num2 * .01;
	  	System.out.println("Your Check with a" + num2 + " % comes to a total of $" + checkTotal);
  }
	
}
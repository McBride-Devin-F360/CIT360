public class TestMVCCase {
	public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveJEFromDb();

      //Create a view : to write student details on console
      JournalView view = new JournalView();

      JournalController controller = new JournalController(model, view);

      controller.updateView();

      //update model data
      controller.setSubject("Test");

      controller.updateView();
   }
}
   private static Student retriveJEFromDb(){
      Journal JournalEntry = new JournalEntry();
      journal.setSubject("How to Use MVC");
      journal.setEntry("This is a test case for retrieving a Journal Entry from a fake database");
      return JournalEntry;
   }
}	

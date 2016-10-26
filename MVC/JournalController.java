public class JournalController{
	private JournalModel model;
	private JournalView view;

	public JournalController(JournalModel model, JournalView view){
	  this.model = model;
      this.view = view;
	}

	public void setJournalSubject(String subject){
		model.setSubject(subject);
	}

	public String getJournalSubject(){
      return model.getSubject();		
   }

   public void setJornalEntry(String entry){
     model.setEntry(entry);
   }

   public String getJournalEntry(){
   	return model.getEntry();
   }

   public void updateView(){
   	view.printJournalEntry(model.getSubject(), model.getEntry());
   }
}
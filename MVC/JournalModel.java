public class journalModel {
	public string subject;
	public string entry;
	public int id;

	public string getSubject(){
	return subject;
	}

	public void setSubject(String subject){
	 this.subject = subject;
	}

	public string getEntry() {
	return entry;
	}

	public void setEntry(String entry){
	this.entry = entry;
	}

	public int getId(){
	return id;
	}

	public void setId(int id){
	this.id = id;
	}
}
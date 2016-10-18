public class Journal {
	private int id;
	private String subject;
	private String entry;
	private int dayType;

	public Journal() {
	}

	public Journal(String subject, String entry, int dayType) {
		this.subject = fname;
		this.entry = lname;
		this.dayType = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public int getDayType() {
		return dayType;
	}

	public void setDayType(int dayType) {
		this.dayType = dayType;
	}
}

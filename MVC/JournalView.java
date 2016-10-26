public class JournalView {
   public void printJournalEntry(String subject, String entry, int id){
      System.out.println("Entry: ");
      System.out.println("Subject: " + subject);
      System.out.println("Roll No: " + entry);
      System.out.println("Date (without formating):" + id);
   }
}
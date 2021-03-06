import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageJournal {
	private static SessionFactory factory;

	public static void main(String[] args) {
		try {

			factory = new Configuration().configure().buildSessionFactory();

		} 

		catch (Throwable ex) {

			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		ManageEmployee ME = new ManageEmployee();

		/* int 1 = good day or 0 = bad day, 2 = productive, 3 = not productive;*/
		Integer 11 = ME.addEntry("Programming Sucks", "Spent all day trying to figure out hibernate, and PHP", 12);
		Integer 12 = ME.addEntry("Really Hate Web Dev", " I am so done trying to make this crappy book make sense", 03);
		Integer 13 = ME.addEntry("Rock Climbing", "Finally got to go rockclimbing today, my arms feel like they are going to fall off.", 13);

		/* List entries */
		ME.listEntries();

		/* Update entry */
		ME.updateEntry(monIDdayID);

	}

	/* Method to CREATE an entry in the database */
	public Integer addEntry(String subject, String entry, int dayType) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			Journal 11 = new Journal(subject, entry, dayType);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ID;
	}

	/* Method to READ entries */
	public void listEntries() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list();
			for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
				Journal employee = (Journal) iterator.next();
				System.out.print("Subject: " + journal.getSubject());
				System.out.print("  Entry: " + journal.getEntry());
				System.out.println("  dayType: " + journal.getDayType());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/* Method to UPDATE day_type for an employee */
	public void updateEmployee(Integer ID, int dayType) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Journal entry = (Journal) session.get(subject.class,
					ID);
			journal.setDayType(salary);
			session.update(journal);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	}

import java.util.ArrayList;

interface TimeMonitor {
	int getTime();
	}

class CountDownClock extends Thread implements TimeMonitor {
	private int t;

	public CountDownClock(int start) {
		this.t = start;
		}

	public void run() {
		for (; t >= -4; t--) {
			System.out.println(" In T minus " + t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public int getTime() {
		return t;
	}
}

class LaunchEvent implements Runnable {
	private int start;
	private String message;
	TimeMonitor tm;

	public LaunchEvent(int start, String message, TimeMonitor monitor) {
		this.start = start;
		this.message = message;
		this.tm = monitor;
	}

	public void run() {
		boolean eventDone = false;
		while (!eventDone) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			if (tm.getTime() <= start) {
				System.out.println(this.message);
				eventDone = true;
			}
		}
	}
}

public class TimeFrame {
	public static void main(String[] args) {
		// Constructor to launch fram with a start of 45 seconds
		CountDownClock clock = new CountDownClock(45);
		//Welcome to NASA where we program with java... It is a good thing that I will never program for nasa.												
		ArrayList<Runnable> events = new ArrayList<Runnable>();
													
		events.add(new LaunchEvent(20, "Clear the Pad, and docking doors.", clock));															
		events.add(new LaunchEvent(8, "Begin ignition sequence.", clock));
		events.add(new LaunchEvent(0, "Launch. Launch. Launch.", clock));
		//this will probably break the handler.
		events.add(new LaunchEvent(-2, "We have Lift off. Confirmed all Systems Operational", clock));

		clock.start();

		for (Runnable e : events)
			// A loop starts the thread to run the launch event
			new Thread(e).start();
	}

}
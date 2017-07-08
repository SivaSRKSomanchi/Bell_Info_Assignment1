package assignment9;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String object1 = "Siva";
		String object2 = "Ram";
		// t1 tries to acquire lock on object1, which was acquired by another
		// thread t2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (object1) {
					System.out.println("T1 locked Object1.");
				}

				try {
					Thread.sleep(100);
				} catch (Exception w) {
					System.out.println(w);
				}
				synchronized (object2) {
					System.out.println("T1 locked Object2.");
				}
			}
		};
		// t2 tries to acquire lock on object2, which was acquired by another
		// thread t1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (object2) {
					System.out.println("T2 locked Object2.");
				}

				try {
					Thread.sleep(100);
				} catch (Exception w) {
					System.out.println(w);
				}
				synchronized (object1) {
					System.out.println("T2 locked Object1.");
				}
			}
		};
		t1.start();
		t2.start();

	}

}

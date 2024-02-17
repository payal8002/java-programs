package cj3Program;
class MyRunnable implements Runnable{

	@Override
	public void run() {
	for(int i = 1; i <= 5; i++) {
       System.out.println("Task executing "+i);
	    }
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyRunnable m1 = new MyRunnable();
		MyRunnable m2 = new MyRunnable();
		Thread th1 = new Thread(m1);
		Thread th2 = new Thread(m2);
		th1.start();
		th2.start();
	}

}

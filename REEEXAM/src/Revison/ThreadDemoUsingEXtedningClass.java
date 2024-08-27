package Revison;

//extending thread
class Thread1 extends Thread {
	public void run() {
		int i;
		for (i = 0; i <= 50; i = i + 2) {
			System.out.println("even numbers are:" + i);
		}

	}
}

class Thread2 extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 50; i = i + 2) {
			System.out.println(i);
		}
	}
}

public class ThreadDemoUsingEXtedningClass {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		
	
	}

}



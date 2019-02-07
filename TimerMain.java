
public class TimerMain {

	public static void main(String[] args) throws InterruptedException {
		Timer1 timer1=new Timer1();
		Thread t1=new Thread(timer1);
		t1.start();
		t1.join();
		
		

	}

}

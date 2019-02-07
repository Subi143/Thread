
public class Timer1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Alert"+ i);
			
			try {
				Thread.sleep(10000);
			}catch(InterruptedException e)
			{
				System.out.println("thread is interuptted when it is sleeping" +e);
			}
			finally {
				System.out.println("done");
			}
		}
		
		
	}
	

}

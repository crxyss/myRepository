package cn.crxy.productAndcustom;

public class ThreadTest {

	public static void main(String[] args) {
		
		//线程： 1.线程执行操作使用.  2.线程管理者.

		Thread t1 = new Thread();
		t1.start();
		
		try {
			t1.wait();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			t1.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		t1.interrupt();
		
		//
		Thread.yield();
		
	}

}

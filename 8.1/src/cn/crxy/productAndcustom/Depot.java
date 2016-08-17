package cn.crxy.productAndcustom;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Depot {

	// 定义一个互斥锁.
	final Lock lock = new ReentrantLock();
	//定义监视器,监视锁内部线程操作.
	final Condition con1  = lock.newCondition(); 
	final Condition con2 = lock.newCondition(); 
	
	// 模拟仓库 :
	private int num = 0;

	// 提供外界 访问: 生产和消费.
	public void productNum() {

		// 多线程操作: 加锁同步.
		lock.lock();
		
		try {
			//如果有货,就等待.
			while(num>0){
				try {
					//使用监视器让锁中的线程等待.并暂时释放lock.
					con1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
				num++;
				System.out.println(Thread.currentThread().getName()
						+ "生产了一个苹果 ， 库存:" + num);
				
				//一旦生产了就应该唤醒等待的消费.
				con2.signalAll();
			
		} finally {
			lock.unlock();
		}
	}

	public void customNum() {

		//消费任务与生产任务使用同一个lock锁.
		lock.lock();
		
		try {
			
			//如果没货,就等待.
			while( num<=0 ){
				try {
					con2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
				num--;
				System.out.println(Thread.currentThread().getName()
						+ "消费了一个苹果 , 库存:" + num);
				
				//唤醒对方开始生产.
				con1.signalAll();
				
		} finally {
			lock.unlock();
		}
	}

}

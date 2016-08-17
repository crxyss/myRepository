package cn.crxy.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunImpl implements Runnable {
	
	//定义共有数据
	int num = 100;
	//定义一个互斥锁,让多个线程共同使用 : 其实互斥锁的使用等同于synchronized的使用.
	Lock l = new ReentrantLock(); 

	
	//默认抽象run任务函数
	@Override
	public void run() {
		
		while( num>0 ){
			
			//需要增加互斥锁. 
			try{
				//需要锁进行监控,单线程通过执行.
				l.lock();
				
				if( num<=0 ){
					break;
				}
				
				System.out.println("操作执行了一个任务:"+num);
				num--;
			}finally{
				//针对锁进行主动释放.
				l.unlock();
			}
			
		}
		
	}
	
	
}

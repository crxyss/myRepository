package cn.crxy.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExeutorDemo2 {

	public static void main(String[] args) {
		
		//ThreadPoolExeutor: 1.常见方法.
		
		//线程池.
		ThreadPoolExecutor tp= new ThreadPoolExecutor(5, 10, 600000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
		
		
//		ThreadPoolExecutor.DiscardPolicy
//		ThreadPoolExecutor.AbortPolicy
//		ThreadPoolExecutor.CallerRunsPolicy
		
		//模拟多个任务. 
		for (int i = 0; i < 16; i++) {
			MyTask mt = new MyTask();

			//使用:
			tp.execute(mt);
			
			//展示池中的状态:
			System.out.println( "池中的线程数:"+tp.getPoolSize()+" ， 当前任务数:"+tp.getTaskCount()+" , 已完成:"+tp.getCompletedTaskCount()+" , 队列数:"+tp.getQueue().size());
			
		}
		
		//关闭线程池不在接收新任务.
		tp.shutdown();
		
		
		//线程池默认使用方式:  1.线程池会在核心池中开辟线程去执行新任务. 
//						 2.如果核心线程池满了,会拿任务缓存队列存储任务.
//						 3.如果队列存储满了, 核心线程池也满了,就会开辟新的线程池线程对象去处理.
//						 4.如果整个线程池满了, 任务队列也满了,如果还有新任务,则会采取默认拒绝任务策略.
		

		
	}

}

//定义任务.
class MyTask implements Runnable{

	@Override
	public void run() {
			//自定义任务....
			System.out.println("线程正在执行任务.....");
			
			
			System.out.println("线程执行完成.....");
			
	}

}


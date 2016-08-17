package cn.crxy.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExeutorDemo1 {

	public static void main(String[] args) {
		
		//ThreadPoolExeutor: 1.常见方法.
		
		//线程池.
		ThreadPoolExecutor tp= new ThreadPoolExecutor(5, 10, 600000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
		
		
		//execute(Runnable command)  使用此函数执行任务.
		
		//submit(task); 此函数类似于executor, 比他要强大.有线程执行结果返回Future.
		
		//shutdown(); 此函数用于执行结束当前线程池任务. 拒绝接受新任务, 把当前任务结束.
		
		//tp.shutdownNow();此函数用于执行结束当前线程池任务. 返回未执行的任务.
		
		//线程状态: 就是标记线程状态的变量:    private volatile int value;
		//volatile关键字: 作用:类似于synchronized.及时得到最新的状态值.
		//可用状态如下:
//	    private static final int RUNNING    = -1 << COUNT_BITS;
//	    private static final int SHUTDOWN   =  0 << COUNT_BITS;
//	    private static final int STOP       =  1 << COUNT_BITS;
//	    private static final int TIDYING    =  2 << COUNT_BITS;
//	    private static final int TERMINATED =  3 << COUNT_BITS;
		
		//任务缓存队列:   private final BlockingQueue<Runnable> workQueue;
		// 可用子类:    基于数组结构:  ArrayBlockingQueue
		//			 基于链表结构:   LinkedBlockingQueue
		//			线程与任务同步:  synchronousQueue
		
		//核心线程池数:   private volatile int corePoolSize;
		
		//最大线程池数:   private volatile int maximumPoolSize;
		
		//当前线程数:    private volatile int poolSize;
		
//		private volatile RejectedExecutionHandler handler; 任务拒绝方法
//		ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常。 默认.
//		ThreadPoolExecutor.DiscardPolicy：也是丢弃任务，但是不抛出异常。
//		ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）
//		ThreadPoolExecutor.CallerRunsPolicy：由调用线程处理该任务

		 
//		private volatile ThreadFactory threadFactory;   //线程工厂，用来创建线程
		 
//		private int largestPoolSize;   //用来记录线程池中曾经出现过的最大线程数
		 
//		private long completedTaskCount;   //用来记录已经执行完毕的任务个数

		
	}

}

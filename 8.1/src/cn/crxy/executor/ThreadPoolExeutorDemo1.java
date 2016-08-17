package cn.crxy.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExeutorDemo1 {

	public static void main(String[] args) {
		
		//ThreadPoolExeutor: 1.��������.
		
		//�̳߳�.
		ThreadPoolExecutor tp= new ThreadPoolExecutor(5, 10, 600000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
		
		
		//execute(Runnable command)  ʹ�ô˺���ִ������.
		
		//submit(task); �˺���������executor, ����Ҫǿ��.���߳�ִ�н������Future.
		
		//shutdown(); �˺�������ִ�н�����ǰ�̳߳�����. �ܾ�����������, �ѵ�ǰ�������.
		
		//tp.shutdownNow();�˺�������ִ�н�����ǰ�̳߳�����. ����δִ�е�����.
		
		//�߳�״̬: ���Ǳ���߳�״̬�ı���:    private volatile int value;
		//volatile�ؼ���: ����:������synchronized.��ʱ�õ����µ�״ֵ̬.
		//����״̬����:
//	    private static final int RUNNING    = -1 << COUNT_BITS;
//	    private static final int SHUTDOWN   =  0 << COUNT_BITS;
//	    private static final int STOP       =  1 << COUNT_BITS;
//	    private static final int TIDYING    =  2 << COUNT_BITS;
//	    private static final int TERMINATED =  3 << COUNT_BITS;
		
		//���񻺴����:   private final BlockingQueue<Runnable> workQueue;
		// ��������:    ��������ṹ:  ArrayBlockingQueue
		//			 ��������ṹ:   LinkedBlockingQueue
		//			�߳�������ͬ��:  synchronousQueue
		
		//�����̳߳���:   private volatile int corePoolSize;
		
		//����̳߳���:   private volatile int maximumPoolSize;
		
		//��ǰ�߳���:    private volatile int poolSize;
		
//		private volatile RejectedExecutionHandler handler; ����ܾ�����
//		ThreadPoolExecutor.AbortPolicy:���������׳�RejectedExecutionException�쳣�� Ĭ��.
//		ThreadPoolExecutor.DiscardPolicy��Ҳ�Ƕ������񣬵��ǲ��׳��쳣��
//		ThreadPoolExecutor.DiscardOldestPolicy������������ǰ�������Ȼ�����³���ִ�������ظ��˹��̣�
//		ThreadPoolExecutor.CallerRunsPolicy���ɵ����̴߳��������

		 
//		private volatile ThreadFactory threadFactory;   //�̹߳��������������߳�
		 
//		private int largestPoolSize;   //������¼�̳߳����������ֹ�������߳���
		 
//		private long completedTaskCount;   //������¼�Ѿ�ִ����ϵ��������

		
	}

}

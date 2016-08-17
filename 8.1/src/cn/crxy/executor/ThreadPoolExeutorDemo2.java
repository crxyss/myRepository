package cn.crxy.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExeutorDemo2 {

	public static void main(String[] args) {
		
		//ThreadPoolExeutor: 1.��������.
		
		//�̳߳�.
		ThreadPoolExecutor tp= new ThreadPoolExecutor(5, 10, 600000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
		
		
//		ThreadPoolExecutor.DiscardPolicy
//		ThreadPoolExecutor.AbortPolicy
//		ThreadPoolExecutor.CallerRunsPolicy
		
		//ģ��������. 
		for (int i = 0; i < 16; i++) {
			MyTask mt = new MyTask();

			//ʹ��:
			tp.execute(mt);
			
			//չʾ���е�״̬:
			System.out.println( "���е��߳���:"+tp.getPoolSize()+" �� ��ǰ������:"+tp.getTaskCount()+" , �����:"+tp.getCompletedTaskCount()+" , ������:"+tp.getQueue().size());
			
		}
		
		//�ر��̳߳ز��ڽ���������.
		tp.shutdown();
		
		
		//�̳߳�Ĭ��ʹ�÷�ʽ:  1.�̳߳ػ��ں��ĳ��п����߳�ȥִ��������. 
//						 2.��������̳߳�����,�������񻺴���д洢����.
//						 3.������д洢����, �����̳߳�Ҳ����,�ͻῪ���µ��̳߳��̶߳���ȥ����.
//						 4.��������̳߳�����, �������Ҳ����,�������������,����ȡĬ�Ͼܾ��������.
		

		
	}

}

//��������.
class MyTask implements Runnable{

	@Override
	public void run() {
			//�Զ�������....
			System.out.println("�߳�����ִ������.....");
			
			
			System.out.println("�߳�ִ�����.....");
			
	}

}


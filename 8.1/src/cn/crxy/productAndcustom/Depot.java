package cn.crxy.productAndcustom;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Depot {

	// ����һ��������.
	final Lock lock = new ReentrantLock();
	//���������,�������ڲ��̲߳���.
	final Condition con1  = lock.newCondition(); 
	final Condition con2 = lock.newCondition(); 
	
	// ģ��ֿ� :
	private int num = 0;

	// �ṩ��� ����: ����������.
	public void productNum() {

		// ���̲߳���: ����ͬ��.
		lock.lock();
		
		try {
			//����л�,�͵ȴ�.
			while(num>0){
				try {
					//ʹ�ü����������е��̵߳ȴ�.����ʱ�ͷ�lock.
					con1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
				num++;
				System.out.println(Thread.currentThread().getName()
						+ "������һ��ƻ�� �� ���:" + num);
				
				//һ�������˾�Ӧ�û��ѵȴ�������.
				con2.signalAll();
			
		} finally {
			lock.unlock();
		}
	}

	public void customNum() {

		//������������������ʹ��ͬһ��lock��.
		lock.lock();
		
		try {
			
			//���û��,�͵ȴ�.
			while( num<=0 ){
				try {
					con2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
				num--;
				System.out.println(Thread.currentThread().getName()
						+ "������һ��ƻ�� , ���:" + num);
				
				//���ѶԷ���ʼ����.
				con1.signalAll();
				
		} finally {
			lock.unlock();
		}
	}

}

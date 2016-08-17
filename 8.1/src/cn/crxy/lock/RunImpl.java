package cn.crxy.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunImpl implements Runnable {
	
	//���干������
	int num = 100;
	//����һ��������,�ö���̹߳�ͬʹ�� : ��ʵ��������ʹ�õ�ͬ��synchronized��ʹ��.
	Lock l = new ReentrantLock(); 

	
	//Ĭ�ϳ���run������
	@Override
	public void run() {
		
		while( num>0 ){
			
			//��Ҫ���ӻ�����. 
			try{
				//��Ҫ�����м��,���߳�ͨ��ִ��.
				l.lock();
				
				if( num<=0 ){
					break;
				}
				
				System.out.println("����ִ����һ������:"+num);
				num--;
			}finally{
				//��������������ͷ�.
				l.unlock();
			}
			
		}
		
	}
	
	
}

package cn.crxy.lock;

public class LockDemo1 {
	public static void main(String[] args) {
		
		//��дrun������Ҫ�����������ݣ�. ʹ����ʾ���������ͬ������.
		
		//���������
		RunImpl r = new RunImpl();
		
		//���������߳�
		Thread t1 = new Thread( r );
		Thread t2 = new Thread( r );
		
		t1.start();
		t2.start();
		
	}
}

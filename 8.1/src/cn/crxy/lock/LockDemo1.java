package cn.crxy.lock;

public class LockDemo1 {
	public static void main(String[] args) {
		
		//编写run任务（需要操作共有数据）. 使用显示锁对象进行同步操作.
		//新修改新修改新修改新修改新修改新修改新修改新修改新修改新修改新修改新修改新修改新修改
		//定义个任务
		RunImpl r = new RunImpl();
		
		//定义两个线程
		Thread t1 = new Thread( r );
		Thread t2 = new Thread( r );
		
		t1.start();
		t2.start();
		
	}
}

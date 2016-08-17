package cn.crxy.productAndcustom;

public class Test {

	public static void main(String[] args) {
		
		//定一个存储共有数据的仓库.
		Depot d = new Depot();
		
		//定义生产和消费任务.
		ProductImpl pro = new ProductImpl( d );
		CustomImpl cus = new CustomImpl( d );
		
		Thread t0 = new Thread( pro );
		Thread t1 = new Thread( pro );
		
		
		Thread t2 = new Thread( cus );
		Thread t3 = new Thread( cus );
		
		
		t0.start();
		t1.start();
		
		t2.start();
		t3.start();
		
	}

}

package cn.crxy.productAndcustom;

public class Test {

	public static void main(String[] args) {
		
		//��һ���洢�������ݵĲֿ�.
		Depot d = new Depot();
		
		//������������������.
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

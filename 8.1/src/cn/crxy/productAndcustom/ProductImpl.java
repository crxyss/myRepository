package cn.crxy.productAndcustom;

public class ProductImpl implements Runnable {
	
	//����һ���ֿ�
	Depot dp;
	
	//��ʼ���ֿ�
	public ProductImpl(Depot d){
		this.dp = d;
	}
	
	
	@Override
	public void run() {
		while(true){
			dp.productNum();
		}
		
	}

}

package cn.crxy.productAndcustom;

public class CustomImpl implements Runnable {

	//����һ���ֿ�
	Depot dp;
	
	//��ʼ���ֿ�
	public CustomImpl(Depot d){
		this.dp = d;
	}
	
	@Override
	public void run() {
		while( true ){
			dp.customNum();
		}
	}
	

}

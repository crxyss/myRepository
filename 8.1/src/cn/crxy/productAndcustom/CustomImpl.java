package cn.crxy.productAndcustom;

public class CustomImpl implements Runnable {

	//定义一个仓库
	Depot dp;
	
	//初始化仓库
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

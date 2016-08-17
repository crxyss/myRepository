package cn.crxy.productAndcustom;

public class ProductImpl implements Runnable {
	
	//定义一个仓库
	Depot dp;
	
	//初始化仓库
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

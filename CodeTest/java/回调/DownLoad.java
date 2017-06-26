//模拟下载

public class DownLoad{
	
	//回调，方法参数应该是一个接口类型的更好
	public  void download(UpdateProcesser processer){
		//每2s更新一次下载进度
		try{
			for(int i=0;i<10;i++){
			Thread.sleep(2000);
			processer.out(i+"");
		}	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}

//下载调用者
public class DownLoader{
	public static void main(String[] args){
		System.out.println("start");
		new DownLoad().download(new UpdateProcesser());
		System.out.println("over");
	}
}

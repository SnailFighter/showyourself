import java.lang.Integer;

class ThrowsException {
	public void throwException(Integer a){
		int c = a/0;
	}
	public boolean noThrowException(Integer integer){
		int div = 0;
		if(div==0){
			return false;
		}
		return true;
	}
}
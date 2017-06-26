import java.util.Arrays;

public class Lamada{

	public static void main(String[] args){
		Arrays.asList("a","b","c").forEach(e->System.out.println(e));
		//返回值
		//System.out.println(Arrays.asList("a","b","c","d").sort((e1,e2)->e1.compareTo(e2)));
		//System.out.println(Arrays.asList( "v", "b", "d","a").sort((e1, e2)-> e1.compareTo(e2)));
	}

}

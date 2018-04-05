import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SubListTest {

	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=120;i++){
			list.add(i);
		}

		System.out.println("size:    "+list.size());

		int segmentNum = list.size()%20==0?list.size()/20:list.size()/20+1;
		System.out.println("list.size()/20 = "+list.size()/20);
		System.out.println("segmentNum:    "+segmentNum);
		System.out.println();


		String str = "";
		for(int i=0;i<(segmentNum-1);i++){
			str="";
			for(int j=0;j<list.subList(i*20,(i+1)*20).size();j++){
				str+=","+list.subList(i*20,(i+1)*20).get(j);
			}
			System.out.println(str);
		}

		//handle last time 
		str="";
 		for(int j=0;j<list.subList((segmentNum-1)*20,list.size()-1).size();j++){

			str+=","+list.subList((segmentNum-1)*20,list.size()).get(j);
		}
		System.out.println(str);

	}

}
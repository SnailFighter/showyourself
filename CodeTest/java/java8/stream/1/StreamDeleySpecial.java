// the example prove the deley of steam operation
// steam operation ,we must understand the operation's order. And if you want to continue a next special operation,
//you must return a Stream object by last method. 
//in the other word,Steam operation should return Stream one by one.
import java.util.stream.Stream;

class StreamDeleySpecial {
	public static void main(String[] args){
		Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> {
				System.out.println("filter: " + s);
				return true;
				});



		//because forEach function return void ,so the stream operation will be interrupt.		
		Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> {
				System.out.println("filter: " + s);
				return true;
				})
				.forEach(s -> System.out.println("forEach: " + s));



		//because the anyMatch function return a bealoon value rather than Stream object,so the stream operation will
		//be interrupt .
		Stream.of("d5", "a2", "b1", "b3", "c","d2")
				.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
				})
				.anyMatch(s -> {
				System.out.println("anyMatch: " + s);
				return s.startsWith("A");
				});

		//as you see,the forEach function only be executed one time.because foreach is a void function,when it 
		// is executed first time ,it returns a void value,and this will lead to there not is other forEach function will be 
		//executed.
		Stream.of("d2", "a2", "b1", "b3", "c")
				.map(s -> {
				System.out.println("map: " + s);
				return s.toUpperCase();
				})
				.filter(s -> {
				System.out.println("filter: " + s);
				return s.startsWith("A");
				})
				.forEach(s -> System.out.println("forEach: " + s));


	}
} 
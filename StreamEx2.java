import java.util.stream.Stream;

// converting array, or collecion of objects into stream objects

public class StreamEx2 {

	public static void main(String[] args) {
		Stream<Integer> sm = Stream.of(10, 20, 30, 40, 50, 60, 70);
		sm.forEach(System.out::println);
		
		Float[] arr = {10.f, 30.f, 45.5f, 56.8f, 132.4f};
		
		Stream<Float> sm1 =  Stream.of(arr);
		sm1.forEach(System.out::print);
 
	}

}

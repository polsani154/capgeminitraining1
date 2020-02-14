package practise;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Streams {

	public Streams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		String[] str = {"polsani","sandeep","is","a","good","boy"};
		Stream<String> stream=Stream.of(str);
//		BinaryOperator<String> b;
		Optional<String> s=stream.findFirst();
		
		
	}
}

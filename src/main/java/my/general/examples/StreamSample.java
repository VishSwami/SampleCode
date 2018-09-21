package my.general.examples;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamSample {
	public static void main(String [] args) {
		int [] list = new int [100];
		for(int i = 0; i < 100; i++) {
			list[i]=i;
		}
		IntStream is = Arrays.stream(list);
		
	}
}
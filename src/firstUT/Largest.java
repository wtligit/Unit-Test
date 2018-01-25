package firstUT;

public class Largest {
	public static int largest (int[] list) {
		int max=Integer.MIN_VALUE;
		if(list.length == 0) {
			throw new RuntimeException("Empty list");
		}
		for(int i=0;i<list.length;i++) {
			if(list[i]>max) {
				max = list[i];
			}
		}
		return max;	
	}
}
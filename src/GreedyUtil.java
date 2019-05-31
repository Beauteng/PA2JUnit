import java.util.Collection;
import java.util.LinkedList;

public class GreedyUtil {
	public static Collection GreedyUtil(int arr[], int val) {
		Collection<Integer> list = new LinkedList();
		if(arr.length == 0 || val < arr[0]) {
			throw new NullPointerException("Input Invalid");
		}else {
			for(int i = arr.length-1 ; i > -1 ; i--) {
				while(val - arr[i] >= 0) {
					val -= arr[i];
					list.add(arr[i]);
				}
			}
		}
		System.out.print(list);
		System.out.println();
		return list;
	}
}

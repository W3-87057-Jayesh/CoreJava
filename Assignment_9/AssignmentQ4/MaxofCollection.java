import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxofCollection {
	    
	    public static <T extends Number & Comparable<T>> T findMax(List<T> list) {
	        if (list == null || list.isEmpty()) {
	            throw new IllegalArgumentException("List cannot be null or empty");
	        }
	        T max = list.get(0);
	        for (T element : list) {
	            if (element.compareTo(max) > 0) {
	                max = element;
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        List<Integer> intList = new ArrayList<>
	        (Arrays.asList(10, 20, 30, 50, 40));
	        List<Double> doubleList = new LinkedList<>
	        (Arrays.asList(10.5, 20.4, 9.7, 50.8, 40.3));

	        System.out.println("Integer List: " + intList);
	        System.out.println("Double List: " + doubleList);

	        System.out.println("Max in Integer List: " + findMax(intList));
	        System.out.println("Max in Double List: " + findMax(doubleList));
	    }
}

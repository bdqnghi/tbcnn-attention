package java_programs_missing_line;
import java.util.*;




public class BUCKETSORT {
    public static ArrayList<Integer> bucketsort(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> counts = new ArrayList<Integer>(Collections.nCopies(k,0));
        for (Integer x : arr) {
            
        }

        ArrayList<Integer> sorted_arr = new ArrayList<Integer>(100);
	int i = 0;
        for (Integer count : counts) { 
	    sorted_arr.addAll(Collections.nCopies(count, i));
	    i++;
        }

        return sorted_arr;
    }
}

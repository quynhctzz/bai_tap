import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;


public class baitap2 {
    public static void main(String[] args){

        List<Integer> unsortedList = Arrays.asList(1,10,9,21,-5,6,-2);

        List<Integer1> sortedList = unsortedList
             .stream()
             .sorted()
             .collect(collectors.toList());

             System.out.println("Before sorting : " + unsortedList);
             System.out.println("After sorting : " + sortedList);

        List<Integer1> sortedList1 = unsortedList
             .stream()
             .sorted(Comparator.reverseOrder())
             .collect(collectors.toList());
             
             System.out.println("Before sorting : " + unsortedList);
             System.out.println("After sorting : " + sortedList);


    
    
    
    
    
    }

}
    
  
       
        


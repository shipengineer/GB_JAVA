import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
 /**
  * ArrayList
  */
 public class ReverseArrayList {
 
    
     
         public static<T> List<T> reverseList(List<T> list)
         {
             List<T> reverse = new ArrayList<>(list.size());
      
             new LinkedList<>(list)
                     .descendingIterator()
                     .forEachRemaining(reverse::add);
      
             return reverse;
         }
      
         public static void main(String[] args)
         {
             List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
      
             List<Integer> reverse = reverseList(list);
             System.out.println(reverse);
         }
     }
 
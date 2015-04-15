import java.io.ObjectInputStream.GetField;
import java.util.Vector;
 
public class BasicVectorOperations {
 
    public static void main(String a[]){
	        Vector<String> vec = new Vector<String>();
	        vec.add("First");
	        vec.add("Sec");
	        vec.add("3rd");
	        vec.add("Fourth");
	        vec.add("fifth");
	       
		 System.out.println(vec);    
		 System.out.println("" +vec.get(2));
		 System.out.println("" +vec.get(3));      
		 System.out.println("" +vec.get(4));
		 
		 System.out.println("element at  " +vec.elementAt(3)); 
		 System.out.println("" +vec.firstElement());
		 System.out.println("" +vec.lastElement());
        
    }
       
}

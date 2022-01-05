package test;
import java.util.*;

public class SchoolRegister {
	  static void ex11(String[] bus1, String[] bus2, String[] registry){
		    ArrayDeque<String> students = new ArrayDeque<String>();
		    String a = "";
		    for(int i = 0;i<bus1.length;i++){
		      students.add(bus1[i]);
		      students.add(bus2[i]);
		    }
		    while(!students.isEmpty()){
		      a = students.poll();
		      for(int i = 0;i<registry.length;i++){
		        if(registry[i] == a){
		          System.out.println(a + " is not absent");
		          break;
		        } 
		      }
		    }
		  }
	public static void main(String[] args) {
	    String[] bus1 = new String[]{"Roger", "John", "Nikos", "Marion", "Hellen"};
	    String[] bus2 = new String[]{"Nora", "Bill", "Eliza", "Takis", "Alex" };
	    String[] registry = new String[]{"Alex", "John", "Elina", "Nikos", "Leo", "Marion", "Hellen", "Nora", "Bill", "Eliza", "Takis", "Roger"};
	    ex11(bus1, bus2, registry);

	}

}

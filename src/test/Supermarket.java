package test;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Supermarket {
	  static void ex12(String[] cashier1, String[] cashier2){
		    ArrayDeque<String> customer1 = new ArrayDeque<String>();
		    ArrayDeque<String> customer2 = new ArrayDeque<String>();
		    ArrayList<String> time = new ArrayList<String>();
		    double tot_b = 0;
		    double tot_c = 0;
		    for(int i = 0;i<3;i++){
		      customer1.add(cashier1[i]);
		      customer2.add(cashier2[i]);
		    }
		    while(!customer1.isEmpty()){
		      String d = customer1.poll();
		      double c = Math.floor((Math.random() * 100) +1);
		      if(c>60){
		        time.add(d);
		      }
		      tot_b = tot_b + c;
		    }
		    while(!customer2.isEmpty()){ // can be optimised
		      String d = customer2.poll();
		      double c = Math.floor((Math.random() * 100) +1);
		      if(c>60){
		        time.add(d);
		      }
		      tot_c = tot_c + c;
		    }
		    for(int i = 0;i<time.size();i++){
		      System.out.println(time.get(i));
		    }
		    if(tot_b > tot_c){
		      System.out.println("CASHIER1 is slower");
		    }else{
		      System.out.println("CASHIER2 is slower");
		    }

		  }


	public static void main(String[] args) {
	    String[] cashier1 = new String[]{"Roger", "John", "Nikos", "Marion"};
	    String[] cashier2 = new String[]{"Nora", "Bill", "Eliza", "Takis"};
	    ex12(cashier1, cashier2);

	}

}

package assignment.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		Logger log1=Logger.getLogger("hi");
		hs.add(5);
		hs.add(50.23);
		hs.add(500);
		hs.add(52);
		hs.add(51);
		hs.add(5);
		log1.log(Level.INFO,()->"Elements are"+hs);
		hs.remove(51);
		log1.log(Level.INFO,()->"After removing the elements are"+hs);
		log1.log(Levelo.INFO,()->"Size of Hashset is "+ hs.size()); 
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(23);
		ll.add(45);
		ll.add("hi");
		ll.add('c');
		ll.add(23);
		log1.log(Level.INFO,()-> "Values in LinkedList"+ ll);
		
		HashSet<String> hs1 = new HashSet<String>(ll);
		log1.log(Level.INFO,()-> "Values after adding linkedlist elements"+ hs1);
		hs1.clear();
		log1.log(Level.INFO,()-> "Values after cleared"+ hs1);
		log1.log(Level.INFO,()-> "Size after cleared  "+ hs1.size());
		
		
		

	}

}

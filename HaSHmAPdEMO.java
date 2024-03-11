package mypacakge;

import java.util.HashMap;

public class HaSHmAPdEMO {

	public static void main(String[] args) {
	
		HashMap<Integer,String> heap = new HashMap<Integer,String>();
		// we can all yse map as it is the parent to hashmap
		heap.put(101, "Arun");
		heap.put(102, "thArun");
		heap.put(103, "vArun");
		heap.put(104, "kiran");
	
		for (Integer i : heap.keySet()){
			
			System.out.println(heap.get(i));
		}
	
	}

}

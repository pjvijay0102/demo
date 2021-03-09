package collections_concept;
import java.util.*;
public class Keyvalue_fetch {

	public static void main(String[] args) {
		
		Map <Integer , String> hmap = new HashMap<Integer , String>();
		hmap.put(1, "vijay");
		hmap.put(7, "vinoth");
		hmap.put(3, "hari");
		hmap.put(6, "sugu");
		
		List <Integer >list = new ArrayList<Integer>();
		list.addAll(hmap.keySet());
		System.out.println(list);
		
		for(Integer i:list)
		System.out.println( "key value:  " +i +" values: " +" "+hmap.get(i));

	}

}

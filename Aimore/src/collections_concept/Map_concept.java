package collections_concept;
import java.util.*;
import java.util.Map.Entry;
public class Map_concept {

	public static void main(String[] args) {
		Map <Object,Object> hmap = new HashMap<Object,Object>();
		hmap.put(31, "Vijay");
		hmap.put(112, "Vino");
		hmap.put(3, "Hari");
		hmap.put(14, 10);
		hmap.put(1,"raj");
		hmap.put(2, "fg");
		hmap.put(21, "ff");
		hmap.put(12, "fd");
		hmap.put(32, "f1");
		
		TreeMap<Object,Object> tr = new TreeMap<Object,Object>();
		tr.putAll(hmap);
		
		
		System.out.println(tr);
			for(Map.Entry<Object,Object> i :tr.entrySet()){
				System.out.println(i);
			}
		}

}

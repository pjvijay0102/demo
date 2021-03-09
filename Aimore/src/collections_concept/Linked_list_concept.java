package collections_concept;



import java.util.*;
public class Linked_list_concept {

	public static void main(String[] args) {
		Integer [] a={1,3,5,7,5};
		
		List<String> Linked_list = new LinkedList<String>();
		List <Object> A_l=new ArrayList<Object>();
		
		Linked_list.add("vijay");
		Linked_list.add("Vinoth");
		Linked_list.add("remo");
		
		Collections.sort( Linked_list);
		System.out.println(Linked_list);
		Collections.sort(Linked_list,Collections.reverseOrder());
		System.out.println(Linked_list);
		
		A_l.addAll(Linked_list);
		System.out.println(A_l);
		
		List<Integer> A=new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(A);
		
		Object[] str = new String[A_l.size()];
		
		for(int i=0;i<str.length;i++){
			str[i]= A_l.get(i);
			System.out.println(str[i]);
		}
		
	}

}

package collections_concept;
import java.util.*;
public class ArrayList_method {
	
	static List arr_list = new ArrayList();
	
	public static void main(String[] args) {
		for_loop_using();
		while_loop_using();
		do_while_loop_using();
		for_each_using();
	}
	static void list_method(){
	
		arr_list.add(1);
		arr_list.add("vijay");
		arr_list.add('3');
		arr_list.add(40.5);
	}
	static void for_loop_using(){
		
		list_method();
		System.out.println("for loop using ....");
		for(int i=0;i<arr_list.size();i++){
			System.out.println(arr_list.get(i));
		}
		System.out.println("---------------");
	}
	
	static void while_loop_using(){
		
		System.out.println("while loop using ....");
		int i=0;
		while(i<arr_list.size() ){
			System.out.println(arr_list.get(i));
			i++;
		}
		System.out.println("---------------");
	}

	static void do_while_loop_using(){
		System.out.println("do while loop using ....");
		int i=0;
		do{
			System.out.println(arr_list.get(i));
			i++;
		}while(i<arr_list.size() );
		System.out.println("---------------");
	}
	
	
	static void for_each_using(){
		System.out.println("for each loop using ....");
		for(Object i:arr_list){
			System.out.println(i);
		}
		System.out.println("----------------");
	}

}

/*Set contains only unique elements
 *Hash set uses mechanism called as hashing
 *here our task is to copy all elements from set 2 to set 1 so that set 1 is union of set 1 and set 2
 *thus we can say that set 1 formed is unique as it is union of set 1 and set 2
 *Program is illustrated as follows*/



import java.util.HashSet;  //importing HashSet
import java.util.Set;      //importing Set
import java.util.Iterator; //importing Iterator used for traversing

class HashingClass {   //class named HashingClass

	public static void main(String[] args){   //main method
    
		Set<Integer> set1 = new HashSet<Integer>();  //creating HashSet
		Set<Integer> set2 = new HashSet<Integer>();
    
		//Adding elements to set 1
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		
		Iterator<Integer> it = set1.iterator();   //iterator used for traversing Set 1
		System.out.println("Elements of Set 1 :");  //printing elements of Set 1
		 while(it.hasNext()){                     //while set has next element this loop runs
		        System.out.print(it.next()+" ");    //elements of set 1 are printed
		 	}
		//Adding elements to set 2
		set2.add(3);
		set2.add(4);
		set2.add(6);
		set2.add(9);
		set2.add(1);
			
		Iterator<Integer> its = set2.iterator();  //iterator used for traversing Set 2
		System.out.println("\nElements of Set 2 :"); //printing elements of Set 2
		while(its.hasNext()){     //while set has next element this loop runs
		        System.out.print(its.next()+" ");    //elements of set 2 are printed
		 	}
		 
		 set1.addAll(set2);                           // Copy all the elements from set2 to set1 (set1 += set2)
		// set1 becomes the union of set1 and set2
		 
		 Iterator<Integer> itm = set1.iterator();  //iterator for traversing this set1 which is now union
		 System.out.println("\nNow elements of Set 1 are :");  //printing elements of Set 1 now
		 while(itm.hasNext()){           //while set has next element this loop runs
		        System.out.print(itm.next()+" ");   //union elements are printed  
		 	}
		 System.out.println("\n\nThus Set 1 is union of Set 1 and Set 2");  //result
	}//end of main
}//end of class

//thus after set1.addAll(set2)  set 1 is union of set 1 and set 2
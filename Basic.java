 public class ArrayList{
          public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
            
	      	int n = 100;    	// Declaring the ArrayList with initial size n
	      	ArrayList <Integer> arr1 = new ArrayList<Integer>();
          ArrayList <Integer> list = new ArrayList <Integer>();
      
          list.add(23);
          list.add(12);
          list.add(21);
          list.add(87);
          
        for (int i=0;i<list.size();i++){
          System.out.println(list.get(i));
        }

        System.out.println(list.get(3));
        list.set(3, 54);

        for (int i=0;i<list.size();i++){
          System.out.print(list.get(i)+" ");
       }

        System.out.println();

        Collections.sort(list);
        System.out.println(list);

      //  removing element 2 from the ArrayList
        list.remove(2);
        System.out.println(list);
                            
      //  Declaring the ArrayList
		    ArrayList<Integer> arr2 = new ArrayList<Integer>();

		  // Printing the ArrayList
		    System.out.println("Array 1:" + arr1);
		    System.out.println("Array 2:" + arr2);

		  // Appending new elements at the end of the list

		    for (int i = 1; i <= n; i++) {
		  	arr1.add(i);
			  arr2.add(i);
		  }
		    System.out.println("Array 1:" + arr1);
	    	System.out.println("Array 2:" + arr2);
	  }
}


            
        
            

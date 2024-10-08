import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *The ListPorcessor class is to process data entered for a linked list
 * 
 * @author Troy Scott
 * @version 1.0.0
 * @since Week 4 of CSC62302
 */

public class ListProcessor {

    private LinkedList<Integer> numberedList;
    
    /**
     * This is the constructor for the ListProcessor
     * The constructor initiates LinkedList as numberedList.  
     * The constructor reuses the java.util.LinkedList.  
     */
    public ListProcessor() {
        numberedList = new LinkedList<>();
    }

    /**
     * Methodd to add a single integer to a linkedlist with no duplicates
     * method reuses util.LinkedList.add(num) to add a number to the LinkedList.  
     * @param num contains the integer to be added to the linkedlist
     */
    public void addNumberDistinct(Integer num) {
        if (!numberedList.contains(num)){
            numberedList.add(num);
            System.out.println("Added number: " + num);
        }
        else
        {
            System.out.println(num + "Already exists in list. ");
        }
        
    }

    /**
     * Method to add a single integer to the linkedlist.  Duplicates Allowed.
     * Method reuses util.LinkedList.add(num) to add the number to the linkedlist.
     * @param num contains the integer to be added to the linkedlist
     */
    public void addNumber(Integer num) {

            numberedList.add(num);
                
    }

    /**
     * Method to add 1 to n integers contained in an arrayList to a linkedlist.  The linkedlist is then Sorted.
     * Method reuses util.arrayList as a parameter.  
     * Method reuses util.LinkedList.add to add the number to the linkedlist.  
     * Method reuses the util.Collections to sort the LinkedList.  
     * @param nums The arrayList containing the integers to be added to the linked list
     */
    public void addArrayList(ArrayList<Integer> nums){
        for (Integer num : nums) {

            numberedList.add(num);

        }

        Collections.sort(numberedList);

    }
    
    /**
     * Method used to print the contents of the linkedList.
     * This method reuses the util.linkedlist to store Integers.  
     * This method reuses the util.ListIterator to loop through the linkedlist to print the elements in the linkedlist.   
     */
    public void displayList(){
        System.out.println("The integers entered into the list are displayed below: ");
        ListIterator<Integer> numList = numberedList.listIterator();
        while (numList.hasNext()){

            System.out.println(numList.next());
        }

    }




    
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


public class TestHeap {
	
	public static void main(String[] args){
	    
		//create a new object and add a custom comparator that provides the "MinHeap" behaviour.

		/*
		class minHeapComparator implements Comparator<Integer> 	{
		    @Override
		    public int compare(Integer o1, Integer o2)
		    {
		    	return o1-o2;
		    }
		}
		
		Comparator<Integer> minComparator = new minHeapComparator();
		
	    PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(1, minComparator);
	    */
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(1,new Comparator<Integer>() {
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return o1-o2;
	        }
	    });
	    //add elements
	    minHeap.addAll(Arrays.asList(new Integer[]{8,9,1,2,3,4,5,}));
	    System.out.println("Minheap---------------------");
	    System.out.println(Arrays.toString(minHeap.toArray()));
	    for (Iterator<Integer> iterator = minHeap.iterator(); iterator.hasNext();) {
	        System.out.println("Min : "+minHeap.element());
	        System.out.println("Removing " + minHeap.element());
	        minHeap.remove();
	    }
	 
	    //create a new object and add a custom comparator that provides the "MaxHeap" behaviour.
	    PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(1,new Comparator<Integer>() {
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            return o2-o1;
	        }
	    });
	    System.out.println("Maxheap---------------------");
	    //add elements
	    maxHeap.addAll(Arrays.asList(new Integer[]{8,9,1,2,3,4,5,}));
	    System.out.println(Arrays.toString(maxHeap.toArray()));
	    for (Iterator<Integer> iterator = maxHeap.iterator(); iterator.hasNext();) {
	        System.out.println("Max : "+maxHeap.element());
	        System.out.println("Removing " + maxHeap.element());
	        maxHeap.remove();
	    }       
	}
	
}

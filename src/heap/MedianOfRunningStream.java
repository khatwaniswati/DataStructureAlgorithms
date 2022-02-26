package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfRunningStream {

	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public static void main(String[] args) {
		MedianOfRunningStream m = new MedianOfRunningStream();
		m.insertNum(3);
		m.insertNum(1);
		System.out.println(m.findMedian());
		m.insertNum(5);
		System.out.println(m.findMedian());
		m.insertNum(4);
		System.out.println(m.findMedian());
	}

	public void insertNum(int num) {
		if(maxHeap.isEmpty() || num<maxHeap.peek())
			maxHeap.add(num);
		else
			minHeap.add(num);
		
		if(minHeap.size()>maxHeap.size())
			maxHeap.add(minHeap.poll());
		else if(maxHeap.size()>minHeap.size()+1)
			minHeap.add(maxHeap.poll());
	}

	public double findMedian() {
		if(maxHeap.size()>minHeap.size())
			return maxHeap.peek();
		else
			return (minHeap.peek()+maxHeap.peek())/2.0;
	}
}

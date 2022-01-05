package test;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TicketBuying {

	public static void main(String[] args) {
		int count = 0;
		int[] tickets = new int[] {2,3,2};
		int k = 0;
		int decrement = 0;
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i = 0;i<tickets.length;i++) {
			queue.add(tickets[i]);
		}

		while(queue != 0) {
			for(int i = 0;i<tickets.length;i++) {
				if(tickets.get(i) > 0) {
					int decrement = tickets.get(i) - 1;
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

create queue 
for loop i from 0 to length of tickets
	queue.add(new int[] {tickets[i],i}) // structure: [value, index]

time = 0
while queue is not empty
	element = queue.poll
	time++
	if(element[0]-1 > 0) { 
		queue.add(new int[] element[0]-1, element[1])
	}
	if(element[0]-1 == 0 && element[1] == k) {
		break;
	}
	
tickets = [2,3,2]
k = 0

queue = {[2,0], [3,1], [2,2]}
queue.poll
element = [2,0]
queue = {[3,1],[2,2]}

time = 1
if element[0] -1 = 1 > 0 // true
	queue.add(1,0)

queue = {[3,1], [2,2], [1,0]}
... 
queue = {[1,0][2,1][1,2]}
element = 



	
	
	










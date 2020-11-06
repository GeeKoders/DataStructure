package Practice.Sorting.SleepSort;

import java.util.concurrent.CountDownLatch;

public class SleepSort {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 2, 6, 8, 5, 6, 9 };
		sleepSortAndPrint(nums);
	}
	
	public static void sleepSortAndPrint(int[] nums) {
		
		CountDownLatch doneSignal = new CountDownLatch(nums.length) ;
		
		for(Integer num: nums){
			new Thread(new Runnable(){

				@Override
				public void run() {
					
					doneSignal.countDown();
					
					try{
						
						doneSignal.await(); 
						
						Thread.sleep(num * 100);
						System.out.print(num + " ");
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				}
				
				
				
			}).start();
			
			
			
		}
		
		
		
		
	}

}

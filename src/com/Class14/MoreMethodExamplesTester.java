package com.Class14;

public class MoreMethodExamplesTester {
	
	public static void main(String[] args) {
		
		MoreMethodExamples moreMethodExamples=new MoreMethodExamples();
		System.out.println(moreMethodExamples.print());
		System.out.println(moreMethodExamples.numDoubled(8));
		moreMethodExamples.isRaining(true);
		moreMethodExamples.task1();
		System.out.println(moreMethodExamples.greatest(1, 20));
		moreMethodExamples.evenOrOdd(-4);
		
		double [] arr= {10.2, 25, 30};
		System.out.println(moreMethodExamples.returnTheArraySum(arr));
		System.out.println(moreMethodExamples.isMirror("aba"));
		System.out.println(moreMethodExamples.isMirror("abcdef"));
		
	}

}

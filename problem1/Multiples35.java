public class Multiples35 {

	//find sum of all multiples of 3 and 5 below certain number
	public static void main(String [] args) {
		int maxNum = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i = 0; i < maxNum; i++) {
			if(i%3==0 || i%5 ==0)
				sum += i;
		}
		System.out.println("The sum of 3 and 5 multiples until "+ maxNum +" is:  " + sum);
	}
}

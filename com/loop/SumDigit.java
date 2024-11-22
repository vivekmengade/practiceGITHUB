package com.loop;

public class SumDigit {
	
	public static void main(String args[]) {
		int num = 6125343;
		int sum = 0 ;
		int sub = 0;
	while(num!=0) {
		int n = num%10;
		if(n%2==0) {
			sum+=n;
		}
		else if(n%2!=0) {
			sub-=n;
		}
		num/=10;
		num/=10;
		
	}
	System.out.println(sum);
	System.out.println(sub);
}
}



//public class SumOfEvenDigits {
//
//    public static void main(String[] args) {
//        int num = 612534;
//        int sum = 0;
//
//        while (num != 0) {
//            int digit = num % 10;
//            if (digit % 2 == 0) {
//                sum += digit;
//            }
//            num /= 10;
//        }
//
//        System.out.println("Sum of even digits: " + sum);
//    }
//}
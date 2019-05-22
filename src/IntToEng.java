import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド

	static String translateEng(int n) {
		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		if(n==20) {
			return "twenty";
		}else if(n>20 && n<30) {
			return "twewnty" + arr[n-20];
		}else if(n==30) {
			return "thirty";
		}else if(n>30 && n<40) {
			return "thirty"+arr[n-30];
		}else if(n==40) {
			return "forty";
		}else if(n>40 && n<50) {
			return "forty"+arr[n-40];
		}else if(n==50) {
			return "fifty";
		}else if(n>50 && n<60) {
			return "fifty"+arr[n-50];
		}else if(n==60) {
			return "sixty";
		}else if(n>60 && n<70) {
			return "sixty"+arr[n-60];
		}else if(n==70) {
			return "seventy";
		}else if(n>70 && n<80) {
			return "seventy"+arr[n-70];
		}else if(n==80) {
			return "eighty";
		}else if(n>80 && n<90) {
			return "eighty"+arr[n-80];
		}else if(n==90) {
			return "ninety";
		}else if(n>90 && n<	100) {
			return "ninety"+arr[n-90];
		}else if(n==100) {
			return "hundred";
		}
		return arr[n];

	}

}
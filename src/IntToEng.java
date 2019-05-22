import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		
		for(int n=0; n<5; n++) {
		System.out.println("1000以下の数値を入力してください");
		Scanner sc = new Scanner(System.in);	
		int input = sc.nextInt();

		System.out.println(translateEng(input));
		}
		System.out.println("終了します");
	}

	// 数値を英訳する変換するメソッド

	static String translateEng(int n) {
		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String h = "-hundred";
		
		if(n>100 && n<200) {
			System.out.print(arr[1]+h+" ");
		    n=n-100;
		}else if(n>200 && n<300){
		    System.out.print(arr[2]+h+" ");
		    n=n-200;
		}else if(n>300 && n<400){
		    System.out.print(arr[3]+h+" ");
		    n=n-300;
		}else if(n>400 && n<500){
		    System.out.print(arr[4]+h+" ");
		    n=n-400;
		}else if(n>500 && n<600){
		    System.out.print(arr[5]+h+" ");
		    n=n-500;
		}else if(n>600 && n<700){
		    System.out.print(arr[6]+h+" ");
		    n=n-600;
		}else if(n>700 && n<800){
		    System.out.print(arr[7]+h+" ");
		    n=n-700;
		}else if(n>800 && n<900){
		    System.out.print(arr[8]+h+" ");
		    n=n-800;
		}else if(n>900 && n<1000){
		    System.out.print(arr[9]+h+" ");
		    n=n-900;
		}
		
		if(n==20) {
			return "twenty";
		}else if(n>20 && n<30) {
			return "twenty-" + arr[n-20];
		}else if(n==30) {
			return "thirty";
		}else if(n>30 && n<40) {
			return "thirty-"+arr[n-30];
		}else if(n==40) {
			return "forty";
		}else if(n>40 && n<50) {
			return "forty-"+arr[n-40];
		}else if(n==50) {
			return "fifty";
		}else if(n>50 && n<60) {
			return "fifty-"+arr[n-50];
		}else if(n==60) {
			return "sixty";
		}else if(n>60 && n<70) {
			return "sixty-"+arr[n-60];
		}else if(n==70) {
			return "seventy";
		}else if(n>70 && n<80) {
			return "seventy-"+arr[n-70];
		}else if(n==80) {
			return "eighty";
		}else if(n>80 && n<90) {
			return "eighty-"+arr[n-80];
		}else if(n==90) {
			return "ninety";
		}else if(n>90 && n<	100) {
			return "ninety-"+arr[n-90];
		}else if(n==100) return "hundred";
		else if(n==200) return arr[2]+h;
		else if(n==300) return arr[3]+h;
		else if(n==400) return arr[4]+h;
		else if(n==500) return arr[5]+h;
		else if(n==600) return arr[6]+h;
		else if(n==700) return arr[7]+h;
		else if(n==800) return arr[8]+h;
		else if(n==900) return arr[9]+h;
		else if(n==1000) return "thousand";
		else if(n>1000) return "error,1000以下の数値を入力してください";
		return arr[n];

	}

}
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
         
       System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド

    static String translateEng(int n) {
    	String[] arr = new String[3];
        arr[0]="zero";
        arr[1]="one";
        arr[2]="two";
        return arr[n];
    }

}
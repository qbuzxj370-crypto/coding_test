import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int[] refs = {1, 1, 2, 2, 2, 8};
        int a = 0;
		for(int i = 0; i < refs.length; i++) {
            a = sc.nextInt();
            System.out.printf("%d ", refs[i] - a);
        }
	}
}
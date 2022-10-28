package Recursion;
import java.util.*;
public class count_subset {
public static void print(int n,char[] str1,char[] array)
{
	if(n<=0)//(means array is full)
	{
		System.out.print(String.valueOf(array) + " ");

	}
	else
	{
		for (int i = 0; i < str1.length; i++) {
			array[n - 1] = str1[i];
			print(n - 1, str1, array);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int n=sc.nextInt();
print(n,str.toCharArray(),new char[n]);
	}

}

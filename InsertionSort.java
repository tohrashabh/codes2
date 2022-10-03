import java.util.Scanner;
public class InsertionSort {
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void InsertionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
					swap(arr,i,j);
			}
			for(int k=0;k<arr.length;k++)
				System.out.print(arr[k]+" ");
			System.out.println();
		}
	}
	public static void insertion(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int temp=arr[i+1],j=i;
			for(;j>=0;j--)
			{
				if(temp<arr[j])
					arr[j+1]=arr[j];
				else
					break;
			}
			arr[j+1]=temp;
		}
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			insertion(arr);
		}
	}

}

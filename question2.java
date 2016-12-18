import java.util.Scanner;

public class question2 {
	static int[] start;
	static int end[];
	static int index[];
	static int n=4;
	static int schedule[];
	
	
	static void display(int n){
		
		System.out.println("NON conflicting lecture");
		for(int k=0;k<n;k++)
			System.out.println("Lecture :"+schedule[k]);
	}
	
	static void initialize(int[] indx,int n){
		
		for(int i=0;i<n;i++)
		{
			indx[i]=i;
			
		}
			
	}
	
	static void lectureScheduling(int[] str,int[] end, int[] indx,int n){
		
		int i,j,l=0;
		schedule[l++]=indx[l];
		for(i=0,j=1;j<n;j++)
		{
			if(end[i]<=str[index[j]])
			{
				
				System.out.println("Scheduling  " + l +"  " +indx[j]);
				schedule[l++]=indx[j];
				i=j;
			}
			
		}
		display(l);
	}
	
	
	static void insertionsort(int[] arr, int n,int[] index){
		
		int j=2,k=2;
		int i,temp,tp;
		while(k<n)
		{
			j=k;
			while(j>1)
			{
				i=j-1;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					tp=index[i];
					arr[i]=arr[j];
					index[i]=index[j];
					arr[j]=temp;
					index[j]=tp;
					
				}
				
				j--;
			}
			k++;
		}
			
			
	}
	
	
	static void startEndTime(int[] str,int n){
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Lecture Time for "  + i);
			str[i]=sc.nextInt();
			
			
		}
	}
	
	public static void main(String str[])
	{
		start=new int[4];
		end=new int[4];
		index=new int[4];
		schedule=new int[4];
		System.out.println("Enter start time");
		startEndTime(start,n);
		System.out.println("Enter End time");
				startEndTime(end,n);
		initialize(index,n);
		for(int k=0;k<n;k++)
		//	System.out.println("index of " + k + " is "+index[k]);
		insertionsort(end,n,index);
		
	//	System.out.println("After insertion sort");
		for(int k=0;k<n;k++)
	//		System.out.println("index of " + k + " is "+index[k]);
		lectureScheduling(start,end,index,n);
	}

}

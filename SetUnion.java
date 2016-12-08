package question1;

public class SetUnion 
{
	//static int num;
    void greedyApproach(int res[],int s1[],int s2[],int s3[],int s4[])
	{
    	int i;
    	int[] m=null;
    	int[] l=null;
    	int n=0;
    	int num=1;
		int[] u=new int[res.length]; 
		
		//find longest n store in l[] =result
		
		if(s1.length>s2.length)
			{
			 l=s1;
			 if(l.length<s3.length)
				 l=s3;
			
			 if(l.length<s4.length)
				 l=s4;
			
			}
		else
		{
			 l=s1;
			 if(l.length<s3.length)
				 l=s3;
			
			 if(l.length<s4.length)
				 l=s4;
			
		}
		System.out.print("\nl Selected s1: ");
		num=num++;
		for(i=0;i<l.length;i++)
			System.out.print(l[i]);
		//storing in u[]
		for(i=0;i<l.length;i++)
			u[i]=l[i];
		
		n=l.length-1;
		
			//check second longest and add to l[]
		if(s3.length<s2.length)
		{
		   m = s2;
		 if(m.length<s4.length)
			 m=s4;
			
		}
		else
		{
			 m = s3;
			 if(m.length<s4.length)
				 m=s4;
						
		}
		
		System.out.print("\nl Selected s2: ");
		for(i=0;i<m.length;i++)
			System.out.print(m[i]);
		num++;
	/*	n=u.length-1;
		for(i=0;i<m.length;i++)
		{
			n++;
			u[n]=m[i];
		}
		
		for(i=0;i<u.length;i++)
			System.out.println(u[i]);
		
		*/
		
		
		//find next longest and values
		int k[];
		if(s2.length<s4.length)
		k=s4;
		else
		k=s2;
		System.out.print("\nl Selected s3: ");
		num++;
		for(i=0;i<k.length;i++)
			System.out.print(k[i]);
		
		
		if(u.length==res.length)
			System.out.println("\n Length of union is equal to the answer. No further checking required");
		
		System.out.println("\n\nNo of sets selected :" +num);
		
		
	}
	
	void optimalApproach(int res[],int s1[],int s2[],int s3[],int s4[])
	{
		
	}
	
	public static void main(String str[])
	{
		
		SetUnion obj=new SetUnion();
		int s1[]={1,2,3};
		int s2[]={4,5};
		int s3[]={2,3,4};
		int s4[]={1,2,5};
		int res[]={1,2,3,4,5};
		int i;
		System.out.println("Union Sets :: ");
		System.out.print("\ns1 : ");
		for(i=0;i<s1.length;i++)
		System.out.print(s1[i]);
		System.out.print("\ns2 : ");
		for(i=0;i<s2.length;i++)
			System.out.print(s2[i]);
		System.out.print("\ns3 : ");
		for(i=0;i<s3.length;i++)
			System.out.print(s3[i]);
		System.out.print("\ns4 : ");
		for(i=0;i<s4.length;i++)
			System.out.print(s4[i]);
		
		System.out.println("\n calling greedy approach");
		obj.greedyApproach(res,s1,s2,s3,s4);
		//System.out.println("\n calling optimal algo");
		//obj.optimalApproach(res,s1,s2,s3,s4);
		
		
	}

}

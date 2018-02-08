public class Armstrong
{
public static void main(String[]args)
{

		int x=0; int y=0;int temp=0;int n;

		//temp=n;
		for(int i=1;i<=1000;i++)
		{
          n=i;
        while(n>0)
        {
		x=n%10;
		y=y+(x*x*x);
		n=n/10;
	   }
		//System.out.println(y);

		if(y==i)
         {  System.out.println( "armstrong number"+ i);}
		//else
		//System.out.println( y+ " is not armstrong number");
		y=0;
   }
	}
}
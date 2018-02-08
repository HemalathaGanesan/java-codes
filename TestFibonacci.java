public class TestFibonacci
{
public static int fibonaccisequence(int num)
{
int h=0;int j=1;int sum=0;
for( int i=0;i<=num;++i)
{
 sum=h+j;
// System.out.print(h +"+");
h=j;
j=sum;

}
return sum;

}
public static void main(String[]args)
{

	int num,r;
	num=6;
	r=TestFibonacci.fibonaccisequence(num);
	System.out.println(r);

	 num=10;
	r=TestFibonacci.fibonaccisequence(num);
	System.out.println(r);

	num=99;
	 r=TestFibonacci.fibonaccisequence(num);
	System.out.println(r);

	num=5889;
     r=TestFibonacci.fibonaccisequence(num);
	System.out.println(r);

	num=898;
    r=TestFibonacci.fibonaccisequence(num);
	System.out.println(r);


	}
}

class Fibona1
{
	public static int fibonacciseries(int n)
	{
	int h=0;int j=1;int sum=0;
	while(h<=n)
	{
	        sum=h+j;
	        System.out.print(h +"+");
	          h=j;
             j=sum;

	}
	System.out.println();
            return sum;
}
public static void main(String[]args)
{

	int n,r;
	n=67;
	r=Fibona1.fibonacciseries(n);
	System.out.println(r);
}
}
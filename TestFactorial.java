public class TestFactorial
{
public static long factorial(int n)
{
if(n==0)
return 0;
if(n<0)
return 0;
long fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String[]args)
{
int n;
long r;
n=0;
r=TestFactorial.factorial(n);
System.out.println(r);

n=-3;
r=TestFactorial.factorial(n);
System.out.println(r);

n=5;
r=TestFactorial.factorial(n);
System.out.println(r);

n=11;
r=TestFactorial.factorial(n);
System.out.println(r);

n=20;
r=TestFactorial.factorial(n);
System.out.println(r);

n=50;
r=TestFactorial.factorial(n);
System.out.println(r);
}

}
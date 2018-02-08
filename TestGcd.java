public class TestGcd
{
public static int gcd(int n1,int n2)
{
int gcd=1;int lcm=1;
for(int i=1;(i<=n1) && (i<=n2);i++)
{
if((n1%i==0)&&(n2%i==0))
  gcd=i;
  lcm=(n1*n2)/gcd;
  //System.out.println(n1 + "," + n2 +","+ gcd);
}
System.out.println();
//return gcd;
return lcm;
}
public static void main(String[]args)
{
	int n1; int n2; int r;
	n1=24; n2=64;
	r=TestGcd.gcd(n1,n2);
	System.out.println(r);

	n1=63; n2=117;
		r=TestGcd.gcd(n1,n2);
	System.out.println(r);

	n1=6; n2=4;
			r=TestGcd.gcd(n1,n2);
	System.out.println(r);
	}
}
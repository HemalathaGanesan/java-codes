public class PowerTwo
{
public static String isPowerOfTwo(int num)
{
if(num<0)
return "no";
if(num==0||num==3||num==5)
return "no";
if(num==1||num==2)
return "yes";
while(num>1)
{
if(num%2!=0)
return "no";
num=num/2;
}
return "yes";
}
public static void main(String[]args)
{
	int num;
	String r;
	num=0;
	r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=-1;
		r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=1;
		r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=4;
		r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=32;
		r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=1073741824;
		r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=24;
		r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=16384;
			r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

	num=98785;
			r=PowerTwo.isPowerOfTwo(num);
	System.out.println(r);

}
}



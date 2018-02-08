public class Circle
{
public static void main(String[]args)
{
int r=5;
double area=Math.PI*r*r;
double perimeter=2*Math.PI*r;
System.out.println("area of circle is" + area);
System.out.println("perimeter of circle is" + perimeter);
}
}


class Rectangle
{
public static void main(String[]args)
{
	int l=5; int b=17;
	double area=l*b;
	double perimeter=2*(l+b);
	System.out.println("area of Rectangle is" + area);
	System.out.println("perimeter of Rectangle is" + perimeter);
}
}


class Square
{
public static void main(String[]args)
{
	int a=5;
	double area=a*a;
	double perimeter=4*a;
	System.out.println("area of square is" + area);
	System.out.println("perimeter of square is" + perimeter);
}
}

class Triangle
{
public static void main(String[]args)
{
	int b=15; int h=16; int l=17;
	double area=(b*h)/2;
	double perimeter=l+h+b;
	System.out.println("area of Triangle is" + area);
	System.out.println("perimeter of Triangle is" + perimeter);
}
}


class TriangleTypes
{
public static void main(String[]args)
{
int a=15; int b=15; int c=15;
if((a==b)&&(b==c)&&(c==a))
System.out.println(" Triangle is equilateral");

else if((a==b)||(b==c)||(c==a))
System.out.println(" Triangle is isosceles");

else if((a!=b)&&(b!=c)&&(c!=a))
System.out.println(" Triangle is scalene");

else
System.out.println(" Triangle is error");
}
}

class Power2
{

public static void main(String[]args)
{
	int base=2, expo=5;
	long res=1;
	while(expo!=0)
	{
		res*=base;
		--expo;
		}
		System.out.println(res);
	double re=Math.pow(base,expo);
	System.out.println("using power function()"+ re);
	double r=Math.pow(base,3);
	System.out.println("cube of given 2base" + r);
	}
	}

class SimpleInterest
{
public static void main(String[]args)
{
	int p=200, n=15; float r=13; double si=0;
	si=(p*n*r)/100;
	System.out.println("simple interest for the diven amount" + si);
	}
	}

class Average
{
public static void main(String[]args)
{
 int sum=0;double n=55;double avg=0;
 for(int i=0;i<n; i++)
 {
	 sum=sum+i;

	 avg=sum/n;
	 }
	 System.out.println(sum);
	 System.out.println("average of the number" + avg);
 }
}


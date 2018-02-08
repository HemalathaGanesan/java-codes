public class ArraySorting
{
public static void main(String[]args)
{
int[]a={1,4,2,10,56,78,34,5,9,0};
int n=a.length;
int k;
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1;j++)
{
	k=j+1;
//if(a[j]>a[k])
if(a[j]<a[k])
{
int temp=a[j];
a[j]=a[k];
a[k]=temp;
	}
	}
for(int x=0;x<a.length;x++)
{
	System.out.print(a[x]+",");

	}
System.out.println();
	}
}
}

class SortString
{
public static void main(String[]args)
{
String str="ahjgfdvm";
char[]ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
for(int j=0;j<ch.length;j++)
{
	if(ch[i]<ch[j])
	{
	char temp=ch[j];
	ch[j]=ch[i];
	ch[i]=temp;
      }
}
	String res=new String(ch);
	for(int k=0;k<ch.length;k++)
	{
		System.out.print(ch[k]+",");

		}
	System.out.println();

	}
	}
	}

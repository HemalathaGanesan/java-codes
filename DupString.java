public class DupString
{
public static String findDuplicate(String str)
{
	String s="";
	str=str.toLowerCase();
	char[]ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
    {
int count=0;
for(int j=0;j<s.length();j++)
{
	//if(Character.toLowerCase(ch[i])==Character.toLowerCase(s.charAt(j)))
	if(ch[i]==s.charAt(j))
    {
		count++;
	}
}	if(count==0)
	{
	s=s+ch[i];
   }
}
return s.replace(" ","");
}
public static void main(String[]args)
{
	String s3="aabbcvvhAn";String s1="Ba Ba Black Sheep";
	String s2=DupString.findDuplicate(s1);
	System.out.println(s2);

	}
}

class MiniValue
{
public static void main(String[]args)
{
int[]a1={12,32,53,10}; int[]a2={10,4,56,7,23,3};
int min=a1[0];
for(int i=0;i<a1.length;i++)
{
	if(min>a1[i])
	min=a1[0];
	}
for(int j=0;j<a2.length;j++)
{
    if(min>a2[j])
    min=a2[j];
	}
System.out.println(min);
}
	}

class FrontBack
{
public static void main(String[]args)
{
	String s="cat";String s3="";
if(s.length()>=1)
{
String s1=s.substring(s.length()-1,s.length());
s3=s3+s1+s+s1;
}
System.out.println(s3);
	}
	}


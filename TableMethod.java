public class TableMethod
{
public static int printTables(int num )
{
int i,x;
for( i=1;i<10;i++)
{
	//x=i*num;
//System.out.println(x);
}

return i*num;


}
public static void main(String[]args)
{
int num,r;
num=3;
r=TableMethod.printTables(num);
System.out.println(r);
}

}
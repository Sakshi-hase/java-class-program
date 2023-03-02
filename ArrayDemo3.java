import java.util.Scanner;
class ArrrayDemo3
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
ch[]=newInt[size];
for(int i=0;i<ch.length;i++)
{
ch[]=sc.next().charAt(0);
}
System.out.print("[");
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
if(i<ch.length-1)
System.out.print(" ");
}
System.out.println("]");
}
}

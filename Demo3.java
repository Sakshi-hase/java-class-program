import java.util.Scanner;
class Demo3{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter byte type data");
 byte v1=sc.nextByte();
System.out.println("enter short type data");
 short v2=sc.nextShort();
System.out.println("enter int type data");
 int v3=sc.nextInt();
System.out.println("enter long type data");
 long v4=sc.nextLong();
System.out.println("enter float type data");
 float v5=sc.nextFloat();
System.out.println("enter double type data");
 double v6=sc.nextDouble();
System.out.println("enter boolean type data");
 boolean v7=sc.nextBoolean();
System.out.println("enter char");
 char ch=sc.next().charAt(0);
System.out.println("enter string word");
 String v8=sc.next();
System.out.println("enter string sentence");
 String v9=sc.nextLine();
}
} 
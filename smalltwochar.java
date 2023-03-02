class smalltwochar
{
public static void main(String[] args)
{
int m1='80';
int m2='25';
int m3='100';
int small=(m1>m2)?(m1>m3?m1:m3):(m2>m3?m2:m3);
System.out.println(small);
}
}
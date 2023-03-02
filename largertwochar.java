class largertwochar
{
public static void main(String[] args)
{
char m='a';
char n='b';
char p='c';
char small=(m>n)?(m>p?m:p):(n>p?n>p);
System.out.println(small);
}
}
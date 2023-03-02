class SmallestThreeChar
{
public static void main(String[] args)
{
int a1=12;
int c2=22;
int c3=77;
//int c4=45;
//int ans;


int result= a1<(c2<c3?c2:c3) ? a1:(c2<c3?c2:c3);
System.out.println(result);
}
}
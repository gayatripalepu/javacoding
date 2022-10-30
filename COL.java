class Add
{
private int x;
private int y;
public Add()
{
x=1;
y=2;
}
public Add(int x,int y)
{
this.x=x;
this.y=y;
}
public Add(Add a)
{
this.x=a.x;
this.y=a.y;
}
public void print()
{
System.out.printf("%d\n",x+y);
}
}
public class COL
{
public static void main(String args[])
{
Add a=new Add();
a.print();
a=new Add(5,10);
a.print();
Add a1=new Add(a);
a1.print();
}
}
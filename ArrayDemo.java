/*
Syntax:
<datatype> arrayName[];
arrayName = new Datatype[size];

example:
int a[];
a = new int[5];

Syntax:
<datatype> arrayName[] = new datatype[size];
example:
int a[]= new int[5];

example of initialization of array
int a[]= {1,2,3,4,5};

//to get the size of array
arrayName.length;

*/

public class ArrayDemo
{

public static void main(String args[])
{
int a[];// declaration of array
a = new int[5]; // allocation of memory to array
java.util.Scanner sc = new java.util.Scanner(System.in);
int i;

System.out.println("enter elements into array");
for(i=0;i<a.length;i++)
	a[i] = sc.nextInt(); // input elements into array


System.out.println("The Array Elements are:");

for(i=0;i<a.length;i++)
System.out.printf("%3d",a[i]);

int n,cnt=0;
System.out.println("\nEnter element to search");
n = sc.nextInt();

for(i=0;i<a.length;i++)
{
	if(a[i] == n)
	{
		cnt=cnt+1;
	}
}


System.out.println( "element " + n +" is found " + cnt  +" times");
 
}
}

/*
left rotation
============
1 2 3 4 5

5 1 2 3 4 // after one element left rotation
4 5 1 2 3 // after two elements left rotation


right rotation
===========
1 2 3 4 5

2 3 4 5 1 // after one element right rotation
3 4 5 1 2 // after two elements right rotation
*/
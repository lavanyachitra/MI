import java.io.*;
public class Count
{
public static void main(String args[])
{
int count=0,number=548;
while(number!=0)
{
number=number/10;
++count;
}
System.out.println(count);
}
}

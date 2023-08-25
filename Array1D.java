//java program to find max and min from 1-D array
import java.util.*;
public class Array1D{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number of elements:");
int k=sc.nextInt();
int[] Array=new int[k];
int temp;
for(int i=0;i<k;i++)
{
System.out.printf("Please enter the element %d: ",i+1);
int l=sc.nextInt();
Array[i]=l;
}

for(int i=0;i<k;i++){
for(int j=0;j<k-1;j++){
if(Array[j]>Array[j+1])
{
temp=Array[j];
Array[j]=Array[j+1];
Array[j+1]=temp;
}
}}
System.out.println("The Smallest element is "+Array[0]);
System.out.println("The largest element is "+Array[k-1]);
}}


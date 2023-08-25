//java program to initialize and display with sum of each row of jagged array
public class Jagged{
public static void main(String[] args){
int[][] A={
          {1,2,3,4},
          {5,6,7},
          {7,5},
            };
int[] B=new int[A.length]; 
for(int i=0;i<A.length;i++){
for(int j=0;j<A[i].length;j++){
B[i]=B[i]+A[i][j];
}}
for(int i=0;i<A.length;i++)
{
System.out.println("The sum of Row "+(i+1)+"is"+B[i]);
}}}

//java program to find the sum and multiplication of two 3X3 matrix
import java.util.*;
public class Matrix{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[][] A=new int[3][3];
int[][] B=new int[3][3];
int[][] C=new int[3][3];
int[][] D=new int[3][3];
//Logic for initializing value of matrix A.
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.printf("Please enter the value of matrix A for the position %d%d: ",i+1,j+1);
A[i][j]=sc.nextInt();
}}
//Logic for initializing value of matrix B.
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.printf("Please enter the value of matrix B for the position %d%d: ",i+1,j+1);
B[i][j]=sc.nextInt();
}}
//Logic for matrix multiplication.
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
C[i][j]=0;
for(int k=0;k<3;k++){

C[i][j]=C[i][j]+A[i][k]*B[k][j];
}}}
System.out.println("Multiplication of two matrix A and B is:");
//Logic for printing the matrix.
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(C[i][j]+" ");

}
System.out.println();
}
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
D[i][j]=A[i][j]+B[i][j];
}}
System.out.println("Addition of Two matrix A and B is:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(D[i][j]+" ");

}
System.out.println();
}
}}
//Java private variable to find the area and circumference of circle
class Circle{
private float Radius;

public void setRadius(float r)
{
this.Radius=r;
}
public float getArea()
{
return (float)(Math.PI*Radius*Radius);
}
public float getCircum(){
return (float)(2*Math.PI*Radius);
}}
public class MyCircle{
public static void main(String[] args){
Circle s1=new Circle();
s1.setRadius(5.3f);
System.out.println("The Area of circle1 is "+s1.getArea());
System.out.println("The Circumference of circle1 is "+s1.getCircum());
Circle s2=new Circle();
s2.setRadius(8.6f);
System.out.println("The Area of circle2 is "+s2.getArea());
System.out.println("The Circumference of circle2 is "+s2.getCircum());
}}`

class Box{
private int height;
private int width;
private int depth;
public void setMethod(int h,int w,int d){
this.height=h;
this.width=w;
this.depth=d;
}
public int getVolume(){
return height*width*depth;
}
public int getSurfaceArea(){
return 2*((height*width)+(height*depth)+(width*depth));
}}
public class Box1{
public static void main(String[] args){
Box b1=new Box();
b1.setMethod(5,3,6);
System.out.println("The volume of Box1 is "+b1.getVolume());
System.out.println("The SurfaceArea of Box1 is "+b1.getSurfaceArea());
Box b2=new Box();
b2.setMethod(8,10,15);
System.out.println("The volume of Box2 is "+b2.getVolume());
System.out.println("The SurfaceArea of Box2 is "+b2.getSurfaceArea());
}}

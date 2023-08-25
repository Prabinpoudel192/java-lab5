class Time{
    int hour,minute,second;
    public Time(){}
    public Time(int h,int m,int s){
        hour=h;
        minute=m;
        second=s;
    }
    public void display1(){
        System.out.println(hour+":"+minute+":"+second);
    }
    public Time addTime(Time t1){
        Time temp=new Time();
        temp.hour=hour+t1.hour;
        temp.minute=minute+t1.minute;
        temp.second=second+t1.second;
        if(temp.second>59){
            temp.second-=60;
            temp.minute+=1;
        }
        if(temp.minute>=60){
            temp.minute -=60;
            temp.hour +=1;
        }
        return temp;
    }
     public void display2(){
        System.out.println(hour+":"+minute+":"+second);
    }
    public Time subTime(Time t1){
        Time temp=new Time();
        temp.hour=hour-t1.hour;
        temp.minute=minute-t1.minute;
        temp.second=second-t1.second;
        if(temp.second<0){
            temp.second+=60;
            temp.minute-=1;
        }
        if(temp.minute<0){
            temp.minute +=60;
            temp.hour -=1;
        }
        return temp;
    }
}
public class TimeExample {

    public static void main(String[] args) {
        Time t1=new Time(4,40,30);
        System.out.println("First time:");
        t1.display1();
        Time t2=new Time(7,30,50);
        System.out.println("Second Time:");
        t2.display1();
        Time t3=t1.addTime(t2);
        System.out.println("Result Time:");
        t3.display1();
        Time t4=t1.subTime(t2);
        System.out.println("Result Time:");
        t4.display2();
    }
}

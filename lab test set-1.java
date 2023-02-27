import java.util.Scanner;
class Time{
	int hours, minutes;
	Time(int a,int b){
		setTime(a,b);

	}
	public void setTime(int a,int b){
		hours = a;
		minutes = b;
	}
	public Time add(Time a){
		Time c = new Time(0,0);
		c.hours = hours + a.hours;
		c.minutes = minutes + a.minutes;
		return c;
	}

	public void show(){
		System.out.println("Hours:"+hours+""+"minutes:"+minutes);
	}
	public static void main(String[]args){
		Time a = new Time(3,59);
		a.show();
		Time b = new Time(5,6);
		b.show();
		Time store = b.add(a);
		store.show();
	}
}
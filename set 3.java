class Rational{
 int num, denum;

void setRational(int x,int y){
	num=x;
	denum=y;
}
boolean equal(Rational r){
	if (r.num==num && r.denum==denum)
		return true;
	else 
	if(num/denum==r.num/r.denum)
	return true;
	else
		return false;
}
void show(){
 System.out.println("The rational number is: "+num+ "/" +denum);
}
}
class Main{
	public static void main(String[] args){
	Rational ob1=new Rational();
	ob1.setRational(1,2);
	Rational ob2=new Rational();
	ob2.setRational(50,100);
	boolean ans=ob1.equal(ob2);
	if (ans== true){
		System.out.println("The numbers are equal");
//  		ob1.show();
	}
	else
	{
	    ob1.show();
		ob2.show();
	}
}
}
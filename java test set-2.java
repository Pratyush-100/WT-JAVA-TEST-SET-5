class distance{
	public int KM,MT;

	public void Distance(int a,int b){
		 KM=a;
		 MT=b;
	}
	public void Distance_add(Distance b){
		Distance c = new Distance();
		c.KM = KM + b.KM;
		C.MT = MT + b.MT;
		
		System.out.println("The sum of the distance is"+c.KM+"km"+c.MT+"m");
	}
	public void show(){
		System.out.println("The distance is"+KM+" km "+MT+" mt ");
	}
}
public class distance_demo{
	 public static void main(String x[]){
		Distance a = new Distance();
		a.distance(10,20);
		Distance b = new Distance();
		b.Distance(20,30);
		Distance c = new Distance();
		a.distance_add(b);
		a.show();
		b.show();

	 }
}
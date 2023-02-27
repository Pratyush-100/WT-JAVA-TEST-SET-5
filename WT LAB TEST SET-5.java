class Weight{
	private int kg;
	private int gram;

	public void setWeight(int kg,int gram){
		this.kg = kg;
		this.gram = gram;

	}

	 public Weight add(Weight w2){
		int kg = this.kg+w2.kg;
		int gram = this.gram+w2.gram;

		if(gram>=1000){
			kg++;
			gram-=1000;
		}
		Weight w3 = new Weight();
		w3.kg = kg;
		w3.gram = gram;
		return w3;
	 }
	   public void show(){
			System.out.println(kg + "kg" + gram + "gram");
		 }
}

public class Weight_D{
	public static void main(String[]args){
		Weight w1 = new Weight();
		w1.setWeight(1,500);
		Weight w2 = new Weight();
		w2.setWeight(2,500);
		Weight w3 = w1.add(w2);
		w3.show();
	}
}
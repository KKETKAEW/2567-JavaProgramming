
public class Coffee {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public void Coffee(int type,char sizeCoffee, int typeCoffee, Barista barista) {
		this.typeCoffee=type;
		this.sizeCoffee=sizeCoffee;
		this.typeCoffee=typeCoffee;
		this.barista=barista;
	}
	public void Coffee(int type, int typeCoffee) {
		this.typeCoffee=type;
		this.typeCoffee=typeCoffee;
	}
	public Barista getBarista() {
		return barista;
		
		
	}
	public String getTypeName() {
		 if(this.typeCoffee==1) {
			 return"Americano";
		 }
		 else if(this.typeCoffee==2) {
			 return"Espresso";
		 }
		 else if(this.typeCoffee==3) {
			 return"Cappuccino";
		 }else return null;
		
	}
	public int getTypePrice() {
		
	}
	public String getSizeName() {
		
	}
	public int getSizePrice() {
		
	}
	public int getTotalPrice() {
		
	}
	public String toString() {
		
	}

}

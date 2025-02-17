
public class Barista {
	private String name;
	private char gender;
	
	public void Barista(String name,char gender) {
		this.name=name;
		this.gender=gender;
	}
	public void Barista() {
		name=" ";
		gender=' ';
	}
	public String getName() {
		return this.name;
	}
	public String getGenderName() {
		if(gender=='M') {
			return "male";
		}
		else if(gender =='F') {
			return "Female";
		}else return " ";
	}

}

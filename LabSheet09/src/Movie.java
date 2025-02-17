
public class movie {
	private String id;
	private String name;
	private director director;
	
	public movie(String id, String name,director director) {
		this.id = id;
		this.name = name;
		this.director = director;
	}
	
	public String getId() {
		return this.id;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public director getDirector() {
		return this.director;
		
	}
	
	public void setDirector(director director) {
		this.director = director;
		
	}
	
	public String toString() {
		return getId() +" "+ getName()+ " direct by " + director.toString();
	}
}
 
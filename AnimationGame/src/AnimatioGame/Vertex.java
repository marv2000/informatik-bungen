package AnimatioGame;

public class Vertex {
//	Attribute
	public double x;
	public double y;
	
	
	
	
	public Vertex(double x,double y){
// Konstrktor		
		this.x=x;
		this.y=y;
		//xy
	}

	
	
//	Mainmethode


	public String toString(){
		return " ("+x+", "+y+") ";
	}
	
	public double length() { return Math.sqrt(x*x+y*y);} //Wurzel ziehen


	public Vertex skalarMult(double s)		//Strecken von Vertex
	{
	return new Vertex(x*s,y*s);      
	}
	
	public Vertex add(Vertex v2) 			//Vertex plus Vertex
	{return new Vertex(x+v2.x,y+v2.y);}
		
	public void addMod(Vertex v2)           //manipulation von Vertex   
	{	x=x+v2.x;
		y=y+v2.y;
	}
	
	public void setX(double x) {this.x = x;} //veränder der x/y parameter
	
	public void setY(double y) {this.y = y;}
	
	public void setXY(double x,double y){   //verändern von x/Y
		this.x = x;
		this.y = y;
	}
	
	public double getX() {return x;}
	
	public double gety() {return y;}
	
	
	public boolean equals(Object thatObject){
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex)thatObject;
			return this.x==that.x && this.y == that.y;
		}
		return false;
	}
	
	public Vertex sub (Vertex v2){
		return new Vertex(v2.x-x, v2.y=y);
	}
	
	public double distance(Vertex v2){
		double xx= v2.x -this.x;
		double yy= v2.x-this.y;
		
		return Math.sqrt(xx*xx+yy*yy );
	}
	
	public Vertex normalized(Vertex v2){
		double teiler=v2.length();
		
		Vertex normalizedvertex =new Vertex (v2.x/teiler, v2.y/teiler);
		return normalizedvertex;
	}
	
	
}








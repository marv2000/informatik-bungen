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
public static void main(String[] args) {
	
	
	Vertex v1 = new Vertex(15,76);
	Vertex v2 = new Vertex(0,0);
	Vertex v3 = new Vertex(5,6);
	Vertex v4 =(v1.skalarMult(2));
	Vertex v5=(v3.add(v1));

	
	System.out.println("v1.x= "+ v1.y);
	System.out.println("v1 "+ v1);
	System.out.println(v1.length()+"\n");
	
	System.out.println("v2.x= "+ v2.y);
	System.out.println("v2 "+ v2);
	System.out.println(v2.length()+"\n");
	
	System.out.println("v3 "+ v3);
	System.out.println("v3.x= "+ v3.x);
	System.out.println(v3.length()+"\n");

	System.out.println("v4"+v4+"\n");
	System.out.println("v5"+v5+"\n");

	}
	

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
	
}

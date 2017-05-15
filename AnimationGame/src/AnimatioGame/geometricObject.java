package AnimatioGame;

public class geometricObject {

	public Vertex pos;
	public double width;
	public double height;
	
	
	
	public geometricObject(double height, double width, Vertex pos){
		
		if (height<0){
			this.height=-height;
			pos.x=pos.x-height;
		}
		
		if (width<0){
			this.width=-width;
			pos.y=pos.y-width;
		}
		else{
			this.height=height;
			this.width=width;
			this.pos=pos;
		}
	}
	
	
	public geometricObject(double height, double width){this(height, width, new Vertex(0,0));}

	public Vertex getPos(){return pos;}
	public double getWidth(){ return width;}
	public double getHeight(){return height;}
	
}

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
	
	public geometricObject(double s){this(s,s);}
	
	public geometricObject(){this(10);}
	
	public geometricObject(Vertex pos){this(10,10,pos);}
	
	public String toString(){
		return "width= " + width + "; height= "+ height + "; pos= " + pos;
	}
	public double circumference(){
		return 2*(height+width);
	}
	public double area(){
		return height*width;
	}
	
	public Vertex getPos(){return pos;}
	public double getWidth(){ return width;}
	public double getHeight(){return height;}
	
	public boolean contains(Vertex v){
		return v.x>=pos.x && v.x<=pos.x+width && v.y >=pos.y && v.y<=pos.y+ height;
	}
	public boolean isLarger(geometricObject that){
		return this.area() > that.area();
	}	
	
	public void moveTo(double x, double y){
		moveTo(new Vertex(x,y));
	}
	
	public void moveTo(Vertex v){
		this.pos=v;
	}
	
	public void moveTo(){
		pos=new Vertex(0,0);
	}
	
	public boolean equals(Object thatObject) {
		 if (thatObject instanceof geometricObject) {
		 geometricObject that = (geometricObject)thatObject;
		 return that.width==this.width
		 && this.height==that.height
		 && this.pos.equals(that.pos);
		 }
		 return false;
	 }
	

	
	
}
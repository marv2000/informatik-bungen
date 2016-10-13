package AnimatioGame;

public class TetVertex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hallo";
		String s2="HallO". toLowerCase();
		
		
		Vertex v1 = new Vertex(15,76);
		Vertex v2 = new Vertex(0,0);
		Vertex v3 = new Vertex(5,6);
		Vertex v4 =(v1.skalarMult(2));
		Vertex v5=(v3.add(v1));
		
		v2.setXY(v1.x,v1.y);
		
		
		
		System.out.println("v1.x= "+ v1.x);
		System.out.println("v1 "+ v1);
		System.out.println(v1.length()+"\n");
		
		System.out.println("v2.x= "+ v2.x);
		System.out.println("v2 "+ v2);
		System.out.println(v2.length()+"\n");
		
		System.out.println("v3 "+ v3);
		System.out.println("v3.x= "+ v3.x);
		System.out.println(v3.length()+"\n");

		System.out.println("v4"+v4+"\n");
		System.out.println("v5"+v5+"\n");

		System.out.println(v1.x);
		System.out.println(v1.y +"\n");

		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)+"\n");
		
		System.out.println(v1.equals(v2));
		System.out.println();
		System.out.println();
		System.out.println();








	}

}

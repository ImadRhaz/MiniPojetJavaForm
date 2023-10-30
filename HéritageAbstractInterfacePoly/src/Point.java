
public class Point implements Translation {
	
	private int x,y ;
	public Point(int x ,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void transalter(int dx,int dy) {
		 x+=dx;
		y+=dy;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
        // pour l'accebility ds variables
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// pour afficher le point 
	@Override
	public String toString() {
		return "("+ x + ","+ y+ ")";
	}
	
	

}

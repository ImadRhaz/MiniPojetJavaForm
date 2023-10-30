
public class Carre extends Polygone implements Translation {
   
	 Point point1;
	 private int cote;
	 
	public Carre(Point point1, int cote) {
		this.point1 = point1;
		this.cote = cote;
	}
	
	
	public Point getPoint1() {
		return point1;
	}


	public void setPoint1(Point point1) {
		this.point1 = point1;
	}


	public int getCote() {
		return cote;
	}


	public void setCote(int cote) {
		this.cote = cote;
	}


	//Obligatoirement utiliser et plus on la besoin
      @Override
	public void transalter() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected double calculerSurface() {
	
		return cote*cote;
	}
	//Obligatoirement utiliser et plus on la besoin
	// methode translater 
	@Override
	public void transalter(int dx, int dy) {
		point1.setX(point1.getX()+dx); // l'ecapsulation 
		point1.setY(point1.getY()+dy);
		
	}

}

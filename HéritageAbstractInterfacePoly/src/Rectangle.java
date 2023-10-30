
public class Rectangle extends Form implements Translation  {


	 Point point1; // il va nous servir pour methode translater
      private int larg,lang;
      
	 
	public Rectangle(Point point1, int larg, int lang) {
		this.point1 = point1;
		this.larg = larg;
		this.lang = lang;
	}
	
	//Obligatoirement utiliser et plus on la besoin
	// methode translater 
	@Override
	public void transalter(int dx, int dy) {
		point1.setX(point1.getX()+dx); // l'ecapsulation 
		point1.setY(point1.getY()+dy);
		
	}



	@Override
	protected double calculerSurface() {
		return lang*larg;
	}

}

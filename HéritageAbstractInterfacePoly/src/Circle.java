
public class Circle extends Form implements Translation {
  
	
	Point centre; // le circle a un  centre  est ce dernier est  un point
       double rayon;
       
       public Circle(Point centre,double rayon) {
            this.centre=centre;
            this.rayon=rayon;
    	    
       }
       
    
       @Override
   	protected double calculerSurface() {
   	  return Math.PI*rayon*rayon;
   	}

          // methode de translation
	@Override
	public void transalter(int dx, int dy) {
		centre.setX(centre.getX()+dx); // l'ecapsulation 
		centre.setY(centre.getY()+dy);
		
	}
       
       
}

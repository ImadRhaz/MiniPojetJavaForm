//on va utilise  la methode calculerSurface Abstract,on sait pas calculer ca mthd 
//donc la class doit etre abstract

public  abstract class Polygone extends Form  {
	protected int nbrCote;
	
	//Getrs et seters juste pour s'habituer
	public int getNbrCote() {
		return nbrCote;
	}

	public void setNbrCote(int nbrCote) {
		this.nbrCote = nbrCote;
	}
	//Methode Pour afficher type de plygone 
	protected String  afficherTypePolygone() {
		String type="Type inconnu";
	 if (nbrCote==3) type="Triangle";
	 else if (nbrCote==4) type="Quadrilatére";
	 else if (nbrCote==5) type="Pentagone";
	 else if (nbrCote==6) type="Hexagone";
	
	 return type;
	}

	@Override
	protected double calculerSurface() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
 	

}

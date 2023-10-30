
public class TestMain {

 public static void main(String args[]) {
	 
	 Point point1= new Point(1, 2);
	 Circle circle1 =new Circle(point1, 3);
	 //chaqu'un a c'est point 
	 Carre carre1 = new Carre(new Point(-1, -2), 4);
     Rectangle rectangle1 = new Rectangle(new Point(5, -3), 4, 3);
     // on va creer un tableau d forme
     Form[] formes =new Form[3];
     //remplissage 
     formes[0]=circle1;
     formes[1]=carre1;
     formes[2]=rectangle1;
     //affichage  de surface des form entrer 
     for (Form form : formes) 
    	System.out.println( form.calculerSurface());
       System.out.println(point1);//afficher point avant transl
       point1.transalter(1, -1);
       System.out.println(point1);
       System.out.println(carre1.getPoint1());//afficher les cordonnes de carre avant transl
       carre1.transalter(3,2);
       System.out.println(carre1.getPoint1());
       
    	 
    	
     
     
 
 }
 
}

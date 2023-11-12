

public class Main {
	   public static void main(String[] args) {
		   Family family = new Family();
		   /*Add Nieces to Family*/
		   family.addNiece("Aqila", 23, 2);
		   family.addNiece("Ghifari", 1, 10);
		   
		   /*Checking for Duplicate Nieces*/
		   if(family.addNiece("Aqila", 23, 2)) System.out.println("Duplicate input !! ");
		   
		   /* Add Uncle to Family */
		   family.addUncle("Tony Suwandito");
		   family.addUncle("Asep Saepulloh");
		   
		   /*find uncle*/
		   Uncle uncle = family.findUncle("Tony Suwandito");
		   Uncle uncle1 = family.findUncle("Asep Saepulloh");
		   if(family.findUncle("") != null) System.out.println("Uncle Not Found");
		   
		   /*Add Present*/
		   uncle.addPresent(family.findNiece("Aqila"), "Lego");
		   family.addNiece("Adrian", 9, 11);
		   
		   /*Checking Present from Uncle*/
		   uncle.addPresent(family.findNiece("Ghifari"), "MiniCar");
		   uncle.addPresent(family.findNiece("Adrian"), "MiniCar");
		   
		   /*Checking two Uncle for given the same present*/
		   uncle1.addPresent(family.findNiece("Ghifari"), "MiniCar");
		   
		   /*List Nieces with present*/
		   System.out.println("-----------------------------------------------");
		   System.out.println("Nieces Name with they Birthday :");
		   family.listNieces();
		   System.out.println("Uncle Name :");
		   family.listUncles();
		   uncle.listPresents();
		   family.findNiece("Aqila").listPresents();
		   family.findNiece("Ghifari").listPresents();
	   }
}

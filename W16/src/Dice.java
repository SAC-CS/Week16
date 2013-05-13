/**
 * 
 */

/**
 * @author dhuynh
 *
 */
/*--------------- Parent Class Dic ---------------*/
public class Dice {
	  private int numberofrolls = 0;
	  private int numberofdices = 1;


	  public void setDiceCount(int n ){
	  /*--------------- Set number of dices ---------------*/
		  numberofdices = n;
	  }
	  
	  public Dice(){
	  /*--------------- Dice Constructor    ---------------*/
		  numberofrolls = 0;
		  numberofdices = 1;
	  }
	  
	  public int RollDice()
	  /*--------------- Roll Dice(s) and increment RollCounts    ---------------*/
	  {
		int rndno;
		rndno = (1 + (int) (Math.random() *  6))* numberofdices;
		numberofrolls = numberofrolls + numberofdices ;
	  
	  	return rndno;
	  }

	  public int RollCount()
	  {
	  	return numberofrolls;
	  }
	  
	  public String RollCountMsg()
	  {
	  	return "Dices rolled thus far: " + numberofrolls ;
	  }
	  
}

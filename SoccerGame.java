public class SoccerGame{

	public static void main(String[] args){

		//initialize teams
		SoccerTrainer favre = new SoccerTrainer("Lucien Favre");
		SoccerTeam bvb = new SoccerTeam("Borussia Dortmund", favre, 1);
		bvb.addPlayer(new SoccerPlayer("Roman Buerki"));
		bvb.addPlayer(new SoccerPlayer("Marco Reus"));
		bvb.addPlayer(new SoccerPlayer("Mario Goetze"));
		bvb.addPlayer(new SoccerPlayer("Christian Pulisic"));
		bvb.addPlayer(new SoccerPlayer("Paco Alcacer"));
		bvb.addPlayer(new SoccerPlayer("Axel Witsel"));
		bvb.addPlayer(new SoccerPlayer("Achraf Hakimi"));
		bvb.addPlayer(new SoccerPlayer("Julian Weigl"));
		bvb.addPlayer(new SoccerPlayer("Raphael Guerreiro"));
		bvb.addPlayer(new SoccerPlayer("Abdou Diallo"));
		bvb.addPlayer(new SoccerPlayer("Lukasz Piszczek"));

		SoccerTrainer kovac = new SoccerTrainer("Niko Kovac");
		SoccerTeam bayern = new SoccerTeam("Bayern Muenchen", kovac, 2);
		bayern.addPlayer(new SoccerPlayer("Manuel Neuer"));
		bayern.addPlayer(new SoccerPlayer("James Rodriguez"));
		bayern.addPlayer(new SoccerPlayer("Robert Lewandowski"));
		bayern.addPlayer(new SoccerPlayer("Arjen Robben"));
		bayern.addPlayer(new SoccerPlayer("Franck Ribery"));
		bayern.addPlayer(new SoccerPlayer("Thomas Mueller"));
		bayern.addPlayer(new SoccerPlayer("Alphonso Davies"));
		bayern.addPlayer(new SoccerPlayer("Jerome Boateng"));
		bayern.addPlayer(new SoccerPlayer("Rafinha"));
		bayern.addPlayer(new SoccerPlayer("Mats Hummels"));
		bayern.addPlayer(new SoccerPlayer("Thiago Alcantara"));

		//start game
		bvb.goal(11);
		bayern.goalAgainst();
		bvb.goal(5);
		bayern.goalAgainst();
		bvb.goal(7);
		bayern.goalAgainst();
		bayern.goal(10);
		bvb.goalAgainst();
		bvb.goal(3);
		bayern.goalAgainst();
		System.out.println();
		
		//results
		System.out.println(bvb);
		System.out.println(bayern);

	}

}

public class SoccerPlayer {
	
	private String name;
	private SoccerTeam team;
	private int number;
	private int goals;
	private boolean yellowcard = false;
	private boolean redcard= false;
	
	
	public SoccerPlayer(String name ){
		this.name= name;
	}
	
	public void redCard(){
		this.redcard=true;
		
		
	}
	public void yellowCard(){
		if(yellowcard == true){
		 this.redcard=this.yellowcard;
		}
		else{
			yellowcard = true;
		}
		
		
	}
	public int getNumber(){
		
		return this.number;
		
	}
		
	public void setNumber(int number){
		this.number=number;	
		
		}
	public String getName(){
		
				return this.name;
				
	}
	public SoccerTeam getTeam(){
				return team;
				
		}
	public void increaseGoalCount(){
		goals+=1 ;
		
				
	}
	public void setTeam(SoccerTeam newTeam){
			this.team=newTeam;	
				
			}
	public String toString() {
		String s= this.name + " " + this.number + " " + this.team.getName() + " " + this.goals;
		System.out.println(s);
		return s;
	}
	
	
	
}

public class SoccerTeam {
   private SoccerTrainer trainer;
	private String name;
	private int tablePosition;
	private int goalsScored;
	private int goalsAgainst;
	private SoccerPlayer[] players = new SoccerPlayer[11];
	private int slot = 0;
	
	public SoccerTeam(String name, SoccerTrainer trainer, int tablePosition ){
		this.name=name;
		this.trainer=trainer;
		this.tablePosition=tablePosition;
		
	}
		
		public String getName(){
			
			return this.name;
			
		}
		public boolean addPlayer(SoccerPlayer player){
			
				//looks for empty (null) slot
			while(slot<players.length) {
				if(players[slot]==null) {			
				//enters the player at this position
					players[slot]=player;
				//sets the team of the player
					players[slot].setTeam(this);
				//sets the number of the player
					players[slot].setNumber(slot+1);
				//return true
					return true;
					
				//if no empty slot, return false
				}slot++;
			
			}	return false;
			}
		public void goal(int playerNumber){
			this.goalsScored+=1;
			players[playerNumber-1].increaseGoalCount();
			
		}
		public void goalAgainst(){
			goalsAgainst+=1;
		}
		public String ratioString(){
			
			return goalsScored+":"+goalsAgainst;
		}
		public String toString(){
			String result = name + ", " + trainer.getName() + ", " + ratioString() + "\n " ;

			for(int i=0;i<players.length;i++){
				result +="player:\n"+players[i].toString();
			}

			return result;
			
		}
	}
	


public class SoccerTrainer {
    public String trainer;
    
	public SoccerTrainer(String trainer) {
		this.trainer= trainer;
	}
   public String getName(){
	   
	   return this.trainer;
   }
}

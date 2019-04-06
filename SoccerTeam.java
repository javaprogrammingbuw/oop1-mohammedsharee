
public class SoccerTeam {
   private SoccerTrainer trainer;
	private String name;
	private int tablePosition;
	private int goalsScored;
	private int goalsAgainst;
	private SoccerPlayer[] players = new SoccerPlayer[11];
	
	
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
				//enters the player at this position
				//sets the team of the player
				//sets the number of the player
				//return true
				//if no empty slot, return false
			
			
				
			}
		public void goal(int playerNumber){
			
			
		}
		public void goalAgainst(){
			goalsAgainst+=1;
		}
		public String ratioString(){
			
			
		}
		public String toString(){
			
			
		}
	}
	


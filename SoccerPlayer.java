public class SoccerPlayer {
	
	public class SoccerTeam {

		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	
	}
	public String name;
	public SoccerTeam team;
	public int number;
	public int goals;
	public boolean yellowcard = false;
	public boolean redcard= false;
	
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
		String s= this.name + this.number + this.team.getName() + this.goals;
		System.out.println(s);
		return s;
	}
	
	
	
}
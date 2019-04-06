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
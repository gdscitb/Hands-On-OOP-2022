import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Leaderboard {
	Integer totalDistance;
	Runner winner;
	ArrayList <Runner> runners;
	boolean isRunning;
	Integer[] totalDistanceChoice;

	public Leaderboard(ArrayList <Runner> runners) {
		System.out.println("Generating data statistics...");
		this.totalDistanceChoice = new Integer[] {150, 250, 500};
		this.totalDistance = generateTotalDistance();
		this.runners = runners;
		this.isRunning = true;
	}
	
	public Integer generateTotalDistance() {
		Integer randomNumber = ThreadLocalRandom.current().nextInt(0, 3);
		return totalDistanceChoice[randomNumber];
	}
	
	public void updateBoard() {
		for(Runner a: runners) {
			a.distance += a.move();
		}
	}
	
	public void resetBoard() {
		for(Runner a: runners) {
			a.distance = 0;
		}
	}
	
	public void showBoard() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Current Standing [" + this.totalDistance + "]");
		System.out.println("No | Name | Type | Distance");
		
		Collections.sort(this.runners);
		
		for(int i = 0; i < this.runners.size(); i++) {
			Runner curr = this.runners.get(i);
			System.out.println(i+1 + " " + curr);
			
			if(curr.distance >= this.totalDistance) {
				this.winner = curr;
				this.isRunning = false;
			}
		}
		
		if(this.isRunning == false) {
			System.out.println(this.winner.name + " wins!");
		} else {
			scan.nextLine();
		}
	}

}

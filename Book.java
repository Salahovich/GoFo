package goFootball;

/**
 * @author Tarek Abd El-hady Ahmed 20190274
 * Implementation of class Book
 *
 */

import java.util.*;

public class Book {
	
	/** Private Attributes **/ 
	private int id;
	private int playgroundID;
	private int playerID;
	private int ownerID;
	private String status;
	private double cost;
	private Pair<Double, Double> hour = new Pair<Double, Double>();

	/**	
	 * 
	 * Parameterized Constructor to set the the class Book 
	 * @param Playground, Player, Owner, pair<Double, Double>
	 *
	 */
	Book(int pgID, int oID, int pID,  Pair<Double, Double> time, double value){
		playgroundID = pgID;
		playerID = oID;
		playerID = pID;
		hour = time;
		cost = value;
		status= "Pending";
	}
	
	/**
	 * Public method to set the hour of the book
	 * @param Pair<Double, Double>
	 */
	public void setHour(Pair<Double, Double> value) {
		hour = value;
	}
	
	/**
	 * Public method to set status to Accepted
	 * @return void
	 */
	public void setAccepted() {
		status = "Accepted";
	}
	
	/**
	 * Public method to set status to Denied
	 * @return void
	 */
	public void setDenied() {
		status = "Denied";
	}
	
	/**
	 * Public method to get the total cost of the book
	 * @return double
	 */
	public double getTotalCost() {
		return cost;
	}
	
	/**
	 * Public method to set the ID of the book
	 * @param integer
	 * @return void
	 */
	public void setID(int value) {
		id = value;
	}
	
	/**
	 * Public method to get the ID of the book
	 * @return Integer
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Public method to get the ID of the player
	 * @return integer
	 */
	public int getPlayerID() {
		return playerID;
	}
	
	/**
	 * Public method to get the ID of the Playground
	 * @return integer
	 */
	public int getPlaygroundID() {
		return playgroundID;
	}
	
	/**
	 * Public method to get the ID of the Owner
	 * @return integer
	 */
	public int getOwnerID() {
		return ownerID;
	}
	
	/**
	 * Public method to get the status of the book
	 * @return String
	 */
	public String getStatus(){
		return status;
	}
	
	/**
	 * Public method to get the total cost of a book
	 * @return double
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Overridden method to print the info of the book in a a proper way.
	 * @return String
	 */
	public String toString() {
		return "** Book " + id + "**\nPlayground ID:" + getPlaygroundID() + "\nPlayer ID: " + getPlayerID() + "\nHour: " + hour.toString() + "\nTotal Cost: " + getCost() + "\nStatus: " + status.toString();
	}
}

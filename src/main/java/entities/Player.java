package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "ipl_players")
public class Player extends BaseEntity {
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String email, String firstName, String lastName, LocalDate dob, Double battingAvg, int wicketsTaken) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	}
	
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 30,name = "first_name")
	private String firstName;
	@Column(length = 30,name = "last_name")
	private String lastName;
	private LocalDate dob;
	@Column(name = "batting_avg")
	private Double battingAvg;
	@Column(name = "wickets+taken")
	private int wicketsTaken;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Double getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(Double battingAvg) {
		this.battingAvg = battingAvg;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		wicketsTaken = wicketsTaken;
	}
	@Override
	public String toString() {
		return "Player [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}
		

}

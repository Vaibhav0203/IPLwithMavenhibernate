package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Team extends BaseEntity {

public Team() {
		// TODO Auto-generated constructor stub
	}
public Team(String name, String abbreviation, String owner, int maxAge, Double mniBattingAvg, int minWicketTaken) {
		super();
		this.name = name;
		this.abbreviation = abbreviation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.mniBattingAvg = mniBattingAvg;
		this.minWicketTaken = minWicketTaken;
	}


@Column(length = 30,unique = true)
private String name;
@Column(length = 10,unique = true)
private String abbreviation;
@Column(length = 30)
private String owner;
@Column(name = "max_age")
private int maxAge;
@Column(name = "min_batting_avg")
private Double mniBattingAvg;
@Column(name = "min_wicket_taken")
private int minWicketTaken;
	





	
}

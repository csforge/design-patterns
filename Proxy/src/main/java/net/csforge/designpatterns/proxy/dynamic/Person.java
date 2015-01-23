package net.csforge.designpatterns.proxy.dynamic;

public class Person implements PersonInterface{
	private String name;
	private String age;
	private int sextual;
	private String interest;
	private int rating;
	private int rateCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSextual() {
		return sextual;
	}
	public void setSextual(int sextual) {
		this.sextual = sextual;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public int getRating() {
		if (rateCount > 0)
			return rating / rateCount;
		return rating;
	}
	public void setRating(int rating) {
		this.rating += rating;
		this.rateCount += 1;
	}

}

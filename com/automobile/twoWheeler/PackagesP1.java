package com.automobile.twoWheeler;

class Hero extends com.automobile.Vehicle {

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	int Speed;
	String radio;
	public void setSpeed(int Speed) {
		this.Speed=Speed;
	}
	public int getSpeed() {
		return Speed;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public Hero(int speed, String radio) {
		super();
		Speed = speed;
		this.radio = radio;
	}
	

}
//------------------------------------------------------------------------------------------------
class Honda extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	int Speed;
	String CDPlayer;
	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int Speed) {
		this.Speed = Speed;
	}

	public String getCDPlayer() {
		return CDPlayer;
	}

	public void setCDPlayer(String CDPlayer) {
		this.CDPlayer = CDPlayer;
	}

	public Honda(int Speed, String CDPlayer) {
		super();
		this.Speed = Speed;
		this.CDPlayer = CDPlayer;
	}
	
}
//------------------------------------------------------------------------------------------------



public class PackagesP1 {

	public static void main(String[] args) {
		Hero h1=new Hero(20, "yes");
		Honda h2=new Honda(50, "No");
		System.out.println("Hero Speed->"+h1.getSpeed());
		System.out.println("Hero Radio->"+h1.getRadio());
		System.out.println("Honda Speed->"+h2.getSpeed());
		System.out.println("Honda CDPlayer->"+h2.getCDPlayer());

	}

}

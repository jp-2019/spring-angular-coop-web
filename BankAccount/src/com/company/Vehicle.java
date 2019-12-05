package com.company;

public class Vehicle {
    private int door;
    private int wheels;
    private int seats;
    private String colour;
    private String name;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(int door, int wheels, int seats, String colour, String name) {
        this.door = door;
        this.wheels = wheels;
        this.seats = seats;
        this.colour = colour;
        this.name = name;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at");
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}

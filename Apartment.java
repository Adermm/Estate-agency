/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mian;

class Apartment extends Property {
    private int floor;
    private boolean hasParking;

    public Apartment(double area, int rooms, String neighborhood, double price, int floor, boolean hasParking) {
    super(area, rooms, neighborhood, price);
    this.floor = floor;
    this.hasParking = hasParking;
}

    @Override
    public void display() {
        System.out.println("Type: Apartment");
        System.out.println("Area: " + getArea() + " m2");
        System.out.println("Rooms: " + getRooms());
        System.out.println("Neighborhood: " + getNeighborhood());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Floor: " + floor);
        System.out.println("Parking: " + (hasParking ? "Yes" : "No"));
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }
}

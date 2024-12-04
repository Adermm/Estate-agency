/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mian;
class FurnishedApartment extends Apartment {
    private int furnitureQuality;

    public FurnishedApartment(double area, int rooms, String neighborhood, double price, int floor, boolean hasParking, int furnitureQuality) {
        super(area, rooms, neighborhood, price, floor, hasParking);
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        System.out.println("Type: Furnished Apartment");
        System.out.println("Area: " + getArea() + " m2");
        System.out.println("Rooms: " + getRooms());
        System.out.println("Neighborhood: " + getNeighborhood());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Floor: " + getFloor());
        System.out.println("Parking: " + (isHasParking() ? "Yes" : "No"));
        System.out.println("Furniture Quality: " + furnitureQuality + " (1=Best, 5=Worst)");
    }

   
}

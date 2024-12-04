/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mian;

class Villa extends Property {
    private boolean hasSwimmingPool;
    

    
    public Villa(double area, int rooms, String neighborhood, double price, boolean hasSwimmingPool) {
        super(area, rooms, neighborhood, price);
        this.hasSwimmingPool = hasSwimmingPool;
       
    }

    @Override
    public void display() {
        System.out.println("Type: Villa");
        System.out.println("Area: " + getArea() + " m2");
        System.out.println("Rooms: " + getRooms());
        System.out.println("Neighborhood: " + getNeighborhood());
        System.out.println("Price: " + getPrice() + " USD");
        System.out.println("Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

   
   
}

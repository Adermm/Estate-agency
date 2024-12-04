/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mian;

/**
 *
 * @author lacey
 */

public class Mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         RealEstateSystem system = new RealEstateSystem();
         

        system.addProperty(new Villa(300, 5, "garden city", 500000, true));
        system.addProperty(new Apartment(120, 3, "tuimalik", 250000, 6, false));
        system.addProperty(new FurnishedApartment(90, 2, "bakhtyari", 200000, 4, false, 1));

        system.displayAllProperties();

        system.removeProperty(1);

        system.displayAllProperties();
    }
}

package mian;

import java.util.ArrayList;

public class RealEstateSystem {
    private ArrayList<Property> properties;

    public RealEstateSystem() {
        properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        if (properties.size() < 100) {
            int i=1;
            i++;
            properties.add(property);
            System.out.println(" added successfully."+i);
        } else {
            System.out.println("Cannot add more properties. Maximum limit reached.");
        }
    }

    public void removeProperty(int index) {
        if ( index < properties.size()) {
            properties.remove(index);
            System.out.println("\n ***********************");
            System.out.println("Property of :("+index+") removed successfully.");
        } else {
            System.out.println("Invalid property index.");
        }
    }

    public void displayAllProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties listed.");
        } else {
            for (int i = 0; i < properties.size(); i++) {
                System.out.println("\nProperty Index: " + i);
                properties.get(i).display();
            }
        }
    }
}

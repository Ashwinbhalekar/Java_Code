/*Q1. .Write a java program to Create a HashMap called populationMap,
stores population data for several cities, retrieves and prints the population
of a specific city, iterates through the map to print all city populations,
removes a city from the map, and checks if a city exists in the map. */
package Collection.Map;

import java.util.HashMap;

public class PopulationMap {
    public static void main(String[] args) {
        HashMap<Integer,String> tm = new HashMap<>();
        tm.put(12345567,"Nagpur");
        tm.put(123417,"Gondia");
        tm.put(1234556567,"Mumbai");
        tm.put(129683635,"Pune");
        
        tm.remove(123417);                            //Removing the city 
        
        for(Integer i:tm.keySet()){                     //Accessing the data using keySet in for each loop
            String val = tm.get(i);
            System.out.println("Population: "+i+" City: "+val);
        }
        System.out.println(tm.get(129683635));
        
    }
}

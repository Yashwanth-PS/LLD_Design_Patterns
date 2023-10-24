package Creational_Design_Pattern.Prototype_Registry.Prototype_Registry_Impl;

import java.util.HashMap;

public class StudentRegistry {
    // Step5: Create the Registry class and define the HashMap
    private HashMap<String, Student> map;

    public StudentRegistry() { // Step6: Define an Constructor
        this.map = new HashMap<>(); // Let the Object creation of the map happen within the constructor
    }

    // Step7: Define the Register method and Get method within the registry
    public void register(String key, Student prototype){
        map.put(key, prototype);
    }

    public Student get(String key){
        return map.get(key);
    }
}
package Creational_Design_Pattern.Prototype_Registry.Using_Copy_Constructor;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public void registerPrototype(String key, Student prototype){
        registry.put(key,prototype);
    }

    public Student getPrototype(String key){
        return registry.get(key);
    }

}
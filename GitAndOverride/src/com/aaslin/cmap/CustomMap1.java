/***Create a class named CustomMap that implements the Map interface. 
 * Override the put() and get() methods to provide a custom implementation.
 * The put() method should store the key-value pair in a custom data structure (e.g., a list or an array) and the get() method should retrieve the value associated with the given key from the custom data structure. Ensure that your implementation adheres to the contract defined by the Map interface. Test your CustomMap implementation by creating instances of CustomMap, adding key-value pairs, and retrieving values using the get() method. Also, ensure that your implementation handles edge cases such as handling null keys and values appropriately. Additionally, you can write unit tests to verify the correctness of your implementation.
@author ReshmikaBandaru
***/







package com.aaslin.cmap;

import java.util.*;

public class CustomMap1<K, V> implements Map<K, V> {
    private Map<K, V> data;

    public CustomMap1() {
        data = new HashMap<>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return data.containsValue(value);
    }

    @Override
    public V get(Object key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        return data.get(key);
    }

    @Override
    public V put(K key, V value) {
        if (key == null) {
            
        }
        if (value == null) {
            
        }
        return data.put(key, value);
    }

    @Override
    public V remove(Object key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        return data.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        data.putAll(m);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public Set<K> keySet() {
        return data.keySet();
    }

    @Override
    public Collection<V> values() {
        return data.values();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return data.entrySet();
    }

    public static void main(String[] args) {
        CustomMap1<Integer, String> cm = new CustomMap1<>();

        //  putting key-value pairs
        cm.put(1, "virat");
        cm.put(2, "dhoni");
        cm.put(3, "sharma");

        //  retrieving values
        System.out.println(cm.get(1)); 
        System.out.println(cm.get(2));
        System.out.println(cm.get(3));

        //  handling null keys
        try {
            cm.put(null, "Shami");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        cm.put(4, null);
        System.out.println(cm.get(4)); // Output will be null for this
    }
}

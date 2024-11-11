package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class representing IntegerSet, which stores a unique collection of integers.
 */
public class IntegerSet {

    private List<Integer> numberSet = new ArrayList<Integer>();

    /**
     * Default constructor initializes an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Parameterized constructor initializes the set with a given list of integers.
     * 
     * @param initialSet ArrayList<Integer> to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> initialSet) {
        this.numberSet = initialSet;
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        numberSet.clear();
    }

    /**
     * Returns the number of elements in the set.
     * 
     * @return size of the set.
     */
    public int length() {
        return numberSet.size();
    }

    /**
     * Checks if two sets are equal. Two sets are considered equal if they contain the same elements, regardless of order.
     * 
     * @param obj Object to compare with.
     * @return true if sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntegerSet otherSet = (IntegerSet) obj;
        return numberSet.containsAll(otherSet.numberSet) && otherSet.numberSet.containsAll(numberSet);
    }

    /**
     * Checks if the set contains a specific value.
     * 
     * @param value Integer value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return numberSet.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return largest integer in the set.
     * @throws Exception if the set is empty.
     */
    public int largest() throws Exception {
        if (numberSet.isEmpty()) {
            throw new Exception("Set cannot be empty");
        }
        return Collections.max(numberSet);
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return smallest integer in the set.
     * @throws Exception if the set is empty.
     */
    public int smallest() throws Exception {
        if (numberSet.isEmpty()) {
            throw new Exception("Set cannot be empty");
        }
        return Collections.min(numberSet);
    }

    /**
     * Adds an integer to the set if it's not already present.
     * 
     * @param item Integer to add to the set.
     */
    public void add(int item) {
        if (!numberSet.contains(item)) {
            numberSet.add(item);
        }
    }

    /**
     * Removes a specific integer from the set if present.
     * 
     * @param item Integer to remove from the set.
     */
    public void remove(int item) {
        numberSet.remove(Integer.valueOf(item));
    }

    /**
     * Combines the current set with another set, adding any unique elements from the other set.
     * 
     * @param otherSet IntegerSet to union with.
     */
    public void union(IntegerSet otherSet) {
        for (int element : otherSet.numberSet) {
            if (!numberSet.contains(element)) {
                numberSet.add(element);
            }
        }
    }

    /**
     * Retains only the elements that are present in both sets.
     * 
     * @param otherSet IntegerSet to intersect with.
     */
    public void intersect(IntegerSet otherSet) {
        numberSet.retainAll(otherSet.numberSet);
    }

    /**
     * Removes all elements in the other set from the current set.
     * 
     * @param otherSet IntegerSet to find the difference with.
     */
    public void diff(IntegerSet otherSet) {
        numberSet.removeAll(otherSet.numberSet);
    }

    /**
     * Complements the set by removing its elements and replacing them with elements from another set that are not present.
     * 
     * @param otherSet IntegerSet to find the complement with.
     */
    public void complement(IntegerSet otherSet) {
        List<Integer> complementSet = new ArrayList<Integer>();
        for (int item : otherSet.numberSet) {
            if (!numberSet.contains(item)) {
                complementSet.add(item);
            }
        }
        numberSet = complementSet;
    }

    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return numberSet.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * 
     * @return String formatted as a set {element1, element2, ...}.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < numberSet.size(); i++) {
            sb.append(numberSet.get(i));
            if (i < numberSet.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

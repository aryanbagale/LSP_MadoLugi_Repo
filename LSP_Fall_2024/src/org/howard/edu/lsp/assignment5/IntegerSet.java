package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class representing an IntegerSet.
 * Provides methods to manipulate and perform operations on a set of integers.
 */
public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();  // Internal representation of the set
	
	/**
	 * Default Constructor.
	 * Initializes an empty IntegerSet.
	 */
	public IntegerSet() {
		// No initialization required, ArrayList is already initialized
	}
	
	/**
	 * Parameterized Constructor.
	 * Initializes the set with a given list of integers.
	 * 
	 * @param set an ArrayList of integers to initialize the set.
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	/**
	 * Clears the internal representation of the set, making it empty.
	 */
	public void clear() {
		set.clear();
	} 
	
	/**
	 * Returns the size of the set.
	 * 
	 * @return the number of elements in the set.
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Compares two sets for equality.
	 * Two sets are considered equal if they contain the same elements, regardless of the order.
	 * Overrides the default equals method from the Object class.
	 * 
	 * @param o the object to compare to the current set.
	 * @return true if the sets are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;  // If the compared object is the same as this object
		if (o == null || getClass() != o.getClass()) {  // Check for null or different class
			return false; 
		}
		IntegerSet otherSet  = (IntegerSet) o;
		return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);  // Check if both sets contain each other
	}
	
	/**
	 * Checks if the set contains a specific value.
	 * 
	 * @param value the integer value to check.
	 * @return true if the set contains the value, false otherwise.
	 */
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	/**
	 * Returns the largest element in the set.
	 * 
	 * @return the largest integer in the set.
	 * @throws Exception if the set is empty.
	 */
	public int largest() throws Exception {
		if (set.isEmpty()) {
			throw new Exception("Set Cannot be Empty");
		}
		return Collections.max(set);  // Find and return the largest element
	}
	
	/**
	 * Returns the smallest element in the set.
	 * 
	 * @return the smallest integer in the set.
	 * @throws Exception if the set is empty.
	 */
	public int smallest() throws Exception {
		if (set.isEmpty()) {
			throw new Exception("Set Cannot be Empty");
		}
		return Collections.min(set);  // Find and return the smallest element
	}
	
	/**
	 * Adds an element to the set if it's not already present.
	 * 
	 * @param item the integer to add to the set.
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * Removes a specific element from the set.
	 * 
	 * @param item the integer to remove from the set.
	 */
	public void remove(int item) {
		set.remove(Integer.valueOf(item));  // Remove the item by value
	}
	
	/**
	 * Performs the union of the current set with another set.
	 * Adds all elements from the other set that are not already present in the current set.
	 * 
	 * @param intSetb the other IntegerSet to union with.
	 */
	public void union(IntegerSet intSetb) {
		for(int element : intSetb.set) {
			if (!set.contains(element)) {
				set.add(element);  // Add elements that are not already present
			}
		}
	}
	
	/**
	 * Performs the intersection of the current set with another set.
	 * Retains only elements that are present in both sets.
	 * 
	 * @param intSetb the other IntegerSet to intersect with.
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);  // Retain only common elements
	}
	
	/**
	 * Performs the difference of the current set with another set.
	 * Removes all elements from the current set that are also present in the other set.
	 * 
	 * @param intSetb the other IntegerSet to compare with.
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);  // Remove common elements
	}
}
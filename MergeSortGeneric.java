import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.List;

public class MergeSortGeneric{
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
	
	List listToSort = new ArrayList<Integer>(Arrays.asList(12,211,31,51,82,13,21));
	List resultList = mergeSort(listToSort);
    }
    
    public <E extends Comparable<E>> List<E> mergeSort(List<E> unsortedList) {
	
	if (unsortedList == null || unsortedList.size() < 2) {
	    return unsortedList;
	} else {
	    List<E> left = new LinkedList<E>();
	    List<E> right = new LinkedList<E>();
	    
	    int pivot = (1 + unsortedList.size()) / 2;
	    
	    while (!unsortedList.isEmpty()) {
		if (pivot > 0) {
		    left.add(unsortedList.remove(0));
		    
		    pivot--;
		} else {
		    right.add(unsortedList.remove(0));
		}
	    }
	    left = mergeSort(left);
	    right = mergeSort(right);
	    
	    return merge(left, right);
	}
    }
    
    private <E extends Comparable<E>> List<E> merge(List<E> left, List<E> right) {
	List<E> sortedResult = new ArrayList<E>(left.size() + right.size());
	
	while (!left.isEmpty() && !right.isEmpty()) {
	    E leftElem, rightElem;
	    
	    leftElem = left.get(0);
	    rightElem = right.get(0);
	    
	    if (leftElem.compareTo(rightElem) < 0) {
		sortedResult.add(leftElem);
		
		left.remove(0);
	    } else {
		sortedResult.add(rightElem);
		
		right.remove(0);
	    }
	}
	sortedResult.addAll(left);
	sortedResult.addAll(right);
	
	return sortedResult;
    }
}
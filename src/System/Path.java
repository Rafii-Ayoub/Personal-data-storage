package src.System;

import java.util.ArrayList;
import java.util.Comparator;

public class Path {
	
	// Attributes
	private ArrayList<SystemNode> pathList;
	private int depth ;
	
	/**
         * Constructor
	 */
	public Path(ArrayList<SystemNode> list) {
		super();
		this.pathList = list;
		this.depth = pathList.size() - 1;
	}
	
	// methods and functions
	
	
	/**
	 * Method to add List of SystemNode object to the path list
	 * @param list
	 */
	
	public void addPathList(ArrayList<SystemNode> list) {
		pathList.addAll(list);
	}
	
	/**
	 * Method that returns a boolean to know if a path belongs to a paths list  
	 * @param pathsList
	 * @return boolean
	 */
	public boolean belongsToList(ArrayList<Path> pathsList) {
	    boolean result = false;
	    for(int k=0; k<pathsList.size(); k++) {
	    	if(this.equals(pathsList.get(k))) {
	    		result = true;
	    	}
	    }
	    return result;
	    
	}
	/**
	 * Method to compare the depth of 2 paths
	 * @return integer 
	 */
	
	public static Comparator<Path> pathComparator = new Comparator<Path>() {

		public int compare(Path p1, Path p2) {

		   int depth1 = p1.getDepth();
		   int depth2 = p2.getDepth();

		   return depth1-depth2;

		  
	   }};

	
	// getters and setters
	public ArrayList<SystemNode> getPathList() {
		return pathList;
	}
	public void setPathList(ArrayList<SystemNode> pathList) {
		this.pathList = pathList;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Path [pathList=" + pathList + ", depth=" + depth + "]";
	}
	
	

}

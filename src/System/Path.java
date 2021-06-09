import java.util.ArrayList;
import java.util.Comparator;

public class Path {
	
	private ArrayList<SystemNode> pathList;
	private int depth ;
	
	public Path(ArrayList<SystemNode> list) {
		super();
		this.pathList = list;
		this.depth = pathList.size() - 1;
	}
	
	// methods and functions
	
	public void addPathList(ArrayList<SystemNode> list) {
		pathList.addAll(list);
	}
	
	public boolean belongsToList(ArrayList<Path> pathsList) {
	    boolean result = false;
	    for(int k=0; k<pathsList.size(); k++) {
	    	if(this.equals(pathsList.get(k))) {
	    		result = true;
	    	}
	    }
	    return result;
	    
	}
	
	public static Comparator<Path> pathComparator = new Comparator<Path>() {

		public int compare(Path p1, Path p2) {

		   int path1 = p1.getDepth();
		   int path2 = p2.getDepth();

		   return path1-path2;

		  
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

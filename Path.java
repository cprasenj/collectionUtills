import java.util.Map;
import java.util.HashMap;

public class Path{
	private Map<Start, Destination> map = new HashMap<Start, Destination>();
	
	public void insertPath(String start,String destination) {
		map.put(new Start(start), new Destination(destination));
	}
	public boolean hasPath(String start,String destination) {
		Start s = new Start(start);
		System.out.println(map.get(s).place());
		return destination == map.get(s).place();
	} 
}
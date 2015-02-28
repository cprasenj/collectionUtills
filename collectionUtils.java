import java.util.*;

public class collectionUtils {
	public static List map(List list, ListMapper lm) {
		List l = new ArrayList();
		for(Object i: list){
			l.add(lm.manipulator(i));
		}
		return l;
	}

	public static List filter(List list, ListFilter lf) {
		List l = new ArrayList();
		for(Object i: list)
			if(lf.qualifire(i))
				l.add(i);
		return l;			
	}
}
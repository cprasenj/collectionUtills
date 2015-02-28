import java.util.*;

public class collectionUtils{
	public static <E> List map(List<E> list, ListMapper lm) {
		List l = new ArrayList();
		for(E i: list){
			l.add(lm.manipulator(i));
		}
		return l;
	}

	public static <E> List filter(List<E> list, ListFilter lf) {
		List l = new ArrayList();
		for(E i: list)
			if(lf.qualifire(i))
				l.add(i);
		return l;			
	}
}
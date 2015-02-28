import java.util.*;

public class CollectionUtils{
	public static <E,K> List <K> map(List<K> list, ListMapper<K,E> lm) {
		List l = new ArrayList();
		for(K i: list){
			l.add(lm.manipulator(i));
		}
		return l;
	}

	public static <E> List filter(List<E> list, ListFilter<E> lf) {
		List l = new ArrayList();
		for(E i: list)
			if(lf.qualifire(i))
				l.add(i);
		return l;			
	}

	public static <E,K> K reduce(List<E> list, ListReducer<E,K> lr, K initial) {
		K foo=initial;
		for(E element: list)
			foo=lr.reducer(element,foo);
		return foo;
	}

}
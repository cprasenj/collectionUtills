import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

import static org.junit.Assert.*;
public class CollectionUtilsTest {
	@Test
	public void initialtest() {
		assertEquals(2,2);
	}
	@Test
	public void Map_gives_add_one_with_each_value_and_gives_a_different_list(){
		List l = new ArrayList();
		List p = new ArrayList();
		Add a = new Add();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		p = collectionUtils.map(l,a);
		for(int i = 0;i<5;i++){
			assertEquals((int)p.get(i),i+1);
		}
	}

	@Test
	public void Map_gives_upperCase_string_list(){
		List<String> l = new ArrayList<String>();
		List<String> p = new ArrayList<String>();
		UpperCase a = new UpperCase();
		l.add("prasenjit");
		l.add("buddha");
		l.add("pooja rani");
		l.add("ananthu");
		l.add("swamiji");
		l.add("jayanth");
		p = collectionUtils.map(l,a);
		assertEquals((String)p.get(0),"PRASENJIT");
		assertEquals((String)p.get(1),"BUDDHA");
		assertEquals((String)p.get(2),"POOJA RANI");
		assertEquals((String)p.get(3),"ANANTHU");
		assertEquals((String)p.get(4),"SWAMIJI");
		assertEquals((String)p.get(5),"JAYANTH");
	}

	@Test
	public void filter_gives_vaalues_greater_than_five() {
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> p = new ArrayList<Integer>();
		GreaterThanFive a = new GreaterThanFive();
		l.add(3);
		l.add(7);
		l.add(4);
		l.add(8);
		l.add(1);
		l.add(9);
		p = collectionUtils.filter(l,a);
		assertEquals((int)p.get(0),7);
		assertEquals((int)p.get(1),8);
		assertEquals((int)p.get(2),9);
	}
}
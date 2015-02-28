import org.junit.Test;
import java.util.*;
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
		p = CollectionUtils.map(l,a);
		for(int i = 0;i<5;i++){
			assertEquals(p.get(i),i+1);
		}
	}

	@Test
	public void Map_gives_upperCase_string_list(){
		List l = new ArrayList();
		List p = new ArrayList();
		UpperCase a = new UpperCase();
		l.add("prasenjit");
		l.add("buddha");
		l.add("pooja rani");
		l.add("ananthu");
		l.add("swamiji");
		l.add("jayanth");
		p = CollectionUtils.map(l,a);
		assertEquals(p.get(0),"PRASENJIT");
		assertEquals(p.get(1),"BUDDHA");
		assertEquals(p.get(2),"POOJA RANI");
		assertEquals(p.get(3),"ANANTHU");
		assertEquals(p.get(4),"SWAMIJI");
		assertEquals(p.get(5),"JAYANTH");
	}

	@Test
	public void filter_gives_vaalues_greater_than_five() {
		List l = new ArrayList();
		List p = new ArrayList();
		GreaterThanFive a = new GreaterThanFive();
		l.add(3);
		l.add(7);
		l.add(4);
		l.add(8);
		l.add(1);
		l.add(9);
		p = CollectionUtils.filter(l,a);
		assertEquals(p.get(0),7);
		assertEquals(p.get(1),8);
		assertEquals(p.get(2),9);
	}

	@Test
	public void Map_gives_add_one_with_each_value_and_gives_a_different_string_list(){
		List l = new ArrayList();
		List p = new ArrayList();
		AddString a = new AddString();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		p = CollectionUtils.map(l,a);
		for(int i = 0;i<5;i++){
			assertEquals(p.get(i),""+(i+1));
		}
	}	
}

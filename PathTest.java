import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class PathTest {
	private Path path() {
		Path p = new Path();
		p.insertPath("Bangalore","Singapore");
		p.insertPath("Singapore","Seoul");
		p.insertPath("Singapore","Dubai");
		p.insertPath("Seoul","Beijing");
		p.insertPath("Beijing","Tokyo");
		return p;
	}

	@Test
	public void there_is_no_path_between_Bangalore_tokyo(){
		Path p = path();
		assertEquals(p.hasPath("Bangalore","Tokyo"),false);
	}

	@Test
	public void there_is_path_between_singapore_Seol(){
		Path p = path();
		assertEquals(p.hasPath("Singapore","Seoul"),false);
	}
}




  
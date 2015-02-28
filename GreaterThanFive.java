public class GreaterThanFive implements ListFilter<Integer>{
	public boolean qualifire(Integer a) {
		Integer d = 5;
		return ((Integer)a - d) > 0 ? true : false;
	}
}
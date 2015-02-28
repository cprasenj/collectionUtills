public class GreaterThanFive implements ListFilter{
	public boolean qualifire(Object a) {
		Integer d = 5;
		return ((Integer)a - d) > 0 ? true : false;
	}
}
public class UpperCase implements ListMapper{
	public Object manipulator(Object a) {
		String tmp = (String)a;
		return tmp.toUpperCase();
	}
}
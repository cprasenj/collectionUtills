public class AddString implements ListMapper<Integer,String>{
	public String manipulator(Integer a) {
		return ""+(a+1);
	}
}
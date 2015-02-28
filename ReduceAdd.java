public class ReduceAdd implements ListReducer<Integer,Integer>{
	public Integer reducer(Integer a,Integer b) {
		return new Integer(a+b);
	}
}
import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int start){
		super(start);
	}
	private int findIndex(T value){
		if (value==null){
			throw new IllegalArgumentException("Element cannot be null");
		}
		for (int i=0;i<size()-1;i++){
			if (value.compareTo(get(i))>=0&&value.compareTo(get(i+1))<=0){
				return i+1;
			}
		}
		return size();
	}
	public boolean add(T value){
		int index=findIndex(value);
		super.add(index,value);
		return true;
	}
	public void add(int index, T value){
		int index2=findIndex(value);
		super.add(index2,value);
	}
}

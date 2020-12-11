import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int start){
    super(start);
  }
  public boolean add(T value){
    if (value==null){
      throw new IllegalArgumentException("Value cannot be null");
    }
    return super.add(value);
  }
}

package APComputerScience;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	List<Integer> list = new ArrayList<Integer>();{
	for(int i = 0; i<4; i++)
		list.add(i*i);
	
	Integer intOb = list.get(2);
	int n = list.get(3);
	Integer x = list.set(3, 5);
	x = list.remove(2);
	
	list.add(1,7);
	list.add(2, 8);

}
}


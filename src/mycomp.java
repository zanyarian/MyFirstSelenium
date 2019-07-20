

public class mycomp implements Comparable<mycomp> {
	int item;
	mycomp(int item){
		this.item = item;
	//	System.out.println("rr"+item);
	}

	@Override
	public int compareTo(mycomp o) {
	if(o.item>this.item)
		return 1;
	return -1;
	
	}

}

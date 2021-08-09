package day10_ClassVariable;

import java.util.ArrayList;
import java.util.HashSet;

public class BonusQuiz_method {
	public ArrayList lotto() {
		ArrayList list =new ArrayList();
		for(int i=0;list.size()<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			if(! list.contains(ran))list.add(ran);
		}return list;
	}
	
	public HashSet lotto2() {
		HashSet set= new HashSet();
		for(int i=0;set.size()<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			set.add(ran);
		}return set;
	}

}

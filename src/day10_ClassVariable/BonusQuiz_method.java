package day10_ClassVariable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

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
	public void lotto3() {
		//iterator 사용한 set
		HashSet set= new HashSet();
		for(int i=0;set.size()<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			set.add(ran);
		}
		Iterator it = set.iterator();
		int s = 0;
		System.out.print("iterator 사용: ");
		while(it.hasNext()) {
			s=(int)it.next();
			System.out.print(s+" ");
		}
		
	}
}

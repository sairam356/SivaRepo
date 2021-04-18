package com.corejavaPratice.collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Integer> s = new HashSet();

		s.add(1);
		s.add(5);
		s.add(3);
		s.add(4);

		System.out.println(s);

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(1);
		lhs.add(5);
		lhs.add(3);
		lhs.add(4);
		lhs.add(4);
		lhs.add(null);
		lhs.add(null);

		System.out.println(lhs);

		SortedSet<Integer> ts = new TreeSet();
		ts.add(2);
		ts.add(11);
		System.out.println(ts);
		ts.parallelStream().forEach(x-> System.out.println(x));

		// System.out.println(ts.higher(2));
		List<Integer> l = new ArrayList(ts);

		System.out.println();
		l.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else {

					return 1;
				}

			}

		});
		
		System.out.println(l);
   
		
	}

}

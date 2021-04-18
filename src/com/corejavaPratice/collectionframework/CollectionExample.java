package com.corejavaPratice.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class EmployeeUtil {

	int empId;

	public EmployeeUtil(int empId, int empNo) {
		super();
		this.empId = empId;
		this.empNo = empNo;
	}

	int empNo;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "EmployeeUtil [empId=" + empId + ", empNo=" + empNo + "]";
	}

}

public class CollectionExample {

	public static void testCollectionExample() {

		List<String> l = new ArrayList<>();
		// l.add(1);
		l.add("siva");
		l.add("hyderabad");
		l.add("Kadapa");
		// l.add(12654352.4);

		l.remove(0);
		l.add(0, "siva");
		// l.clear();
		System.out.println(l.contains("siva1"));
		System.out.println(l.get(2));
		System.out.println(l.isEmpty());
		System.out.println(l.lastIndexOf("siva"));

		for (String data : l) {
			System.out.println(data);
		}
		System.out.println(" ####################################");

		l.stream().forEach(x -> System.out.println(x));

		System.out.println(" ####################################");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println(" ####################################");

		Iterator<String> iterator = l.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		System.out.println(" ####################################");

		List<Integer> intObj = new ArrayList<>();
		intObj.add(11);
		intObj.add(2);
		intObj.add(10);

		Collections.sort(intObj);

		System.out.println(intObj);

		intObj.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {

					return 1;
				} else {

					return -1;
				}

			}
		});

		System.out.println(intObj);
		/*
		 * 
		 * 
		 * comparator, consumer, Supplier ,Optional
		 */

		// System.out.println(l);

		List<EmployeeUtil> list = new ArrayList<>();

		list.add(new EmployeeUtil(1, 123));
		list.add(new EmployeeUtil(2, 456));

		list.sort(new Comparator<EmployeeUtil>() {

			@Override
			public int compare(EmployeeUtil o1, EmployeeUtil o2) {
				if (o1.getEmpId() > o2.getEmpId()) {

					return -1;
				} else {

					return 1;
				}

			}
		});

		System.out.println(list.equals(list));

		List sublIst = l.subList(0, 1);
		System.out.println(sublIst);

		System.out.println(list);

	}

	public static void main(String[] args) {
		testCollectionExample();
	}

}

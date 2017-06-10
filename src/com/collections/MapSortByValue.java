package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MapSortByValue {

	//Generic Comparator
	static class ValueComparator<K, V extends Comparable<V>> implements Comparator<K> {

		HashMap<K, V> hmap = new HashMap<K, V>();

		public ValueComparator(HashMap<K, V> map) {
			hmap.putAll(map);
		}

		public int compare(K k1, K k2) {
			return hmap.get(k1).compareTo(hmap.get(k2));
		}

	}

	public static TreeMap<String, Integer> sortByValue(HashMap<String, Integer> hmap) {

		Comparator<String> vc = new ValueComparator<String, Integer>(hmap);

		TreeMap<String, Integer> tm = new TreeMap<>(vc);
		tm.putAll(hmap);

		return tm;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 34);
		map.put("b", 23);
		map.put("c", 15);
		map.put("d", 111);
		System.out.println(map);

		TreeMap<String, Integer> tmap = sortByValue(map);
		System.out.println(tmap);
	}

}

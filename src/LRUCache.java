import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It
 * should support the following operations: get and set.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key
 * exists in the cache, otherwise return -1.
 * 
 * set(key, value) - Set or insert the value if the key is not already present.
 * When the cache reached its capacity, it should invalidate the least recently
 * used item before inserting a new item.
 * 
 * 
 */
public class LRUCache {
	private LinkedHashMap<Integer, Integer> map;

	@SuppressWarnings("serial")
	public LRUCache(final int capacity) {
		map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
			protected boolean removeEldestEntry(Entry<Integer, Integer> eldest) {
				return size() > capacity;
			}
		};
	}

	public int get(int key) {
		Integer value = map.get(key);
		if (value == null) {
			return -1;
		}
		return value;
	}

	public void set(int key, int value) {
		map.put(key, value);
	}

}

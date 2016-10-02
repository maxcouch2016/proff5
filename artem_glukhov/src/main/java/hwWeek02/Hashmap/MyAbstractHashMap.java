package hwWeek02.Hashmap;

public abstract class MyAbstractHashMap <K,V> implements MyMap<K,V> {
	/**
	 * Задача 2. Написать собственную реализацию MyHashMap<K, V>
	 * Реализовать методы MyHashMap:
	 * 1. boolean put(K, V)
	 * 2. User get( K )
	 * 3. int size()
	 * 4. boolean remove(K key)
	 * 5. MyEntry<K, V> entrySet()
	 * <p>
	 * Обеспечить возможность создания MyHashMap с указанием дженериком типов для "ключа" и "значения".
	 * <p>
	 * Наименование класса может звучать так: MyHashMap, при этом нельзя использовать HashMap или HashSet.
	 * Примечание: напоминаю, что карта состоит из массива, элементами которого являются односвязанные списки.
	 * <p>
	 * Для хранения пары значений рекомендую создать класс MyEntry c двумя полями соответсвенно для ключа key и значения value.
	 */
	


	    @Override
	    public boolean isEmpty() {
	        return size() == 0;
	    }
	}


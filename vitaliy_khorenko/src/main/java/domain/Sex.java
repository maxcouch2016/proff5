package domain;

import java.util.HashMap;
import java.util.Map;

public enum Sex {
	 WOMAN(0), MAN(1), UNKNOWN(2);
	
	private int value;
	private static Map<Integer, Object> map = new HashMap<>();
	
	private Sex(int value){
		this.value = value;
	}
	
	static {
       for (Sex sex : Sex.values()) {
           map.put(sex.value, sex);
       }
   }

   public static Sex valueOf(int sex) {
       return (Sex) map.get(sex);
   }

   public int getValue() {
       return value;
   }
}
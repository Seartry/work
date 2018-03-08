package ssm.tena;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Api03 {

	public static void main(String[] args) {
		String str = new String("hello world ! I am here ");
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.substring(2, 5));
		System.out.println(str.replace(" ", ""));
		System.out.println(str.trim());
		System.out.println(str.startsWith("h"));
		System.out.println(str.endsWith("e"));
		System.out.println(str.toUpperCase());
		System.out.println(String.valueOf(str));
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.toString());
		sb.setLength(0);
		System.out.println(sb.toString());
		System.out.println(sb.append("My name is not zhang").toString());
		System.out.println(sb.insert(2, " first").toString());
		System.out.println(sb.delete(17, 21).toString());
		System.out.println(sb.reverse().reverse().toString());
		
		String emailRegEx = "^[a-zA-Z0-9_.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
		String email = "beij.-ing@q.q.comb";
		System.out.println(email.matches(emailRegEx));
		String[] arr = sb.toString().split("\\s");
		for(String a:arr) {
			System.out.println(a+";");
		}
		System.out.println(sb.toString().replaceAll("\\s",";"));
		System.out.println(Arrays.asList(arr).toString());
		Cell c1 = new Cell();
		c1.setCol(1);
		c1.setRow(1);
		Cell c2 = new Cell();
		c2.setCol(1);
		c2.setRow(1);
		System.out.println(c1.toString());
		System.out.println("c1和c2对比结果："+c1.equals(c2));
		Cell c3 = c1;
		System.out.println((c1==c3)+"---"+(c2==c3));
		System.out.println((c1.equals(c3))+"---"+(c2.equals(c3)));
		Number n = new Integer(4);
		Integer m = new Integer(4);
		System.out.println(n.getClass());
		System.out.println(m.getClass());
		System.out.println(Integer.MAX_VALUE);
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.toLocaleString());
		Calendar c = Calendar.getInstance();
		System.out.println(c.toString());
		System.out.println(c);
		List<String> list = Arrays.asList(arr);
		List<String> list2 =  list.subList(0, 3);
		for(String s:list2) {
			System.out.println(s);
		}
		String[] ara = new String[4];
		list2.toArray(ara);
		System.out.println("-----"+ara[1]+"----");
		//队列，一边进队，一边出队
		Queue<String> que = new LinkedList<String>();
		que.offer("a");
		que.offer("b");
		que.offer("c");
		System.out.println(que.poll());
		System.out.println(que.peek());
		System.out.println(que.poll());
		//双端进和出
		Deque<String> deq = new LinkedList<String>();
		Map map = new HashMap();
		map.put("a", 1);
		map.put("b", "B");
		map.put("c", c1);
		System.out.println(map.containsKey("c"));
		Set set = map.keySet();
		for(Object key:set) {
			System.out.println(map.get(key));
		}
		Set<Entry> entrySet = map.entrySet();
		for(Entry e:entrySet) {
			System.out.print(e.getKey());
			System.out.println(e.getValue());
		}
	}
}

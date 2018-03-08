package ssm;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		Integer.toBinaryString(3);
	}
	
	private static void JSONObjectSample() {
		JSONObject xiaoli = new JSONObject();
		Object nullObject = null;
		try {
			xiaoli.put("name", "李小明");
			xiaoli.put("aeg", 36);
			xiaoli.put("birthday", "1990-02-09");
			xiaoli.put("school", "蓝翔");
			xiaoli.put("major", new String[] {"计算机","厨师"});
			xiaoli.put("house", nullObject);
			System.out.println(xiaoli.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void creatJsonByMap() {
		Map<String,Object> xiaoli = new HashMap<String,Object>();
		Object nullObject = null;
		xiaoli.put("name", "李小明");
		xiaoli.put("aeg", 36);
		xiaoli.put("birthday", "1990-02-09");
		xiaoli.put("school", "蓝翔");
		xiaoli.put("major", new String[] {"计算机","厨师"});
		xiaoli.put("house", nullObject);
		System.out.println(xiaoli.toString());
		System.out.println(new JSONObject(xiaoli).toString());
	}
}

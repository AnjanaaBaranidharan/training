package TestCases;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertTest {

	public String getPropValue(final String key){
		Map appProps = new HashMap();
		appProps.put("key1", "value 1");
		appProps.put("key2", "value 2");
		appProps.put("key3", "value 3");
		appProps.put("key4", null);
		return (String) appProps.get(key);
	}
	
	@Test
	public void test(){
		AssertTest msnt = new AssertTest();
		assertNotNull(msnt.getPropValue("key1"));
		assertNotNull(msnt.getPropValue("key3"));
		assertNull(msnt.getPropValue("key4"), null);
		assertNotSame(msnt.getPropValue("key1"), msnt.getPropValue("key2"));
		assertSame(msnt.getPropValue("key1"), msnt.getPropValue("key1"));
	}
}


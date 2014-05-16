package dataStructures;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;

public class TestUserSet {
	
	private String str1 = "1";
	private String str2 = "2";
	private String str3 = "3";
	
	@Test
	public void testAdd() {
		UserSet<String> ual = new UserSet<String>();
		ual.add(str1);
		ual.add(str2);
		ual.add(str3);
		Assert.assertTrue(ual.size() == 3);
		ual.add(str3);
		Assert.assertTrue(ual.size() == 3);
	}
	
	@Test
	public void testClear() {
		UserSet<String> ual = new UserSet<String>();
		ual.add(str1);
		ual.add(str2);
		ual.add(str3);
		Assert.assertTrue(ual.size() == 3);
		ual.clear();
		Assert.assertTrue(ual.size() == 0);
	}
	
	@Test
	public void testContains() {
		UserSet<String> ual = new UserSet<String>();
		ual.add(str1);
		ual.add(str2);
		ual.add(str3);
		Assert.assertTrue(ual.contains(str1));
		Assert.assertTrue(ual.contains(str2));
		Assert.assertTrue(ual.contains(str3));
		Assert.assertFalse(ual.contains("4"));
	}
	
	@Test
	public void testIsEmpty() {
		UserSet<String> ual = new UserSet<String>();
		Assert.assertTrue(ual.isEmpty());
		ual.add(str1);
		Assert.assertFalse(ual.isEmpty());
		ual.clear();
		Assert.assertTrue(ual.isEmpty());
	}
	
	@Test
	public void testRemove() {
		UserSet<String> ual = new UserSet<String>();
		ual.add(str1);
		ual.add(str2);
		ual.add(str3);
		Assert.assertTrue(ual.size() == 3);
		Assert.assertTrue(ual.contains(str3));
		ual.remove(str3);
		Assert.assertTrue(ual.size() == 2);
		Assert.assertFalse(ual.contains(str3));
		ual.remove(str1);
		Assert.assertTrue(ual.size() == 1);
		Assert.assertFalse(ual.contains(str1));
		Assert.assertTrue(ual.contains(str2));
	}
	
	@Test
	public void testSize() {
		UserSet<String> ual = new UserSet<String>();
		Assert.assertTrue(ual.size() == 0);		
		ual.add(str1);
		Assert.assertTrue(ual.size() == 1);		
		ual.add(str2);
		Assert.assertTrue(ual.size() == 2);	
		ual.add(str3);
		Assert.assertTrue(ual.size() == 3);
		ual.add(str3);
		Assert.assertTrue(ual.size() == 3);
		ual.clear();
		Assert.assertTrue(ual.size() == 0);		
	}
}

package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateTest {

	@Test
	//junit testing
	public void testDuplicate() {
	SkillTest1 test = new SkillTest1();
	String result = test.dupliRemove("Mississippi");
	assertEquals("Misp",result);
	}

}

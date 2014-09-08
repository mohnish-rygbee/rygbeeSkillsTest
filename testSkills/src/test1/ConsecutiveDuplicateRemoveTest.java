package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsecutiveDuplicateRemoveTest {

	@Test
	public void testConsecutiveDuplicateRemove() {
		SkillTest1 test = new SkillTest1();
		String result = test.consecutiveDuplicateRemove("Mississippi");
		assertEquals("Misisipi",result);
	}

}

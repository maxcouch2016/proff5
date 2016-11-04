package action14;

import static org.junit.Assert.fail;

import java.util.Map;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import action14.task01.Human;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "task01.xml" })

public class MyCompanyTest {

	@Autowired
	Map<String, Human> humanMap;

	@Test
	public void testGetHuman() {
		Human boss = humanMap.get("boss");
			
		String resFact = boss.getName();
		String resTest = "BOSS";
		if(!resTest.equals(resFact)){
			fail("Trouble!");
		}

	}
	
	

}
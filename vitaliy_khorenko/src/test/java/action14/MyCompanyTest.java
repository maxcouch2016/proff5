package action14;

import static org.junit.Assert.fail;

import java.util.Map;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import action14.task01.Company;
import action14.task01.Human;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "task01.xml" })

public class MyCompanyTest {

	private static final Logger logger = LogManager.getLogger(MyCompanyTest.class.getName());

	@Autowired
	Map<String, Human> humanMap;

	@Autowired
	Map<String, Company> companyMap;

	@Test
	public void testGetHuman() {
		Human boss = humanMap.get("boss");

		String resFact = boss.getName();
		String resTest = "BOSS";
		if (!resTest.equals(resFact)) {
			fail("Trouble!");
		}
		logger.info(boss);

	}

	@Test
	public void testGetCompany() {
		Company company = companyMap.get("myCompany");

		String resFact = company.getName();
		String resTest = "MyCompany";
		if (!resTest.equals(resFact)) {
			fail("Trouble!");
		}
		logger.info(company);
	}

}
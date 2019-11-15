package www.baps.org.satsangexam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
private final Logger logger = LoggerFactory.getLogger(AppTest.class);

@Test()
public void testEmailGenerator() {

	logger.info("https://www.baps.org/SatsangExam/Studymaterials.aspx");
	Assert.assertEquals(true, 5==5);
}
}
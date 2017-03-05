package nitro.com;

import nitro.com.DAO.StudentDao;
import nitro.com.Entity.Student;
import nitro.com.Entity.StudentDetail;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private static  final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Autowired
	StudentDao studentDao;

	@Before
	@Rollback(false)

	public void setUp(){
		Student and = new Student("Andrey", "First");
		and.addDetail(new StudentDetail("KO 654234574436"));
		Student ser=new Student("Sergey", "Second");
		ser.addDetail((new StudentDetail("KO 784344351")));
		studentDao.save(Arrays.asList(and,ser));



	}
	@Test
	public void testCounts() {
	logger.info("***********");
	logger.info("count ---"+studentDao.count());
	logger.info("*******************************");

	}

}

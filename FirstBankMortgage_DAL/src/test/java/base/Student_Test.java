package base;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.RateDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetRate() {

				
				//Test that the returned rates are correct
				assertTrue(RateDAL.getRate(615) == 5);
				assertTrue(RateDAL.getRate(675) == 4.5);
				assertTrue(RateDAL.getRate(731) == 4);
				assertTrue(RateDAL.getRate(760) == 3.75);
				assertTrue(RateDAL.getRate(815) == 3.5);
				
				assertEquals(5.0, RateDAL.getRate(600), 0);
				assertEquals(4.5, RateDAL.getRate(650), 0);
				assertEquals(4.0, RateDAL.getRate(700), 0);
				assertEquals(3.75, RateDAL.getRate(750), 0);
				assertEquals(3.5, RateDAL.getRate(800), 0);
				
				assertEquals(5.0, RateDAL.getRate(625), 0);
				assertEquals(4.5, RateDAL.getRate(655), 0);
				assertEquals(4.0, RateDAL.getRate(735), 0);
				assertEquals(3.75, RateDAL.getRate(780), 0);
				assertEquals(3.5, RateDAL.getRate(806), 0);
				
		
	}

}

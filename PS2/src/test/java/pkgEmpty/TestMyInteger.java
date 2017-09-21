package pkgEmpty;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import MyInteger.MyInteger;
public class TestMyInteger {
	MyInteger myInteger1 = new MyInteger(1);
	MyInteger myInteger2 = new MyInteger(2);
	MyInteger myInteger3 = new MyInteger(3);
	MyInteger myInteger4 = new MyInteger(4);
	MyInteger myInteger5 = new MyInteger(5);
	MyInteger myInteger6 = new MyInteger(6);
	MyInteger myInteger7 = new MyInteger(7);
	MyInteger myInteger8 = new MyInteger(8);
	MyInteger myInteger9 = new MyInteger(9);
	
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
	public void TestPrime() {

		assertFalse(myInteger1.isPrime());
		assertFalse(myInteger2.isPrime());
		assertTrue(myInteger3.isPrime());
		assertFalse(myInteger4.isPrime());
		assertTrue(myInteger5.isPrime());
		assertFalse(myInteger6.isPrime());
		assertTrue(myInteger7.isPrime());
		assertFalse(myInteger8.isPrime());
		assertFalse(myInteger9.isPrime());
	}
	@Test
	public void TestEven() {
		assertFalse(myInteger5.isEven());
		assertTrue(myInteger6.isEven());
		assertFalse(myInteger7.isEven());
		assertTrue(myInteger8.isEven());
	}
	@Test
	public void TestOdd() {
		assertTrue(myInteger5.isEven());
		assertFalse(myInteger6.isEven());
		assertTrue(myInteger7.isEven());
		assertFalse(myInteger8.isEven());
	}
	@Test
	public void TestValue() {
		assertEquals(myInteger2.getiValue(),2);
	}
	@Test
	public void TestEvenInt() {
		assertTrue(MyInteger.isEven(20));
		assertFalse(MyInteger.isEven(21));
	}
	@Test
	public void TestOddInt() {
		assertTrue(MyInteger.isOdd(21));
		assertFalse(MyInteger.isOdd(20));
	}
	@Test
	public void TestPrimeInt() {

		assertTrue(MyInteger.isPrime(71));
		assertFalse(MyInteger.isPrime(72));
		assertTrue(MyInteger.isPrime(73));
		assertFalse(MyInteger.isPrime(75));
		assertTrue(MyInteger.isPrime(79));
		assertFalse(MyInteger.isPrime(0));
	}
	@Test
	public void TestPrimeObj() {
		assertFalse(MyInteger.isPrime(myInteger1));
		assertTrue(MyInteger.isPrime(myInteger3));
		assertFalse(MyInteger.isPrime(myInteger4));
		assertFalse(MyInteger.isPrime(myInteger6));
		assertTrue(MyInteger.isPrime(myInteger7));
	}
	@Test
	public void TestEvenObj() {
		assertFalse(MyInteger.isEven(myInteger5));
		assertTrue(MyInteger.isEven(myInteger6));
	}
	@Test
	public void TestOddObj() {
		assertFalse(MyInteger.isOdd(myInteger2));
		assertTrue(MyInteger.isOdd(myInteger3));
	}
	@Test
	public void TestEqualsInt() {
		assertTrue(myInteger6.isEquals(6));
		assertFalse(myInteger7.isEquals(100));
		assertTrue(myInteger8.isEquals(8));
		assertFalse(myInteger9.isEquals(200));
	}
	@Test
	public void TestisEqualsObj() {
		MyInteger myInteger6copy=new MyInteger(myInteger6.getiValue());
		MyInteger myInteger8copy=new MyInteger(myInteger8.getiValue());
		assertTrue(myInteger6.isEquals(myInteger6copy));
		assertFalse(myInteger7.isEquals(myInteger1));
		assertTrue(myInteger8.isEquals(myInteger8copy));
		assertFalse(myInteger9.isEquals(myInteger2));
	}
}

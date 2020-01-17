
public class Test_NG_annotations {

	@Test
	public void aTestCase() 
	{
		System.out.println("aTest case");
	}
	@Test
	public void cTestCase() 
	{
		System.out.println("c Test case");
	}
	@Test
	public void bTestCase() 
	{
		System.out.println(" b Test case");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method");
	}
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("before test");
	}
	@BeforeTest
	public void AfterTest() 
	{
		System.out.println("after test");
	}
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("before class");
	}
	@After1class
	public void afterclass() 
	{
		System.out.println("after class");
	}
	
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("after suite");
	}
}

# Selenium Concepts:

Open Source automation fucntional testing tool

We can test web applicatiosn and ios mobile apllications (By adding some framework and files)

whey are we using selenium over other tools?

open source 

It supports 10 languages like JAVA,Ruby,PHP,C#,Python etc.

Cross browsing testing(Chrome, IE ,FireFox)

Reduces the workload and time by enabliling CI and CT


Types of Selenium

1)Selenium IDE

new to selenium,It has record and playback functionality (Reusability of code),if the project is not complex,then you can use it,If you need the scripts to be created quickly,Cross browser testing is not required,Genrally we are using  it as prototyping toll

2) Selenium WebDriver

   It si API based soulutin and it is a set of liabraies for automation

   Cross browsing test can be performed

   complex functionalities and we can make use of 10 lanaguages for preparing testing scritpts

   It can be used to autoamate any browser actions with drivers

   It can be used to interact with almost all the web elements.
   Test Scripts maintenance is easy
   
3) Selenium Grid
   We can run multiple test in parallel on multiple machines
   Reducres the execution time(Docker will implement)
   
4) Selenium RC(Remote Control):

    Testing is handled by the remote control
   
Framework used for selenium webdriver:
In different lanuages , you have different frameworks available to implment selenium webdriver for Nunit for C# ,PyUnit int python etc.
Here we will be working with JAVA , so frameworks used are 
1)Junit(Unit testing frameworks)
2)TestNG
JUNIT Framework:
Junit is unit testing framework
It's providing some annotations.Descriptiong is mentioned below.

1)@Test : This annotation is telling the Junit framework is the method under this will be considered as actual test method , which will test the functionality of the appliaction.

2)@Before Class: This annotation is telling the Junit framework is the method under this will be considered as setup method,which is
will be used to set the preconditions required for testing the actual functionality of the applicaiton

Method under this annotation will be executed before all test mehtod present in the class.

3)@AfterClass:Thid annotation is telling the Junit framework is the method under this will be considered as tearDown method, which will be used to set the postconditions or releasing the preconditions required for testing the actual functionality of the application.
Method under this annotation will be executed after all test mehtod present in the class.
4)@Before:This annotation is telling the Junit framework is the emthod under thsi will be cosidered as setup emhtod which will be used 
•	Method under this annotation will be executed before each test methods present in the class.
5.	@After: This annotation is telling the Junit framework is the method under this will be considered as tearDown method, which will be used to set the postconditions or releasing the preconditions required for testing the actual functionality of the application.
•	Method under this annotation will be executed after each test methods present in the class.

Order of execution of test method --> It will be random.
If one test method is there  BC->B->Test1->A->AC
If two or more test methods are there  BC->B->Test1->A->B->Test2->A->AC or BC->B->Test2->A->B->Test1->A->AC

   
WebDriver interface Methods:

1)get("") ->Opens the URl of AUT
2)navigate() ->
   a.refresh()->closes the currebt tab in browser
   b.back()
   c.forward()
   d.to()
3)close()closes the currebt tab in browser
4)quiet() closes the all tabs in browser
5)getCurrentUrl() ->returns url of the current web page
6)getTitle() ->returns tiltle of the current web page
7)getPageSource()->It will get the page source of the current page

•	findElement() finds the element on the web page
•	for stopping the execution for some time you can make use of Thread.sleep() method.

-------------------------------------------------------------------
Locators 

Locators are the identifiers which identify or locate the web elements uniquely on the web page.

•	ID  It is unique for every WebElement.

•	Name  It is unique for a particular type of element
.
•	LinkText  This is used for purely locating anchor elements. It looks for exact match.

•	PartialLinkText  This is used for purely locating anchor elements. It looks for partial match. 

•	className This locator is used to locate the element on the web page for which the attribute class is available.

•	tagName Tag Name locator is used to find the elements matching the specified Tag Name. It is very helpful when we want to extract the content within a Tag.

•	cssSelector  This is done by combination of attributes

	TagName and ID  TagName#ValueOfID
Example: driver.findElement(By.cssSelector("input#body_txtUserID"))

	TagName and ClassName  TagName.classname
       Example: driver.findElement(By.cssSelector("input.buttonStyle"))

	TagName and Any attribute  TagName[attribute=valueOfAttribute]
       Example: driver.findElement(By.cssSelector("input[type=password]"))

	TagName, class and attribute  TagName.class[attribute=valueOfAttribute]
       Example: driver.findElement(By.cssSelector("input.buttonStyle[value=Login]"))

•	XPath  This is like a path of a given element from a root tag.

	Absolute(Full Xpath)  This won’t be change--Fixed

	Relative  This will change person by person

	Custom   This will change person by person,

--------------------------------------------------------------------------
 element used for click():
 
 1.Anchor element:click()
 2.Button :click()
 3.checkbox:click()
 4.radio button:click()
 
 sendkeys:
 5.input boxes:sendkeys()
 6.input file :sendkeys()
 gettingtext
 7.text message :getText()
# Locators 
Locators are the identifiers which identify or locate the web elements uniquely on the web page.

•	ID  It is unique for every WebElement.
•	Name  It is unique for a particular type of element.
•	LinkText  This is used for purely locating anchor elements. It looks for exact match.
•	PartialLinkText  This is used for purely locating anchor elements. It looks for partial match. 
•	className This locator is used to locate the element on the web page for which the attribute class is available.
•	tagName Tag Name locator is used to find the elements matching the specified Tag Name. It is very helpful when we want to extract the content within a Tag.
•	cssSelector  This is done by combination of attributes
	TagName and ID  TagName#ValueOfID
Example: driver.findElement(By.cssSelector("input#body_txtUserID"))
	TagName and ClassName  TagName.classname
       Example: driver.findElement(By.cssSelector("input.buttonStyle"))
	TagName and Any attribute  TagName[attribute=valueOfAttribute]
       Example: driver.findElement(By.cssSelector("input[type=password]"))
	TagName, class and attribute  TagName.class[attribute=valueOfAttribute]
       Example: driver.findElement(By.cssSelector("input.buttonStyle[value=Login]"))
•	XPath  This is like a path of a given element from a root tag.
	Absolute(Full Xpath)  This won’t be change--Fixed
	Relative  This will change person by person
	Custom   This will change person by person,

# WebElement 
1.	Input Boxes (Text box)  sendkeys()
2.	Anchor Elements (Links)  click()
3.	Button  click()
4.	Drop downs  Using object of Select class  
•	selectByIndex(1) 
•	selectByValue(“1”) 
•	selectByVisibleText(“Credit Card”)
5.	Check box  click()
6.	Radio button  click()
7.	Input file  sendKeys(image path)
8.	Text Message  getText()

9.	WebTable  It is a webElement in HTML page embedded with table tag. (driver.findelement())
•	Rows  tr tag. (table.findelements())
	Headers  th tag. (table.findelements())
	Data td tag. (row.findelements())

10.	 Frame  It is a WebElement in HTML page embedded with frame tag. 
   http://10.82.181.42/Automation/DemoApps-Playgroundversion/FrameExample.html

11.	MouseHover  It is a WebElement. To access it we need to hover over it.
•	Object of Actions class is required.

12.	Draggable and Droppable WebElements  These elements are handled by Actions class.
http://10.82.181.42/Automation/DemoApps-Playgroundversion/Drag'N'Drop.html

13.	Dynamic Web elements

PopUps  It is a new window open to give some information or to get the confirmation.
http://10.82.181.42/Automation/DemoApps-Playgroundversion/PopupBox.html
•	Alert  It will have only one option. (accept())
•	Confirmation  Here we have two options. (accept(), dismiss())
•	Prompt  Here we have to enter some text value and accept or reject it. (sendKeys(), accept(), dismiss())

# WebElements Methods:

![image](https://github.com/user-attachments/assets/4d38aad4-5c40-44e3-bb65-14c02914c615)

# Wait strategies 
1.	Implicit wait
•	You can make the execution wait for maximum fixed time if any exception occurs during execution.
•	Suppose we give implicit wait of 10 seconds and element is loaded on the page within 2 seconds, it will ignore remaining 10 seconds. That’s why it known as dynamic wait.
•	It is applicable globally means for all the web elements.
•	It’s not applicable for dropdowns and dynamic web elements

2.	Explicit wait
•	This strategy is handled by WebDriverWait  class.
•	You can make the execution wait for maximum fixed time if any exception occurs during execution.
•	It is application on the particular element only.    

     
# Assertions
Assertion is a criteria to decide whether a test is passed or not. It Is handled by Assert class.

1. Hard Assert
•	Controlled by Assert class.
•	It will stop the execution wherever test case failed.
•	It is available in Junit and TestNG both frameworks.

2. Soft Assert
•	Controlled by object of SoftAssert class.
•	It will not stop the execution until the execution of assertAll() method.
•	It is available in TestNG only.

Assertion Methods
1.	assertEqual(expMsg, actMsg)  It will check for exact match in both the strings
2.	assertTrue(condition)  If condition is true then it will say true else false
3.	assertFalse(condition)  If condition is false then it will say true else false
4.	assertNotNull(variable)
5.	assertNull(variable)

Wait strategies 
1.	Implicit wait
•	You can make the execution wait for maximum fixed time if any exception occurs during execution.
•	Suppose we give implicit wait of 10 seconds and element is loaded on the page within 2 seconds, it will ignore remaining 10 seconds. That’s why it known as dynamic wait.
•	It is applicable globally means for all the web elements.
•	It’s not applicable for dropdowns and dynamic web elements

2.	Explicit wait
•	This strategy is handled by WebDriverWait  class.
•	You can make the execution wait for maximum fixed time if any exception occurs during execution.
•	It is application on the particular element only.       
Assertions
Assertion is a criteria to decide whether a test is passed or not. It Is handled by Assert class.

1. Hard Assert
•	Controlled by Assert class.
•	It will stop the execution wherever test case failed.
•	It is available in Junit and TestNG both frameworks.

2. Soft Assert
•	Controlled by object of SoftAssert class.
•	It will not stop the execution until the execution of assertAll() method.
•	It is available in TestNG only.

Assertion Methods
1.	assertEqual(expMsg, actMsg)  It will check for exact match in both the strings
2.	assertTrue(condition)  If condition is true then it will say true else false
3.	assertFalse(condition)  If condition is false then it will say true else false
4.	assertNotNull(variable)
5.	assertNull(variable)


Window Handling
When multiple windows are open, to switch to the required window.
•	getWindowHandles() method is used for getting the control over all the tabs(windows).


Parameterization:
A technique of providing one or more data to test method.

1.	Excel parameterization  
•	It’s a technique to read(Input) and write(Output) the data from excel. 
•	To access this, we are making use of POI jars(Apache POI is a popular API that allows programmers to create, modify, and display MS Office files using Java programs).
•	.xls and .xlsx
•	FileInputStream  For reading the data from excel
•	FileOutputStream  For writing the data in excel
•	We will discuss .xslx file in our syllabus.
	Workbook  XSSFWorkbook
	Sheet  XSSFSheet
	Row  XSSFRow
	Cell  XSSFCell
	workbook.write(fos);
	fos.close();
	fis.close();

Screenshot:
TakesScreenshot ts = (TakesScreenshot) driver;                                            // Allowing the driver to take screenshot
File source = ts.getScreenshotAs(OutputType.FILE);                                    //It Will take the screenshot as FILE output
File destination = new File("C:\\Users\\pradeep.sen\\Music\\SeleniumResources_ScG\\Screenshot\\User.PNG");
FileUtils.copyFile(source, destination);
_____________________________________________________________________________________________

Junit Suite:
To run multiple Junit classes in the desired order.
@RunWith(Suite.class)                                                                                               //To run suite class
@SuiteClasses({FramesDemo.class, Screenshot.class, PopUpsDemo.class})  //Putting multiple classes into desired order to execute
public class JUnitTestSuite {}                                                                                    //The class will be considered as suite class


----------------------------------
TestNG Framework

TestNg Framework  It is an extended version of Junit Framework with some advanced features. 

Features:
1.	To produce reports.
2.	Advanced annotations
3.	Order of execution can be controlled
4.	Parameterization can also be done by inbuilt annotations
5.	Parallel execution( Not there in the syllabus )

TestNg Annotations:
![image](https://github.com/user-attachments/assets/0c707e5c-498f-4717-9b84-a82e29191cd4)

TestNG Attributes:
To add more flexibility and customization to the execution flow of test methods, you have attributes of @Test annotation. Let us discuss few of those attributes.
![image](https://github.com/user-attachments/assets/8d7f2cf3-6f2b-4b69-be1f-8fdb179219c0)

Parameterization 
A technique of providing the data to test method.

Ways 
1.	Data Provider  It is providing the data from object method (Array) to test method.
•	It is using @DataProvider annotation.
•	It is using dataProvider TestNG attribute.

2.	Xml parameterization 
•	To perform cross browsing testing.
•	To pass parameters from xml file to test methods.
For example:
<parameter name = "browserPath" value = "D:\\IVS_FILES\\ChromeDriver111\\chromedriver.exe"></parameter>
<parameter name = "url" value = "http://10.82.180.36/Common/Login.aspx"></parameter>
•	Always run the xml file as TestNG suite to execute respective test class.
3.	Excel parameterization 
Already discussed in Junit framework.


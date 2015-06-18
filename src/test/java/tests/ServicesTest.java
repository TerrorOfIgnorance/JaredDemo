package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import testsLogic.ServicesLogic;
import utils.Drivers;
import utils.commUtil;

public class ServicesTest {

	pageObjects.Services services = PageFactory.initElements(Drivers.driver,
			pageObjects.Services.class);
	static DesiredCapabilities capability = new DesiredCapabilities();
	private static WebDriver driver;

	@BeforeClass
	public static void beforeClass() throws MalformedURLException {

		// Drivers.driver = Drivers.browser("chrome");
		// commUtil.launchBrowser("http://demoqa.com/");

//		Drivers.driver = Drivers.browser("firefox");
//		commUtil.launchBrowser("http://demoqa.com/");
//		Drivers.driver.manage().window().maximize();

		Drivers.driver = Drivers.browser("internetExplorer");
		
//	    commUtil.launchBrowser("http://demoqa.com/");
	}
	/*
	@BeforeClass
	public static void setUp() throws Exception {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "Android");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("platformVersion", "4.4.4"); 
	  capabilities.setCapability("browserName", "Chrome");
	  driver = new RemoteWebDriver(
	           new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
	}
	
	@Before
	public void getSite(){
		Drivers.driver.get("http://demoqa.com/services/");
	}*/
	
/*	@After
	public void tearDown() throws Exception {
		driver.quit();
	}*/

	@Test
	public void testAboutUsPageTitle() {
		Drivers.driver.get("http://demoqa.com/services/");
		ServicesLogic.validateServicesPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		Drivers.driver.get("http://demoqa.com/services/");
		assertTrue(ServicesLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(ServicesLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(ServicesLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(ServicesLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(ServicesLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(ServicesLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(ServicesLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(ServicesLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(ServicesLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(ServicesLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(ServicesLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(ServicesLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(ServicesLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(ServicesLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(ServicesLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(ServicesLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(ServicesLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(ServicesLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(ServicesLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		ServicesLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		ServicesLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		ServicesLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		ServicesLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		ServicesLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		ServicesLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		ServicesLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		ServicesLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		ServicesLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		ServicesLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		ServicesLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		ServicesLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		ServicesLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		ServicesLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		ServicesLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		ServicesLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		ServicesLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		ServicesLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		ServicesLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		ServicesLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		ServicesLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		ServicesLogic.redirectToGeneratorLink();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(ServicesLogic.aboutUsFooterIsDisplayed());
	}

	@Test
	public void aboutUsHeadingIsDisplayed() {
		assertTrue(ServicesLogic.servicesHeadingIsDisplayed());
	}

	@Test
	public void aboutUsParagraphIsDisplayed() {
		assertTrue(ServicesLogic.servicesParagraphIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}

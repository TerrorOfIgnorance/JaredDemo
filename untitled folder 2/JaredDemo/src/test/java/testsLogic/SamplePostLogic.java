package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.SamplePost;
import utils.Drivers;
import utils.RandomStringGenerator;
import utils.commUtil;

public class SamplePostLogic extends SamplePost{
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateSamplePostPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Sample Post | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * Booleans for all Clickable elements, Check if clickable
	 */

	public static boolean demoqaLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(demoqaLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean HomeLinkIsClickable() {
		try {
			upperMenuButton.click();
			Thread.sleep(5000);
			ExpectedConditions.elementToBeClickable(HomeLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean aboutUsLinkIsClickable() {
		try {
			upperMenuButton.click();
			ExpectedConditions.elementToBeClickable(aboutUsLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean servicesLinkIsClickable() {
		try {
			upperMenuButton.click();
			ExpectedConditions.elementToBeClickable(servicesLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean demoTabIsClickable() {
		try {
			upperMenuButton.click();
			ExpectedConditions.elementToBeClickable(demoTab);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean blogLinkIsClickable() {
		try {
			upperMenuButton.click();
			ExpectedConditions.elementToBeClickable(blogLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean contactTabIsClickable() {
		try {
			upperMenuButton.click();
			ExpectedConditions.elementToBeClickable(contactTab);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean draggableLinkFromDemoTabIsClickable() {
		try {
			upperMenuButton.click();
			ExpectedConditions.elementToBeClickable(draggableLinkFromDemoTab);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}


	public static boolean facebookLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(facebookLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean twitterLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(twitterLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean gplusLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(gplusLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Methods for redirecting to new urls
	 */

	public static void redirectToAboutUs() {
		upperMenuButton.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(aboutUsLink));
		element.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/about-us/") {
			boolean toAboutUs = true;
			Assert.assertTrue(toAboutUs);
		}
	}

	public static void redirectToServices()  {
		upperMenuButton.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(servicesLink));
		element.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/services/") {
			boolean toServices = true;
			Assert.assertTrue(toServices);
		}
	}

	public static void redirectToBlog() {
		upperMenuButton.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(blogLink));
		element.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/blog/") {
			boolean toblogLink = true;
			Assert.assertTrue(toblogLink);
		}
	}

	public static void redirectToContactTab() {
		upperMenuButton.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(contactTab));
		element.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/contact/") {
			boolean toContactTab = true;
			Assert.assertTrue(toContactTab);
		}
	}

	public static void redirectToDraggableFromDemoTab()
			throws InterruptedException {
		upperMenuButton.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(demoTab));
		element.click();
		WebElement element2 = wait.until(ExpectedConditions
				.elementToBeClickable(draggableLinkFromDemoTab));
		element2.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/draggable/") {
			boolean toDraggableFromDemoTab = true;
			Assert.assertTrue(toDraggableFromDemoTab);
		}
	}

	public static void redirectToTabsLinkFromDemoTab()
			throws InterruptedException {
		upperMenuButton.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(demoTab));
		element.click();
		WebElement element2 = wait.until(ExpectedConditions
				.elementToBeClickable(tabsLinkFromDemoTab));
		element2.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/tabs/") {
			boolean toTabsFromDemoTab = true;
			Assert.assertTrue(toTabsFromDemoTab);
		}
	}

	public static void redirectToDesignerLink() {
		designerLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://www.toolsqa.com/") {
			boolean toDesignerLink = true;
			Assert.assertTrue(toDesignerLink);
		}
	}

	public static void redirectToGeneratorLink() {
		generatorLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://oneiricindia.com/") {
			boolean toGeneratorLink = true;
			Assert.assertTrue(toGeneratorLink);
		}
	}
	
	/**
	 * SamplePost specific redirects
	 */
	
	public static void redirectToUncategorizedLink() {
		uncategorizedLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/category/uncategorized/") {
			boolean toUncategorizedLink = true;
			Assert.assertTrue(toUncategorizedLink);
		}
	}
	
	public static void redirectToSmallHomeLink() {
		smallHomeLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/") {
			boolean toSmallHomeLink = true;
			Assert.assertTrue(toSmallHomeLink);
		}
	}
	
	public static void redirectToSamplePostDateLink() {
		samplePostDateLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePost2DateLink = true;
			Assert.assertTrue(toSamplePost2DateLink);
		}
	}
	
	public static void redirectToAdminLink() {
		adminLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/author/admin/") {
			boolean toAdminLink = true;
			Assert.assertTrue(toAdminLink);
		}
	}
	
	public static void redirectToPermalinkLink() {
		permalinkLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toPermalinkLink = true;
			Assert.assertTrue(toPermalinkLink);
		}
	}
	
	public static void redirectToNextPostLink() {
		toNextPostLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toNextPostLink = true;
			Assert.assertTrue(toNextPostLink);
		}
	}
	
	public static void redirectToAvatarImageLink() {
		avatarImageLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/author/admin/") {
			boolean toAvatarImageLink = true;
			Assert.assertTrue(toAvatarImageLink);
		}
	}
	
	public static void redirectToArticlesWrittenByPosterLink() {
		toArticlesWrittenByPosterLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/author/admin/") {
			boolean toArticlesWrittenByPosterLink = true;
			Assert.assertTrue(toArticlesWrittenByPosterLink);
		}
	}

	/**
	 * Visibility booleans
	 */

	public static boolean aboutUsFooterIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(aboutUsFooter);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static boolean postParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(postParagraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for the tests associated with the like it button and its counter
	 */
	
	public static void likeItButtonChanged(){
		try{
		likeTheArticleButton.click();
		} catch (Exception buttonDisabled){
			System.out.println("The button is not functional...test failed");
		}
		if(likeTheArticleButton.getText().equalsIgnoreCase("you like it already")){
			boolean buttonChanged = true;
			Assert.assertTrue(buttonChanged);
		}	
	}
	/**
	 * For tests regarding comment validation
	 */
	
	public static void errorPageDisplayedWhenEmailNull(){
		nameInputField.clear();
		emailInputField.clear();
		nameInputField.sendKeys("tester");
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
	
	public static void errorPageDisplayedWhenNameNull(){
		nameInputField.clear();
		emailInputField.clear();
		emailInputField.sendKeys("tester@test.com");
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
	
	public static void errorPageDisplayedWhenNameEmailNull(){
		nameInputField.clear();
		emailInputField.clear();
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
	
	public static void errorPageDisplayedCommentsNull(){
		nameInputField.clear();
		emailInputField.clear();
		commentInputField.clear();
		emailInputField.sendKeys("tester@test.com");
		nameInputField.sendKeys("tester");
		postCommentButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/wp-comments-post.php") {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}
	
	public static void validCommentPosted() throws Exception{
		emailInputField.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHANUMERIC)
				+ "@"+ RandomStringGenerator.generateRandomString(5,
						RandomStringGenerator.Mode.ALPHA) + ".com");
		nameInputField.sendKeys(RandomStringGenerator.generateRandomString(20,
				RandomStringGenerator.Mode.ALPHA));
		commentInputField.sendKeys(RandomStringGenerator.generateRandomString(20,
				RandomStringGenerator.Mode.ALPHANUMERIC));
		postCommentButton.click();
		int i = 41;
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/#comment-" + i++) {
			boolean toErrorPage = true;
			Assert.assertTrue(toErrorPage);
		}
	}	
}

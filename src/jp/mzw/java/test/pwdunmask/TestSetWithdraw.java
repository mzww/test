package jp.mzw.java.test.pwdunmask;


import static org.junit.Assert.*;
import jp.mzw.java.test.TestBase;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

public class TestSetWithdraw extends TestBase {

	protected String url = "http://localhost/yuta/research/example/pwdunmask/1.withdraw/withdraw.php?paper_id=179";
	
	@Test
	public void testSubmit() {
		driver.get(url);
		driver.findElement(By.id("pwd")).sendKeys("top_conf");
		driver.findElement(By.id("withdraw")).click();
		
		assertEquals("Your paper was successfully withdrawed.",
					driver.findElement(By.id("result")).getText());
		
		driver.quit();
	}
	
}
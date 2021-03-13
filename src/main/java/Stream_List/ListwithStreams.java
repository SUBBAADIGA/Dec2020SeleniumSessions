package Stream_List;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListwithStreams {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//Sequentil Stream
		
//	//	linklist.stream().forEach(ele->System.out.println(ele.getText()));
//		long StartTime = System.currentTimeMillis();
//		List<String> AmazonList = linklist.stream()
//		           .filter(ele->!ele.getText().isEmpty())
//		           .filter(ele->ele.getText().contains("Amazon"))
//		           .map(ele->ele.getText())
//		           .collect(Collectors.toList());
//		
//		AmazonList.stream().forEach(ele->System.out.println(ele));
//		long EndTime = System.currentTimeMillis();
//		System.out.println(StartTime-EndTime);//-6356
		
		
		//Parallel Stream
		
	//	linklist.stream().forEach(ele->System.out.println(ele.getText()));
		long StartTime = System.currentTimeMillis();
		List<String> AmazonList = linklist.parallelStream()
		           .filter(ele->!ele.getText().isEmpty())
		           .filter(ele->ele.getText().contains("Amazon"))
		           .map(ele->ele.getText())
		           .collect(Collectors.toList());
		
		AmazonList.parallelStream().forEach(ele->System.out.println(ele));
		long EndTime = System.currentTimeMillis();
		System.out.println(StartTime-EndTime);//-5813

	}
	

}

package SeleniumSessions;

public class AmazonLaunch {

	public static void main(String[] args) {
		
		BrowserUtils br=new BrowserUtils();
		
		br.launchBrowser("Opera");
		
		br.launchUrl("https://www.amazon.in/");
		
		String title = br.getPageTitle();
		System.out.println(title);
		
		br.closeBrowse();
	

	}

}

package JenkinsEBook.DemoMavenProject;

import org.testng.annotations.Test;

public class WebSiteTests {
	
	//testing git

	   @Test
	    public void testSite1()
	    {
		WebSite site = new WebSite("english",false);
	    }

	   @Test
	    public void testSite2()
	    {

		WebSite site = new WebSite("english",false);
	                site.start();
		
	    }


	  @Test
	  public void testSite3()
	    {

		WebSite site = new WebSite("english",false);
	                site.start();
	                site.stop();
		}

	  @Test
	   public void testSite4()
	    {

		WebSite site = new WebSite("english",false);
	                site.start();
		site.makePublic();
		}
	}


package JenkinsEBook.DemoMavenProject;

public class WebSite {
	
	//testing git--again

private Boolean isStarted = false;
private String language;
private Boolean isPublic = false;

public WebSite(String language, Boolean isPublic)
{
     this.language = language;
     this.isPublic = isPublic;
}

public void start() {
   this.isStarted = true;
}

public void stop() {
  this.isStarted = false;
}

public void makePublic() {
this.isPublic = true;

}

public void makePrivate() {
this.isPublic = false;
}

public String language() {
    return this.language;
}

public Boolean isStarted() {
  return this.isStarted;

}

public Boolean isPublic() {
   return this.isPublic;
}
}
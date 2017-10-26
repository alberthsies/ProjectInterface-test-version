package com.example.bot.spring;

public class ProjectMasterController {
	
	public ProjectBookController book = new ProjectBookController();
	public ProjectSearchController search = new ProjectSearchController();
	public ProjectEnqController enq = new ProjectEnqController();
	public ProjectFAQHandler faq = new ProjectFAQHandler();
	
	public ProjectMasterController() {} 
	
	
}

package com.itcrowd;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class SampleListener implements HttpSessionListener {
	
	public void sessionDestroyed(HttpSessionEvent sesja) {
		
		System.out.println("Sesja skasowana");
	}
	
public void sessionCreated(HttpSessionEvent sesja) {
		
		System.out.println("Sesja utworzona " + sesja.getSession().getId());
	}

}

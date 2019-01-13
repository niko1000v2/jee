package com.itcrowd;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent requestListener) {
		System.out.println("Request usunięty");
	}

	public void requestInitialized(ServletRequestEvent requestListener) {
		System.out.println("Request zainicjowany");
	}

}

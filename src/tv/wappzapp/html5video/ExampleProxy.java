/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package tv.wappzapp.html5video;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiC;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.util.TiConvert;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiCompositeLayout.LayoutArrangement;
import org.appcelerator.titanium.view.TiUIView;
import org.itri.html5webview.*;

import android.app.Activity;



// This proxy can be created by calling Html5video.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule=Html5videoModule.class)
public class ExampleProxy extends TiViewProxy
{
	// Standard Debugging variables
	private static final String TAG = "HTML5AndroidVideo";
	
	VideoWebView videowebview;
	HTML5WebView html5webview;
	String url;
	
	private class ExampleView extends TiUIView
	{
		public ExampleView(TiViewProxy proxy) {
			super(proxy);
			LayoutArrangement arrangement = LayoutArrangement.DEFAULT;

			if (proxy.hasProperty(TiC.PROPERTY_LAYOUT)) {
				String layoutProperty = TiConvert.toString(proxy.getProperty(TiC.PROPERTY_LAYOUT));
				if (layoutProperty.equals(TiC.LAYOUT_HORIZONTAL)) {
					arrangement = LayoutArrangement.HORIZONTAL;
				} else if (layoutProperty.equals(TiC.LAYOUT_VERTICAL)) {
					arrangement = LayoutArrangement.VERTICAL;
				}
			}
			
			html5webview = new HTML5WebView(proxy.getActivity());
			html5webview.loadUrl(url /*"http://www.google.nl"*/);
			setNativeView(html5webview.getLayout());
		}

		@Override
		public void processProperties(KrollDict d)
		{
			super.processProperties(d);
		}
	}

	// Constructor
	public ExampleProxy()
	{
		super();
	}

	@Override
	public TiUIView createView(Activity activity)
	{
		
		TiUIView view = new ExampleView(this);

		view.getLayoutParams().autoFillsHeight = true;
		view.getLayoutParams().autoFillsWidth = true;
		return view;
		
		//		html5webview = new HTML5WebView(activity);
 //   	html5webview.loadUrl("http://www.youtube.com/embed/wGMLhaa98GI?autoplay=1");

//		TiUIView videowebview = new VideoWebView(this, html5webview);
//		activity.setContentView(html5webview.getLayout());
//		return videowebview;
	}

	// Handle creation options
	@Override
	public void handleCreationDict(KrollDict options)
	{
		super.handleCreationDict(options);
		if (options.containsKey("url")) {
			url = (String) options.get("url");
			
			//html5webview.loadUrl(url);
		}
	}
	
	// Methods
	/*@Kroll.method
	public void printMessage(String message)
	{
		Log.d(TAG, "printing message: " + message);
	}*/
}
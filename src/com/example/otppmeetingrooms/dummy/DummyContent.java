package com.example.otppmeetingrooms.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 3 sample items.
		addItem(new DummyItem("1", "Asila Hoosein", "Asila Hoosei \n\nCoop Student \nInvestment IT - IT Service and Productivity \n\nEmail: Asila_Hoosei@otpp.com \nPhone: (416) 730-7520 \n7th Floor"));
		addItem(new DummyItem("2", "Avinash Persuad", "Avinash Persuad \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Avinash_Persuad@otpp.com \nPhone: (416) 730-7094 \n7th Floor"));
		addItem(new DummyItem("3", "Chris Twardowski", "Chris Twardowski \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Chris_Twardowski@otpp.com \nPhone: (416) 730-5107 \n7th Floor"));
		addItem(new DummyItem("4", "Daljit Panesar", "Daljit Panesar \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Daljit_Panesar@otpp.com \nPhone: (416) 730-6471 \n7th Floor"));
		addItem(new DummyItem("5", "Daniel Davidov", "Daniel Davidov \n\nCoop Student \nInvestment IT - QA & Testing \n\nEmail: Daniel_Davidovi@otpp.com \nPhone: (416) 730-6326 \n16th Floor"));
		addItem(new DummyItem("6", "Eric Chak", "Eric Chak \n\nBusiness Productivity Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Eric_Chak@otpp.com \nPhone: (416) 730-6501 \n7th Floor"));
		addItem(new DummyItem("7", "Heinrich Zaguirre", "Heinrich Zaguirre \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Heinrich_Zaguirre@otpp.com \nPhone: (416) 730-7002 \n7th Floor"));
		addItem(new DummyItem("8", "Jessie Guo", "Jessie Guo \n\nCoop Student \n Investment IT - QA & Testing \n\nEmail: Jessie_Guo@otpp.com \nPhone: (416) 730-2945 \n16th Floor"));
		addItem(new DummyItem("9", "Jimmy Teh", "Jimmy Teh \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Jimmy Teh@otpp.com \nPhone: (416) 228-3157 \n7th Floor"));
		addItem(new DummyItem("10", "Linda Yan", "Linda Yan \n\nCoop Student \n Investment IT - Project Management \n\nEmail: Linda_Yan@otpp.com \nPhone: (416) 228-3195 \n16th Floor"));
		addItem(new DummyItem("11", "Michael Walzak", "Michael Walzak \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Michael_Walzak@otpp.com \nPhone: (416) 730-7507 \n7th Floor"));
		addItem(new DummyItem("12", "Mike Fazio", "Mike Fazio \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Mike_Fazio@otpp.com \nPhone: (416) 730-7066 \n7th Floor"));
		addItem(new DummyItem("13", "Prashanth Balagopal", "Prashanth Balagopal \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Prashanth_Balagopal@otpp.com \nPhone: (416) 730-7638 \n7th Floor"));
		addItem(new DummyItem("14", "Ravi Mahendra", "Ravi Mahendra \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Ravi_Mahendra@otpp.com \nPhone: (416) 730-5019 \n7th Floor"));
		addItem(new DummyItem("15", "Ron Bursey", "Ron Bursey \n\nSystem Analyst \nInvestment IT - IT Service and Productivity \n\nEmail: Ron_Bursey@otpp.com \nPhone: (416) 730-5293 \n7th Floor"));
		addItem(new DummyItem("16", "Susan Shen", "Susan Shen \n\nCoop Student \n Investment IT - IT Service and Productivity \n\nEmail: Susan_Shen@otpp.com \nPhone: (416) 730-7520 \n7th Floor"));
		addItem(new DummyItem("17", "Tom Hunt", "Tom Hunt \n\nSystem Analyst  \nInvestment IT - IT Service and Productivity \n\nEmail: Tom_Hunt@otpp.com \nPhone: (416) 730-76593 \n7th Floor"));
		addItem(new DummyItem("18", "Zach Waterfield", "Zach Waterfield \n\nCoop Student \nInvestment IT - IT Service and Productivity \n\nEmail: Zach_Waterfield@otpp.com \nPhone: (416) 730-6343 \n7th Floor"));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String content;
		public String description;

		public DummyItem(String id, String content, String description) {
			this.id = id;
			this.content = content;
			this.description = description;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}

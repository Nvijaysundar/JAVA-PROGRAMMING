package p1;

public class EventSelction {

	public void Event(String dept) {
		switch(dept)
		{
		case "01":
			System.out.println("Event-Type's of Mixtures - venue: C121");
			break;
		case "02":
			System.out.println("Event- Transformers - Venue: E111");
			break;
		case "03":
			System.out.println("Event - Fluid Mech - Venue: M10");
			break;
		case "04":
			System.out.println("Event - IOT - Venue: EC3");
			break;
		case "05":
			System.out.println("Event - DBMS - Venue: CS1");
			break;
		}
	}

}

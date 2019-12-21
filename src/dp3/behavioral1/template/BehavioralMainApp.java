package dp3.behavioral1.template;

public class BehavioralMainApp {

	// https://www.journaldev.com/1763/template-method-design-pattern-in-java#template-method-design-pattern-important-points
	public static void main(String[] args) {

		BuildTemplateHouse wood = new WoodenHouse();
		wood.templateMethodForBuildHouse();

		wood = new GlassHouse();
		wood.templateMethodForBuildHouse();

		// By using abstact method we are achieving Template Design Pattern
	}

}

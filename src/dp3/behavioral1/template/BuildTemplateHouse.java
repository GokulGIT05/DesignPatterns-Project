package dp3.behavioral1.template;

public abstract class BuildTemplateHouse {
	
	public final void templateMethodForBuildHouse() {
		buildBasement();
		floorBuild();
		buildWalls();
		buildWindows();
		buildRoof();
		System.out.println("Template Method is Completed its Execution..\n");
	}
	
	public void buildBasement() {
		System.out.println("Basement is Building..");
	}
	
	public void floorBuild() {
		System.out.println("Floor is Building");
	}

	public abstract void buildWalls() ;
	
	public abstract void buildWindows();
	
	public void buildRoof() {
		System.out.println("Building Roof");
	}
	
}

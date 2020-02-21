package dp04.creational_04.builder;

public class Car {
	
	// Below two are required Parameters
	private String model;
	private String year; 
	
	// Below are optional Parameters
	private String color;
	private boolean isAutomatic;
	private boolean isElectric;
	
	// Private Constructor. With inner class argument type
	public Car(CarBuilderInnerStaticClass carBuilderInnerStaticClass) {
		// Required Fields
		this.model = carBuilderInnerStaticClass.model;
		this.year = carBuilderInnerStaticClass.year;
		
		// Optional Fields
		this.color = carBuilderInnerStaticClass.color;
		this.isAutomatic = carBuilderInnerStaticClass.isAutomatic;
		this.isElectric = carBuilderInnerStaticClass.isElectric;
	}
	
	
	//  No Setter. Only getter should have.
	public String getModel() {
		return model;
	}
	public String getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public boolean isElectric() {
		return isElectric;
	}
	
	public static class CarBuilderInnerStaticClass{
		// Copied all the Parameters from outer class.
		private String model;
		private String year; 
		
		// Below are optional Parameters
		private String color;
		private boolean isAutomatic;
		private boolean isElectric;
		
		// Create a constructor for required Parameters.
		public CarBuilderInnerStaticClass(String model, String year) {
			super();
			this.model = model;
			this.year = year;
		}
		
		
		// Setter with return InnerClass Type for optional fields.
		public CarBuilderInnerStaticClass setColor(String color) {
			this.color = color;
			return this;
		}

		public CarBuilderInnerStaticClass setAutomatic(boolean isAutomatic) {
			this.isAutomatic = isAutomatic;
			return this;
		}

		public CarBuilderInnerStaticClass setElectric(boolean isElectric) {
			this.isElectric = isElectric;
			return this;
		}
		
		
		// Convention to create a builder method using build return types as outer class.
		public Car build(){
			return new Car(this);
		}
		
	}

	// Outer Class toString().
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + ", isAutomatic=" + isAutomatic
				+ ", isElectric=" + isElectric + "]";
	}
	
	
	
	

}

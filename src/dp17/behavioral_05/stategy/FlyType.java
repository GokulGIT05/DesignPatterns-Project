package dp17.behavioral_05.stategy;

public interface FlyType {
	
	public String getFlyMethod();
}


// First Impl Classes
class CantFly implements FlyType{

	@Override
	public String getFlyMethod() {
		return "This Animal can't Fly";
	}
}

// Second Class wont Fly

class CanFly implements FlyType{

	@Override
	public String getFlyMethod() {
		return "This Type can Fly";
	}
	
}
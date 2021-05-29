
public class TargetNotFoundException extends RuntimeException {

	public TargetNotFoundException() {
		super();
	}

	public TargetNotFoundException(String message) {
		super(message);
		Output.printMessage(message);
	}
	
}

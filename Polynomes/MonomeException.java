public class MonomeException extends Exception {

    String message;

    public MonomeException(String _message) {
	message = _message;
    }

    public String toString() {
	return "MonomeException : "+message;
    }
}

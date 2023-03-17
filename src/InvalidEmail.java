public class InvalidEmail extends Exception{
  public InvalidEmail (String email) {
    super("Incorrect e-mail " + email);
  }
}

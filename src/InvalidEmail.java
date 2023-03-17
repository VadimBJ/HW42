public class InvalidEmail extends IllegalArgumentException {
  public InvalidEmail(String eMail) {
    super("Введен неверный e-mail: " + eMail);
  }
}

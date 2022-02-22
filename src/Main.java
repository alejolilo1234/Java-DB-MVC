public class Main {
    public static void main(String ...args) {
        try {
            Model.LoginDAO log = new Model.LoginDAO();
            log.login("Jhon Abril", "JIDOAD");
        } catch (Exception ex) {
            //
        }
    }
}

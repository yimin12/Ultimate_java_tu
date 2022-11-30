package AGenius.Algorithm.DesignPattern.TemplateMethod.networks;

public abstract class Network {

    String userName;
    String password;

    Network() {}


    public boolean post(String message) {

        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();

}

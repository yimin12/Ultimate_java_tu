package AGenius.Algorithm.DesignPattern.ChainOfRsponsibility;

import AGenius.Algorithm.DesignPattern.ChainOfRsponsibility.middleware.Middleware;
import AGenius.Algorithm.DesignPattern.ChainOfRsponsibility.middleware.RoleCheckMiddleware;
import AGenius.Algorithm.DesignPattern.ChainOfRsponsibility.middleware.ThrottlingMiddleware;
import AGenius.Algorithm.DesignPattern.ChainOfRsponsibility.middleware.UserExistsMiddleware;
import AGenius.Algorithm.DesignPattern.ChainOfRsponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}


import controller.LogingController;
import view.LoginView;

import view.DoctorView;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        LoginView loginView = new LoginView();

        LogingController controlLogin = new LogingController(loginView);

    }
}

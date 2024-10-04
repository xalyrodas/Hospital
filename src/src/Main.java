
import controller.LogingController;
import view.LoginView;

import view.DoctorView;

import backEnd.BackEnd;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        LoginView loginView = new LoginView();

        BackEnd backEnd=new BackEnd();
        new LogingController(loginView,backEnd);
        loginView.setVisible(true);

    }
}

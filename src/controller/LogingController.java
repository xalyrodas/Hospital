package controller;

import view.LoginView;

public class LogingController {
    private LoginView loginView;

    public LogingController(LoginView loginView){
        this.loginView=loginView;
        //this.loginView.addLog(e--> hanleLogin());

    }
    public void controllerDeLogin(){
        System.out.println("HOLI");
    }
}

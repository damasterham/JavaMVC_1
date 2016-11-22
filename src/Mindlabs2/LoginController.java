package Mindlabs2;//

import Mindlabs2.Views.IView;

//Created by DaMasterHam on 21-11-2016.
//
public class LoginController
{
    private IView loginView;

    public LoginController(IView loginView)
    {
        this.loginView = loginView;
    }

    public void loginScreen()
    {
        loginView.render();
    }
}

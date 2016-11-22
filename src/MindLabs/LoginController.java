package MindLabs;

public class LoginController
{
    public String indexView()
    {
        return "FXLoginView";
    }

    public String login(String code)
    {
        // Do stuff to login
        if (code == "1")
            return "AdminView";
        else
            return "MemberView";

    }
}

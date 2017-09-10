package muralpolicia.business;

import muralpolicia.model.User;

/**
 * Created by IrbeinTepes on 10/09/2017.
 */

public class LoginBusiness {

    public static User ValidateLogin(String login, String password){

        User user = null;

        //pegar do banco
        if(login.equals("admin") && password.equals("admin")){
            user = new User(login, password);
        }
        return user;
    }

}

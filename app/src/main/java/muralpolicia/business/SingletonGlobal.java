package muralpolicia.business;

import muralpolicia.model.User;

/**
 * Created by IrbeinTepes on 12/6/2017.
 */

public class SingletonGlobal {
    private static SingletonGlobal instance = null;

    private User user;

    protected SingletonGlobal(){}

    public static synchronized SingletonGlobal getInstance(){
        if(null == instance){
            instance = new SingletonGlobal();
        }
        return instance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

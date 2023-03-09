package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaApplication extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String username;
    @Constraints.Required
    public String preference;
    @Constraints.Required
    public String preference1all;
    @Constraints.Required
    public String preference2;
    @Constraints.Required
    public String preference3;
    @Constraints.Required
    public String notpreferred;




    public static Find<Long, User> find = new Find<Long, User>(){};

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }
}

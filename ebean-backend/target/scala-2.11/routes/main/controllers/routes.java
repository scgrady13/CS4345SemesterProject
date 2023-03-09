
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/davidberberian/Desktop/TaSystemnow/TASystem/ebean-backend/conf/routes
// @DATE:Tue Mar 07 10:59:25 CST 2023

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}

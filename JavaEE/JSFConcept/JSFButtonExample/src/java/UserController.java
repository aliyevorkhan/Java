import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    public void clickMe(){
        System.out.println("Clicked Me!");
    }
}

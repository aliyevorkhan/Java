
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private String time;

    public void showTime(){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        time=dateFormat.format(now);
        
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}

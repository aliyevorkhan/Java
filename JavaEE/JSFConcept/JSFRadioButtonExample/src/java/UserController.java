
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private String color;
    private String outputText;

    public void show(){
        outputText = "You chose :" + color;
    }
    
    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }
    
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}

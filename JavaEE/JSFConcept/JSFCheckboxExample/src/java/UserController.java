
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private boolean married;
    private String outputText;
    
    
    public void show(){
        outputText = "Married: " + married;
    }

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }
    
    
    
    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    
    
}

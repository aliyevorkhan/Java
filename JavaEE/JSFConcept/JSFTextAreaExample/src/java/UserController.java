
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private String address;
    private String outputText;
    
    public void sendAdress(){
        outputText = "Your adddress is " + address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }
    
}

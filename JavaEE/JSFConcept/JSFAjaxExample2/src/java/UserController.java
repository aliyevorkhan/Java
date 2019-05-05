
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private String name;
    private String outputText;

    public void sayHelloAction(){
        outputText = "Hello " + name;
        System.out.println("it works");
        System.out.println("Name: " + name);
        System.out.println("OutputText: " + outputText);
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }
    
    
}

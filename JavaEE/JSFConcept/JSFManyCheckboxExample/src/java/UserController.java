
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private List<String> values;
    private String outputText;
    private Map<String, String> items;

    
    
    public void show(){
        outputText = "Your elections : "+values;
    }
    
    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String outputText) {
        this.outputText = outputText;
    }
    
    
    
    @PostConstruct
    public void init(){
        values = new ArrayList<String>();
        items = new HashMap<String, String>();
        
        items.put("JSF", "Java Server Faces");
        items.put("JSP", "Java Server Pages");
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }
    
    
    
}

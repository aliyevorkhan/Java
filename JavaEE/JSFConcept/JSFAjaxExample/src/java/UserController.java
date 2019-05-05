
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private String inputText;
    
    public void ajaxClick(){
        System.out.println("Ajax click event");
    }
    
    public void ajaxChange(){
        System.out.println("Ajax change event");
    }

    public void ajaxDoubleClick(){
        System.out.println("Ajax double click event");
    }
    
    public void ajaxFocus(){
        System.out.println("Ajax focus event");
    }
    
    public void ajaxKeyDown(){
        System.out.println("Ajax key down event");
    }
    
    public void ajaxKeyUp(){
        System.out.println("Ajax key up event");
    }
    
    public void ajaxKeyPress(){
        System.out.println("Ajax key press event");
    }
    public void ajaxMouseDown(){
        System.out.println("Ajax mouse down event");
    }
    
    public void ajaxMouseMove(){
     System.out.println("Ajax mouse move event");
    }
    
    public void ajaxMouseOut(){
    System.out.println("Ajax mouse out event");
    }
    
    public void ajaxMouseOver(){
        System.out.println("Ajax mouse over event");
    }
    
    public void ajaxMouseUp(){
  System.out.println("Ajax mouse up event");
    }
    
    public void ajaxSelect(){
        System.out.println("Ajax select event");
    }
    
    public void ajaxBlur(){
        System.out.println("Ajax blur event");
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }
    
    
    
    
}

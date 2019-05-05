import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private String pageNumber;

    public String forwardPage(){
        if("2".equals(pageNumber)){
            return "second.xhtml?faces-redirect=true";
        }else{
            return "third.xhtml?faces-redirect=true";
        }
    }
    
    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }
    
}


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;

@ManagedBean(name="UserCtrl")
@SessionScoped
public class UserController {
    private Part file;

    public void uploadFile(){
        try{
            InputStream input = file. getInputStream();
            File f = new File("C:\\Users\\Orkhan\\Desktop");
            if(!f.exists()){
                f.createNewFile();
            }
            FileOutputStream output = new FileOutputStream(f);
            byte[] buffer = new byte[1024];
            int length;
            while((length= input.read(buffer))>0){
                output.write(buffer, length, length);
            }
            input.close();
            output.close();
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
    
    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
}

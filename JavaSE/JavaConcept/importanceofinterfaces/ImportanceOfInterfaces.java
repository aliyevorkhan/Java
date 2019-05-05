/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importanceofinterfaces;

/**
 *
 * @author Orkhan
 */
//we created class for manage all Databases
class DatabaseManager{
    public void AddDatabase(IDatabase database){
        database.add();
    }
    public void DeleteDatabase(IDatabase database){
        database.delete();
    }
    public void GetDatabase(IDatabase database){
        database.get();
    }
    public void UpdateDatabase(IDatabase database){
        database.update();
    }
}

public class ImportanceOfInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //we created object from DatabaseManager class
        DatabaseManager manager = new DatabaseManager();
                
        //if we want to work with Mysql we can call that with this method
        manager.AddDatabase(new MysqlDatabase());
        //or if we want to work MongoDb we can call that with this method
        manager.DeleteDatabase(new MongoDatabase());
        
        //if we add new database which is Oracle and we want to work with that
        //we just write that line
        manager .GetDatabase(new OracleDatabase()); 
    }
    
}

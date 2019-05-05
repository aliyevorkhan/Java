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
public interface IDatabase {
    //these functions can write all Databases
    //so we write these methods then we're going to call from MysqlDatabse or MongoDatabse
    void add();
    void delete();
    void get();
    void update();
}

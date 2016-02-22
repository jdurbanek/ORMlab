package com.cs407_android.ormlab;

/**
 * Created by njaunich on 2/18/16.
 */
import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;


public class ExampleDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.cs407_android.ormlab"); //Scheme for GreenDAO ORM
        createDB(schema);
        new DaoGenerator().generateAll(schema, "./app/src/main/java/");
    }

    private static void createDB(Schema schema) {

        //Add Guest
        Entity guest = schema.addEntity("Guest");
        guest.addIdProperty();

        guest.addStringProperty("firstName");
        guest.addStringProperty("lastName");
        guest.addStringProperty("email");
        guest.addStringProperty("phone");
        guest.addBooleanProperty("display");



    }

}
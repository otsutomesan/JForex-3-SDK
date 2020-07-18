package addition;

import java.io.*;
//import java.util.Map;
import java.util.Properties;
//import java.util.HashMap;

public class Config {
    //static public HashMap<String,String> properties = new HashMap<String,String>();
    static public String id_jforex3;
    static public String pwd_jforex3;
    static public String dir_output;

    static public void readConfig(){
        //HashMap<String,String> properties = new HashMap<String,String>();
        Properties conf = new Properties();
        String filename = "./config.properties";
        try {
            conf.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.err.println("Cannot open " + filename + ".");
            e.printStackTrace();
            System.exit(-1);  // プログラム終了
        }
        id_jforex3 = conf.getProperty("ID_jforex3");
        pwd_jforex3 = conf.getProperty("PWD_jforex3");
        dir_output = conf.getProperty("DIR_work");
        //System.out.println("--- userName:" + configMap.get("userName"));
        return;
    }

}

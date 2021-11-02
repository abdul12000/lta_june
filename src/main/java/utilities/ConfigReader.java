package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    File file = new File("src/main/resources/Config.Properties");
    FileInputStream fis = new FileInputStream(file);
    public Properties prop = null;

    public ConfigReader() throws Exception{
        prop = new Properties();
        prop.load(fis);
    }
    public String getNewtoursUrl(){
        return prop.getProperty("NewtoursUrl");
    }
    public String getUkbaUrl(){
        return prop.getProperty("UkbaUrl");
    }
    public String getMortgageCalcUrl(){return prop.getProperty("MortgageCalculatorUrl");}
    public String getNextUrl(){return prop.getProperty("NextUrl");}
}

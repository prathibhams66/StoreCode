package amazonutilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GenericMethods {
	public String PropertyReader(String rt) throws IOException
		{
			Properties pr=new Properties();
			BufferedReader br= new BufferedReader(new FileReader("amazonlaunch.properties"));
			pr.load(br);
			String st = pr.getProperty(rt);
			return st;
		}

}

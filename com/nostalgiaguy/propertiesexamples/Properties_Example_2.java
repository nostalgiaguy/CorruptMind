package com.nostalgiaguy.propertiesexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Properties_Example_2 {

	public static void main(String[] args) {


		//////saving properties into example.properties file/////////
		try (OutputStream out = new FileOutputStream("example_2.properties")) {
			Properties properties = new Properties();
			properties.setProperty("name", "romy");
			properties.setProperty("name", "romy1");
			properties.setProperty("", "NULL-KEY");
			properties.setProperty("NULL-VALUE", "");
			properties.store(out, "This is a sample for java properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////////////

		////////////Reading properties////////////////////////////////
		
		try (InputStream in = new FileInputStream("example_2.properties")) {
			Properties prop = new Properties();
			prop.load(in);
			System.out.println("####Properties.getProperty usage####");
			System.out.println(prop.getProperty("name"));
			System.out.println();

			System.out.println("####Properties.stringPropertyNames usage####");
			for (String property : prop.stringPropertyNames()) {
				String value = prop.getProperty(property);
				System.out.println(property + "=" + value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}

package com.nostalgiaguy.propertiesexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Properties_Example_1 {
	
	public static void main(String[] s) {

		//////saving properties into example.properties file/////////
		try (OutputStream out = new FileOutputStream("example_1.properties")) {
			Properties properties = new Properties();
			properties.setProperty("name", "nostalgiaguy");
			properties.setProperty("article", "JavaProperties");
			properties.setProperty("version", "1.0");
			properties.setProperty("ide", "eclipse");
			properties.store(out, "This is a sample for java properties");

		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////////////

		////////////Reading properties////////////////////////////////
		try (InputStream in = new FileInputStream("example_1.properties")) {
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

		////////////////////////////////////////////////////

		/////////writing and reading fromxml////////////////
		try (OutputStream out = new FileOutputStream("example_1.xml")) {
			Properties properties = new Properties();
			properties.setProperty("name", "nostalgiaguy");
			properties.setProperty("article", "JavaProperties");
			properties.setProperty("version", "1.0");
			properties.setProperty("ide", "eclipse");
			properties.storeToXML(out,
					"This is how we can have properties as xml");

		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////

		///////////Reading properties from xml/////////////////
		try (InputStream in = new FileInputStream("example_1.xml")) {
			Properties prop = new Properties();
			prop.loadFromXML(in);

			System.out.println("####Properties.load from xml usage####");
			for (String property : prop.stringPropertyNames()) {
				String value = prop.getProperty(property);
				System.out.println(property + "=" + value);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		///////////////////////////////////////////////////////

	}

}




package br.com.reflection.util.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Mapper {

	private Map<Class<?>, Class<?>> map = new HashMap<>();

	public void load(String fileName) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		Properties prop = new Properties();
		prop.load(new FileInputStream(fileName));
		for (Object iterable_element : prop.keySet()) {
			Class<?> interf = Class.forName(iterable_element.toString());
			Class<?> clazz = Class.forName(prop.get(iterable_element)
					.toString());
			map.put(interf, clazz);
		}
	}

	public Class<?> getImplementation(Class<?> interf) {
		return map.get(interf);
	}

}

package br.com.test;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.reflection.Account;
import br.com.reflection.model.Manager;
import br.com.reflection.util.Util;
import br.com.reflection.util.properties.Mapper;

public class TestReflection {

	@Test
	public void TestReflectionMethod() {
		Account acc = new Manager.Builder().id(1L).name("Someone").build();
		List<String> list = Util.getNull(acc);
		assertEquals(0, list.size());
	}

	@Test
	public void loadTest() throws FileNotFoundException,
			ClassNotFoundException, IOException {
		Mapper map = new Mapper();
		map.load("class.prop");
		assertEquals(ArrayList.class, map.getImplementation(List.class));
	}
}

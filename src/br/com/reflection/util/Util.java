package br.com.reflection.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import br.com.reflection.Account;

public class Util {

	public static List<String> getNull(Account account) {
		List<String> list = new ArrayList<>();
		if (account.getId() == null)
			list.add("ID");
		if (account.getId() == null)
			list.add("NAME");
		return list;
	}

	public static List<String> getNull(Object account)
			throws IllegalArgumentException, IllegalAccessException {
		List<String> list = new ArrayList<>();
		Class<?> c = account.getClass();
		for (Field field : c.getFields()) {
			Object value = field.get(account);
			if (value == null) {
				list.add(field.getName());
			}
		}
		return list;
	}

}

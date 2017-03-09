package br.com.reflection.model;

import br.com.reflection.Account;

public class User implements Account {

	private Long id;
	private String name;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}
}

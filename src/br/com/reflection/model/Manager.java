package br.com.reflection.model;

import br.com.reflection.Account;

public class Manager implements Account {

	private Long id;
	private String name;

	public Manager(Builder builder) {
		id = builder.id;
		name = builder.name;

	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public static class Builder {
		Long id;
		String name;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Manager build() {
			return new Manager(this);
		}
	}
}

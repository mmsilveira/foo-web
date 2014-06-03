package br.com.foo.login;

import java.util.List;

public interface IFooService {

	List<Foo> getAll();

	Foo getById(Long id);

	Long create(Foo entity);

	void update(Foo entity);

	void deleteById(Long id);

}

package br.com.foo.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FooService implements IFooService {

	@Override
	public List<Foo> getAll() {
		List<Foo> foos = new ArrayList<Foo>();
		Foo foo = new Foo();
		foo.setId(123L);
		foos.add(foo);
		return foos;
	}

	@Override
	public Foo getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long create(Foo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Foo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

}

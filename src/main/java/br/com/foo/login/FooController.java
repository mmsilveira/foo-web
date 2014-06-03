package br.com.foo.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping( value = "foo" )
class FooController {

	@Autowired
	IFooService service;
	
	@RequestMapping( method = RequestMethod.GET )
	@ResponseBody
	public List<Foo> getAll() {
		return service.getAll();
	}
	
	@RequestMapping( value = "/{id}", method = RequestMethod.GET )
	@ResponseBody
	public Foo get( @PathVariable( "id" ) Long id ) {
		return service.getById( id );
	}

	@RequestMapping( method = RequestMethod.POST )
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public Long create( @RequestBody Foo entity ) {
		return service.create( entity );
	}
	
	@RequestMapping( method = RequestMethod.PUT )
	@ResponseStatus( HttpStatus.OK )
	public void update( @RequestBody Foo entity ) {
		if (service.getById( entity.getId()) != null ) {
			service.update( entity );
		}
	}
	
	@RequestMapping( value =  "/{id}", method = RequestMethod.DELETE )
	@ResponseStatus( HttpStatus.OK )
	public void delete( @PathVariable("id") Long id ) {
		service.deleteById( id );
	}
	
}

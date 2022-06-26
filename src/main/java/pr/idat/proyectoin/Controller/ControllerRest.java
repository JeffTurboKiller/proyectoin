package pr.idat.proyectoin.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import pr.idat.proyectoin.Entity.Articulo;
import pr.idat.proyectoin.Service.ArticuloService;

@RestController
@RequestMapping("/API/articulos")
public class ControllerRest {
	
	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping(path ="/articulo_listar")
	public Collection<Articulo> listar_GET() {
	
		return articuloService.FindAll();
	}
	

}

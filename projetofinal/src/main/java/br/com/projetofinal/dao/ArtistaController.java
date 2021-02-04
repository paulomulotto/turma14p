package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artista/find_by_id/{id}")
	public ResponseEntity<Artista> findById(@PathVariable int id) {
		Artista resposta = dao.findById(id);
		if(resposta==null) {
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll() {
		List<Artista> lista = (List<Artista>) dao.findAll();
		if(lista.size() ==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/artista/find_by_nacionalidade/")
	public ResponseEntity<List<Artista>> findByNacionalidadePost(@RequestBody Artista objeto) {
		List<Artista> resposta = (List<Artista>)dao.findByNacionalidade(objeto.getNacionalidade());
		if(resposta==null) {
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/artista/find_by_nacionalidade/{nacionalidade}")
	public ResponseEntity<List<Artista>> findByNacionalidadeGet(@PathVariable String nacionalidade) {
		List<Artista> resposta = (List<Artista>)dao.findByNacionalidade(nacionalidade);
		if(resposta==null) {
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/artista/novo")
	public ResponseEntity<Artista> gravar(@RequestBody Artista objeto) {
		
		try {
			if(objeto.getNomeArtistico().length()<4) {
				return ResponseEntity.status(403).build();
			}
			dao.save(objeto);
		}
		catch (Exception e) {
			//ResponseEntity response = ResponseEntity.status(e.printStackTrace());
			return ResponseEntity.status(404).build();
		}
		
		return ResponseEntity.ok(objeto);
	}
	
	@GetMapping("/artista/apagar/{id}")
	public ResponseEntity<Artista> deleteById(@PathVariable int id) {
		Artista resposta = dao.findById(id);
		if(resposta!=null) { 
			dao.deleteById(id);
			return ResponseEntity.ok(resposta);
		}
		else {
			return ResponseEntity.status(401).build();
		}
	}
}

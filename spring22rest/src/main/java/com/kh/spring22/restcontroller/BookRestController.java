package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;
import com.kh.spring22.dto.PocketmonDto;



@CrossOrigin
@RequestMapping("/book")
@RestController
public class BookRestController {
	
	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/")
	public List<BookDto> list(){
		return bookDao.selectList();
	}
	
	@PostMapping("/")
	public void insert(@RequestBody BookDto bookDto) {
		bookDao.insert(bookDto);
	}
	
	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> delete(@PathVariable int bookId){
		boolean result = bookDao.delete(bookId);
		if(result) {
			return ResponseEntity.status(200).build();
		}
		else {
			return ResponseEntity.status(404).build();
		}
	}
	
	@GetMapping("/bookId/{bookId}")
	public ResponseEntity<BookDto> find(@PathVariable int bookId){
		BookDto bookDto = bookDao.selectOne(bookId);
		if(bookDto != null) {
			return ResponseEntity.ok(bookDto);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/bookId/{bookId}")
	public ResponseEntity<String> edit(@PathVariable int bookId, @RequestBody BookDto bookDto){
		boolean result = bookDao.edit(bookId, bookDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}

	@PatchMapping("/{bookId}")
	public ResponseEntity<String> deitUnit(
		@PathVariable int bookId, @RequestBody BookDto bookDto){
		if(bookDto.isEmpty()) {
		ResponseEntity.badRequest().build();
	}
	boolean result = bookDao.editUnit(bookId, bookDto);
	return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
}


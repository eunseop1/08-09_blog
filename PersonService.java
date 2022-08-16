package kr.human.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.human.jpa.dao.PersonRepository;
import kr.human.jpa.vo.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> selectAll(){
		Iterable<Person> it = personRepository.findAll();  // 모두 얻기
		List<Person> list = new ArrayList<>(); // 리스트 객체
		it.forEach(list::add); // Iterable객체의 내용을 리스트에 담기
		return list;
	}
	
	public long selectCount() {
		return personRepository.count();
	}
}

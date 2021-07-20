package com.ygh.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ygh.jpa.member.Member;
import com.ygh.jpa.member.MemberRepository;

@SpringBootApplication
public class YghAppApplication implements CommandLineRunner{

	@Autowired
	MemberRepository memberRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(YghAppApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		List<Member> list1 = memberRepository.findByName("a");
		System.out.println(list1);
		for(Member m : list1) {
			System.out.println(m.toString());
		}
		
		Member mem = new Member();
		mem.setName("gihun");
		mem.setAge(10);
		memberRepository.save(mem);
		
		
		
		
	}

}

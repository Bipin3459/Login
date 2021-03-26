package com.project.login.member;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MemberConfig {

	@Bean
	CommandLineRunner commandLineRunner(MemberRepository repository) {
		return args ->{
			Member bipin = new Member("Bipin",
					"Muddagoni",
					465684,
					945686);
			
			Member alex = new Member("ALex",
					"Clarke",
					7456456,
					595686);
			
			repository.saveAll(
					List.of(bipin,alex));
			
		};
	}
}

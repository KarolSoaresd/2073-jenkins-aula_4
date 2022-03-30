package br.com.alura.leilao.config;

import java.time.Clock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClockConfiguration {

	@Bean
	public Clock clock() {
		return Clock.systemDefaultZone();
	}

}

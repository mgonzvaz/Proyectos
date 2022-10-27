package com.nttdata.bootcamp;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.models.Subscriber;

import reactor.core.publisher.Flux;

@RestController
public class Controller {

	@GetMapping(path = "/numbers-with-subscribers", produces = "text/event-stream")
	public Flux<Integer> numbers() {
		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

		flux.subscribe(n -> Subscriber.print(n)); // Suscriptor 1

		flux.subscribe(n -> System.out.println("Subscriber 2: " + n)); // Suscriptor 2
		return flux;
	}
}

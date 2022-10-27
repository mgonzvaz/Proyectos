package reactor.t1;

import reactor.core.publisher.Flux;

public class Principal {

	public static void main(String[] args) {
		Flux<String> messageSender = Flux.just("mensaje1", "mensaje2", "mensaje3");

		messageSender.subscribe(subscribe -> System.out.println("Observer 1. subscribed"),
				next -> System.out.println("Observer 1. received: " + next),
				error -> System.out.println("Observer 1. Error: " + error),
				completed -> System.out.println("Observer 1. Completed"));

	}

}

package com.nttdata.bootcamp;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class JavarxApplication {

	public static void main(String[] args) {

		Observable<String> messageSender = Observable.just("mensaje1", "mensaje2", "mensaje3");

		messageSender.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer1. Subscribed");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer1. Received" + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer1. Error:" + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Observer1. Completed");
			}
		});

		messageSender.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer2. Subscribed");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer2. Received" + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer2. Error:" + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Observer2. Completed");
			}
		});

		messageSender.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer3. Subscribed");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer. Received" + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer3. Error:" + e.getMessage());
			}

			@Override
			public void onComplete() {
				System.out.println("Observer3. Completed");
			}
		});
	}

}

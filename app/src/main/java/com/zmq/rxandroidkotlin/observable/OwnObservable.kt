package com.zmq.rxandroidkotlin.observable

import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by zmq181 on 14/6/19.
 */
class OwnObservable {

    companion object {
        lateinit var observable: Observable<String>

        fun create() {
            observable = Observable.create(object : ObservableOnSubscribe<String> {
                override fun subscribe(emitter: ObservableEmitter<String>) {
                    println("Omitting")
                    emitter.onNext("Hii hhh")
                    emitter.onNext("Hello hhhhhhhhhhhhhh")
                    emitter.onComplete()
                }

            })

            var observer = object : Observer<String> {
                override fun onNext(t: String) {
                    println("onNext = $t  ${Thread.currentThread().name}")
                }

                override fun onError(e: Throwable) {

                }

                override fun onSubscribe(d: Disposable) {
                    println("onSubscribe" + Thread.currentThread().name)
                }

                override fun onComplete() {
                    println("onComplete" + Thread.currentThread().name)
                }

            }

            observable.subscribe(observer)
            observable.subscribeOn(Schedulers.io())
            observable.observeOn(AndroidSchedulers.mainThread())
        }
    }


}
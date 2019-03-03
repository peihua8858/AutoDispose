package com.shaishavgandhi.test1

import android.app.Activity
import io.reactivex.Observable

class Sample: Activity() {

  fun something() {
    Observable.just(1)
        .subscribe()
  }
}
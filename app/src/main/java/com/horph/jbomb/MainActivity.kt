package com.horph.jbomb

import android.app.Activity
import android.os.Bundle
import org.jgroups.JChannel

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      JChannel()
  }
}

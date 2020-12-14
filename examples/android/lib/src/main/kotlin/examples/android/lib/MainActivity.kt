package examples.android.lib

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.appcompat.app.AlertDialog

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Ensure Kotlin Android Extensions plugin has run and generated code correctly.
    message.text = "hello"

    AlertDialog.Builder(this)
        .setTitle("Blah")
        .setMessage("Blah blah blah?")
        .show()
    // Ensure Serialization plugin has run and generated code correctly.
    Data.serializer()

    AutoValue_TestKtValue.Builder().setName("Auto Value Test").build()
  }
}

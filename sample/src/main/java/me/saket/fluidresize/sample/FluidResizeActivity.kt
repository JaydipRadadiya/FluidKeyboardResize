package me.saket.fluidresize.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FluidResizeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_fluid_resize)

    FluidContentResizer.listen(this)
  }
}

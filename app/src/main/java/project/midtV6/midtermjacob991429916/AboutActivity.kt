package project.midtV6.midtermjacob991429916

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun onClickExit(view: View) {
        finish()
    }
}
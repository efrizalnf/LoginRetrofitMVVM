package id.zlz.loginmvvm

import android.content.Intent
import android.net.wifi.WifiConfiguration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.zlz.loginmvvm.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        finish()
        startActivity(Intent(this, AuthActivity::class.java))
    }
}
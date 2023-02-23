package alexandra.rodriguez.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold:Button = findViewById(R.id.button_cold_drinks)
        btnCold.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            startActivity(intent)
        }

        var btnHot:Button = findViewById(R.id.button_hot_drinks)
        btnHot.setOnClickListener {
            var intent: Intent = Intent(this,HotdrinksActivity::class.java)
            startActivity(intent)
        }

        var btnSweets:Button = findViewById(R.id.button_sweets)
        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this,SweetsActivity::class.java)
            startActivity(intent)
        }

        var btnSalties:Button = findViewById(R.id.button_salties)
        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this,SaltiesActivity::class.java)
            startActivity(intent)
        }
    }
}
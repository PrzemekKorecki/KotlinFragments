package com.example.kotlinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pf:PierwszyFrg = PierwszyFrg.newInstance()
    var df:DrugiFrg = DrugiFrg.newInstance()
    var tf:TrzeciFrg= TrzeciFrg.newInstance()
    var licznik:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            if (licznik % 2 == 0) {
                supportFragmentManager.beginTransaction().remove(pf).commit()
                supportFragmentManager.beginTransaction().add(R.id.pierwszy_frg, tf, "").commit()
            } else {
                supportFragmentManager.beginTransaction().remove(tf).commit()
                supportFragmentManager.beginTransaction().add(R.id.pierwszy_frg, pf, "").commit()
            }
            licznik++
        }
    }

}

package io.wongxd.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.wongxd.SweetAlertDialog.SweetAlertDialog
import  io.wongxd.app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SweetAlertDialog(this)

            .show()
    }
}

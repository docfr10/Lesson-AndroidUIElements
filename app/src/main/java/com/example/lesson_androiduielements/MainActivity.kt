package com.example.lesson_androiduielements

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox: CheckBox = findViewById(R.id.checkBox2)
        checkBox.setOnCheckedChangeListener { compoundButton, b ->
            Toast.makeText(applicationContext, "$b", Toast.LENGTH_SHORT).show()
        }

        val toggleButton: ToggleButton = findViewById(R.id.toggleButton2)
        toggleButton.setOnCheckedChangeListener { compoundButton, b ->
            toggleButton.textOn = "1"
            toggleButton.textOff = "0"
        }

        val floatingActionButton: FloatingActionButton = findViewById(R.id.floatingActionButton2)
        floatingActionButton.setOnClickListener {
            Snackbar.make(it, "Click", Snackbar.LENGTH_SHORT).show()
        }

        val array = arrayOf(1, 2, 3)
        val spinner: Spinner = findViewById(R.id.spinner2)
        val adapter = ArrayAdapter(
            this,
            androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.array)
        )
        spinner.adapter = adapter
    }
}
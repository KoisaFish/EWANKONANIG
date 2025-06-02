package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentCharacters : AppCompatActivity() {

    private lateinit var editableText: EditText
    private val PREF_KEY = "editable_text"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_characters)

        editableText = findViewById(R.id.editableText)

        val fab: FloatingActionButton = findViewById(R.id.fabAddCharacter)
        fab.setOnClickListener {
            val intent = Intent(this, CharacterSheetActivity::class.java)
            startActivity(intent)
        }

        val btnFinish: Button = findViewById(R.id.btnFinish)
        btnFinish.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val savedText = sharedPref.getString(PREF_KEY, "")
        editableText.setText(savedText)
    }

    override fun onPause() {
        super.onPause()
        val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        sharedPref.edit()
            .putString(PREF_KEY, editableText.text.toString())
            .apply()
    }
}

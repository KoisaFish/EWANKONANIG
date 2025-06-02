package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CreateCharacter : Fragment() {

    private lateinit var addCharacterBtn: Button
    private lateinit var fab: FloatingActionButton
    private lateinit var waka: TextView

    private val createCharacterLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            waka.visibility = View.GONE
            addCharacterBtn.visibility = View.VISIBLE
            addCharacterBtn.text = "Character 1"
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_create_character, container, false)

        addCharacterBtn = view.findViewById(R.id.addCharacterBtn)
        fab = view.findViewById(R.id.fab)
        waka = view.findViewById(R.id.waka)

        waka.visibility = View.VISIBLE
        addCharacterBtn.visibility = View.VISIBLE

        val launchCreate = {
            val intent = Intent(requireContext(), FragmentCharacters::class.java)
            createCharacterLauncher.launch(intent)
        }

        addCharacterBtn.setOnClickListener { launchCreate() }
        fab.setOnClickListener { launchCreate() }

        return view
    }

    fun resetCharacterUI() {
        waka?.visibility = View.VISIBLE
        addCharacterBtn?.visibility = View.VISIBLE
        addCharacterBtn?.text = ""
    }
}

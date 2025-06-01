package com.example.myapplication

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentCharacters : Fragment() {

    private var listener: OnCharacterCreatedListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnCharacterCreatedListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnCharacterCreatedListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_characters, container, false)

        // Save Button
        val saveBtn = view.findViewById<Button>(R.id.btnSave)
        saveBtn.setOnClickListener {
            listener?.onCharacterCreated()
        }

        // FAB Button
        val fabAddCharacter = view.findViewById<FloatingActionButton>(R.id.fabAddCharacter)
        fabAddCharacter.setOnClickListener {
            showAddDescriptionDialog()
        }

        return view
    }

    private fun showAddDescriptionDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Add Description")

        val input = EditText(requireContext())
        input.hint = "Enter description..."
        builder.setView(input)

        builder.setPositiveButton("Confirm") { dialog, _ ->
            val description = input.text.toString().trim()
            if (description.isNotEmpty()) {
                // TODO: Save to database
                Toast.makeText(requireContext(), "Saved: $description", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Description cannot be empty", Toast.LENGTH_SHORT).show()
            }
            dialog.dismiss()
        }

        builder.setNegativeButton("Cancel") { dialog, _ ->
            dialog.cancel()
        }

        builder.show()
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnCharacterCreatedListener {
        fun onCharacterCreated()
    }
}

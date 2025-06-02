package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        // Handle Clear Data
        val clearDataLayout = view.findViewById<LinearLayout>(R.id.cleardata)
        clearDataLayout.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Clear Data")
                .setMessage("Do you want to clear all the data including your characters created?")
                .setPositiveButton("Yes") { dialog, _ ->
                    val sharedPref = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
                    sharedPref.edit().clear().apply()

                    Toast.makeText(requireContext(), "All Character has been Cleared!", Toast.LENGTH_SHORT).show()

                    val fragmentManager = parentFragmentManager
                    val createCharacterFragment = fragmentManager.findFragmentByTag("CreateCharacter")
                    if (createCharacterFragment is CreateCharacter) {
                        createCharacterFragment.resetCharacterUI()
                    }

                    dialog.dismiss()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
                .show()
        }

        // Handle Logout
        val logoutLayout = view.findViewById<LinearLayout>(R.id.optionLogout)
        logoutLayout.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setTitle("Logout")
                .setMessage("Do you want to Logout?")
                .setPositiveButton("Yes") { dialog, _ ->
                    val intent = Intent(requireActivity(), MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)
                    requireActivity().finish()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
                .show()
        }

        return view
    }
}

package com.example.myapplication

import android.app.AlertDialog
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    private lateinit var profileImage: ImageView
    private lateinit var editName: TextView
    private lateinit var bioText: TextView
    private lateinit var optionEditProfile: LinearLayout
    private val PICK_IMAGE = 100
    private var imageUri: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        profileImage = view.findViewById(R.id.profileImage)
        editName = view.findViewById(R.id.editName)
        bioText = TextView(requireContext())
        optionEditProfile = view.findViewById(R.id.optionEditProfile)

        // Add bioText below editName
        (editName.parent as ViewGroup).addView(bioText)

        optionEditProfile.setOnClickListener {
            showEditProfileDialog()
        }

        return view
    }

    private fun showEditProfileDialog() {
        val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_second, null)
        val nameInput = dialogView.findViewById<EditText>(R.id.editName)
        val bioInput = dialogView.findViewById<EditText>(R.id.bioText)
        val selectImageButton = dialogView.findViewById<Button>(R.id.profileImage)

        selectImageButton.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, PICK_IMAGE)
        }

        AlertDialog.Builder(requireContext())
            .setTitle("Edit Profile")
            .setView(dialogView)
            .setPositiveButton("Confirm") { _, _ ->
                val name = nameInput.text.toString()
                val bio = bioInput.text.toString()
                if (bio.split("\\s+".toRegex()).size > 100) {
                    Toast.makeText(context, "Bio must be under 100 words!", Toast.LENGTH_SHORT).show()
                } else {
                    editName.text = name
                    bioText.text = bio
                }
            }
            .setNegativeButton("Cancel", null)
            .create()
            .show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == PICK_IMAGE) {
            imageUri = data?.data
            profileImage.setImageURI(imageUri)
        }
    }
}

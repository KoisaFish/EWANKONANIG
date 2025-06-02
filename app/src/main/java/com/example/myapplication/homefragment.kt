package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class StarterCharactersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<Button>(R.id.archer).setOnClickListener {
            startActivity(Intent(requireContext(), ArcherCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.wizard).setOnClickListener {
            startActivity(Intent(requireContext(), WizardCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Warrior).setOnClickListener {
            startActivity(Intent(requireContext(), WarriorCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Tank).setOnClickListener {
            startActivity(Intent(requireContext(), TankCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Healer).setOnClickListener {
            startActivity(Intent(requireContext(), HealerCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Merchant).setOnClickListener {
            startActivity(Intent(requireContext(), MerchantCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Thief).setOnClickListener {
            startActivity(Intent(requireContext(), ThiefCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Bard)?.setOnClickListener {
            startActivity(Intent(requireContext(), BardCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Shapeshifter).setOnClickListener {
            startActivity(Intent(requireContext(), ShapeshifterCharacterActivity::class.java))
        }

        view.findViewById<Button>(R.id.Tamer).setOnClickListener {
            startActivity(Intent(requireContext(), TamerCharacterActivity::class.java))
        }

        return view
    }
}

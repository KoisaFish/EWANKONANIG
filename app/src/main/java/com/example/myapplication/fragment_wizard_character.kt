package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WizardCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_wizard_character)

        val wizardTextView = findViewById<TextView>(R.id.wizardInfo)

        val characterInfo = """
            Name: Alaric Stormweaver
            Race: Human
            Gender: Male
            Role: Wizard
            HP: 18

            Strength: 8
            Dexterity: 14
            Constitution: 12
            Intelligence: 18
            Wisdom: 15
            Charisma: 11

            Armor Class: 13
            Speed: 30ft
            Initiative: +2
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +2
            Animal Handling: +2
            Arcana: +6
            Athletics: -1
            Deception: +1
            History: +6
            Insight: +4
            Intimidation: +0
            Investigation: +4
            Medicine: +3
            Nature: +5
            Perception: +3
            Performance: +1
            Persuasion: +1
            Religion: +5
            Sleight of Hand: +2
        """.trimIndent()

        wizardTextView.text = characterInfo
    }
}

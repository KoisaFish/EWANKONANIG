package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BardCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_bard_character)

        val bardTextView = findViewById<TextView>(R.id.bardInfo)

        val characterInfo = """
            Name: Aristotle Virtudez
            Race: Half-Elf
            Gender: Male
            Role: Bard (Support/Singer)
            HP: 27

            Strength: 10
            Dexterity: 14
            Constitution: 12
            Intelligence: 13
            Wisdom: 11
            Charisma: 18

            Armor Class: 14
            Speed: 30ft
            Initiative: +2
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +2
            Animal Handling: +1
            Arcana: +3
            Athletics: +0
            Deception: +6
            History: +3
            Insight: +2
            Intimidation: +4
            Investigation: +3
            Medicine: +1
            Nature: +2
            Perception: +2
            Performance: +6
            Persuasion: +6
            Religion: +2
            Sleight of Hand: +2
        """.trimIndent()

        bardTextView.text = characterInfo
    }
}

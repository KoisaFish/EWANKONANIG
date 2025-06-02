package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThiefCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_thief_character)

        val thiefTextView = findViewById<TextView>(R.id.thiefInfo)

        val characterInfo = """
            Name: Richard Tenorio
            Race: Halfling (Half Human/Half Wraith)
            Gender: Male
            Role: Rogue (Thief)
            HP: 24

            Strength: 8
            Dexterity: 18
            Constitution: 12
            Intelligence: 14
            Wisdom: 13
            Charisma: 10

            Armor Class: 15
            Speed: 25ft
            Initiative: +4
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +6
            Animal Handling: +1
            Arcana: +2
            Athletics: -1
            Deception: +2
            History: +2
            Insight: +3
            Intimidation: +0
            Investigation: +4
            Medicine: +1
            Nature: +2
            Perception: +3
            Performance: +1
            Persuasion: +1
            Religion: +2
            Sleight of Hand: +6
            Stealth: +6
        """.trimIndent()

        thiefTextView.text = characterInfo
    }
}

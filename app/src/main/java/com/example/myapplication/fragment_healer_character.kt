package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HealerCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_healer_character)

        val healerTextView = findViewById<TextView>(R.id.healerInfo)

        val characterInfo = """
            Name: Lyra Dawnwhisper
            Race: Elf
            Gender: Female
            Role: Cleric (Healer)
            HP: 30

            Strength: 10
            Dexterity: 12
            Constitution: 14
            Intelligence: 13
            Wisdom: 18
            Charisma: 14

            Armor Class: 16
            Speed: 30ft
            Initiative: +1
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +1
            Animal Handling: +4
            Arcana: +3
            Athletics: +0
            Deception: +2
            History: +3
            Insight: +6
            Intimidation: +2
            Investigation: +3
            Medicine: +6
            Nature: +3
            Perception: +5
            Performance: +2
            Persuasion: +4
            Religion: +4
            Sleight of Hand: +1
        """.trimIndent()

        healerTextView.text = characterInfo
    }
}

package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WarriorCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_warrior_character)

        val warriorTextView = findViewById<TextView>(R.id.warriorInfo)

        val characterInfo = """
            Name: Thorne Ironfist
            Race: Dwarf
            Gender: Male
            Role: Warrior
            HP: 35

            Strength: 18
            Dexterity: 12
            Constitution: 16
            Intelligence: 10
            Wisdom: 13
            Charisma: 9

            Armor Class: 17
            Speed: 25ft
            Initiative: +1
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +1
            Animal Handling: +3
            Arcana: +0
            Athletics: +6
            Deception: -1
            History: +2
            Insight: +3
            Intimidation: +3
            Investigation: +0
            Medicine: +3
            Nature: +0
            Perception: +3
            Performance: +0
            Persuasion: +0
            Religion: +1
            Sleight of Hand: +1
        """.trimIndent()

        warriorTextView.text = characterInfo
    }
}

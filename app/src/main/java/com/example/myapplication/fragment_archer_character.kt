package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArcherCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_archer_character)

        val archerTextView = findViewById<TextView>(R.id.archerInfo)

        val characterInfo = """
            Name: Elandor Swiftarrow
            Race: Elf
            Gender: Male
            Role: Archer
            HP: 24

            Strength: 10
            Dexterity: 18
            Constitution: 12
            Intelligence: 14
            Wisdom: 13
            Charisma: 10

            Armor Class: 15
            Speed: 30ft
            Initiative: +4
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +5
            Animal Handling: +1
            Arcana: +2
            Athletics: +1
            Deception: +0
            History: +2
            Insight: +3
            Intimidation: +0
            Investigation: +2
            Medicine: +1
            Nature: +4
            Perception: +3
            Performance: +1
            Persuasion: +1
            Religion: +2
            Sleight of Hand: +4
        """.trimIndent()

        archerTextView.text = characterInfo
    }
}

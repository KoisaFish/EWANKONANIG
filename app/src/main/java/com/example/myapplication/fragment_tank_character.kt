package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TankCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tank_character)

        val tankTextView = findViewById<TextView>(R.id.tankInfo)

        val characterInfo = """
            Name: Thorgar Ironshield
            Race: Ogre
            Gender: Male
            Role: Juggernaut (Tank)
            HP: 45

            Strength: 18
            Dexterity: 10
            Constitution: 18
            Intelligence: 10
            Wisdom: 12
            Charisma: 8

            Armor Class: 19
            Speed: 25ft
            Initiative: +0
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +0
            Animal Handling: +1
            Arcana: +0
            Athletics: +6
            Deception: -1
            History: +2
            Insight: +1
            Intimidation: +1
            Investigation: +0
            Medicine: +1
            Nature: +0
            Perception: +1
            Performance: -1
            Persuasion: -1
            Religion: +0
            Sleight of Hand: +0
        """.trimIndent()

        tankTextView.text = characterInfo
    }
}

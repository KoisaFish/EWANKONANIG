package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShapeshifterCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_shapeshifter_character)

        val shapeshifterTextView = findViewById<TextView>(R.id.shapeshifterInfo)

        val characterInfo = """
            Name: K Thornhide
            Race: Shifter (Druid)
            Gender: Unknown
            Role: Shapeshifter
            HP: 28

            Strength: 12
            Dexterity: 14
            Constitution: 14
            Intelligence: 11
            Wisdom: 17
            Charisma: 10

            Armor Class: 15 (varies by form)
            Speed: 30ft (varies by form)
            Initiative: +2
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +4
            Animal Handling: +5
            Arcana: +2
            Athletics: +3
            Deception: +0
            History: +1
            Insight: +5
            Intimidation: +0
            Investigation: +1
            Medicine: +4
            Nature: +4
            Perception: +5
            Performance: +1
            Persuasion: +1
            Religion: +2
            Stealth: +4
            Survival: +5

            Special Traits:
            - Wild Shape: Transform into beasts you've seen
            - Natural Camouflage: Advantage on Stealth in natural environments
        """.trimIndent()

        shapeshifterTextView.text = characterInfo
    }
}

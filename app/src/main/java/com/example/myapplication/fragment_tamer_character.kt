package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TamerCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_tamer_character)

        val tamerTextView = findViewById<TextView>(R.id.tamerInfo)

        val characterInfo = """
            Name: Lyra Wildbond
            Race: Elf
            Gender: Female
            Role: Tamer (Beastmaster)
            HP: 30

            Strength: 11
            Dexterity: 16
            Constitution: 14
            Intelligence: 12
            Wisdom: 17
            Charisma: 13

            Armor Class: 15
            Speed: 30ft
            Initiative: +3
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +3
            Animal Handling: +7
            Arcana: +2
            Athletics: +1
            Deception: +2
            History: +2
            Insight: +4
            Intimidation: +1
            Investigation: +2
            Medicine: +3
            Nature: +4
            Perception: +5
            Performance: +2
            Persuasion: +3
            Religion: +1
            Stealth: +4
            Survival: +5

            Special Traits:
            - Beast Bond: Telepathic link with companion within 100ft
            - Command Beast: Use bonus action to command pet
            - Twin Strike: Both tamer and beast attack on the same turn
        """.trimIndent()

        tamerTextView.text = characterInfo
    }
}

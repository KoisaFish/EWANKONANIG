package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MerchantCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_merchant_character)

        val merchantTextView = findViewById<TextView>(R.id.merchantInfo)

        val characterInfo = """
            Name: Fenric Goldbloom
            Race: Half-Elf
            Gender: Male
            Role: Merchant (Trader/Support)
            HP: 22

            Strength: 9
            Dexterity: 13
            Constitution: 12
            Intelligence: 15
            Wisdom: 11
            Charisma: 18

            Armor Class: 12
            Speed: 30ft
            Initiative: +1
            Proficiency Bonus: +2

            Skills:
            Acrobatics: +1
            Animal Handling: +0
            Arcana: +4
            Athletics: -1
            Deception: +6
            History: +4
            Insight: +2
            Intimidation: +3
            Investigation: +4
            Medicine: +1
            Nature: +2
            Perception: +1
            Performance: +5
            Persuasion: +6
            Religion: +2
            Sleight of Hand: +1
        """.trimIndent()

        merchantTextView.text = characterInfo
    }
}

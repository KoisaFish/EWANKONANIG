package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity

class CharacterSheetActivity : AppCompatActivity() {

    private lateinit var txtHitPoints: TextView
    private lateinit var btnIncreaseHP: Button
    private lateinit var btnDecreaseHP: Button
    private lateinit var btnSaveCharacter: Button

    private lateinit var editName: EditText
    private lateinit var editRace: EditText
    private lateinit var editGender: EditText
    private lateinit var editRole: EditText

    private lateinit var editStrength: EditText
    private lateinit var editDexterity: EditText
    private lateinit var editConstitution: EditText
    private lateinit var editIntelligence: EditText
    private lateinit var editWisdom: EditText
    private lateinit var editCharisma: EditText
    private lateinit var editArmorClass: EditText
    private lateinit var editSpeed: EditText
    private lateinit var editInitiative: EditText
    private lateinit var editProficiencyBonus: EditText

    private lateinit var editAcrobatics: EditText
    private lateinit var editAnimalHandling: EditText
    private lateinit var editArcana: EditText
    private lateinit var editAthletics: EditText
    private lateinit var editDeception: EditText
    private lateinit var editHistory: EditText
    private lateinit var editInsight: EditText
    private lateinit var editIntimidation: EditText
    private lateinit var editInvestigation: EditText
    private lateinit var editMedicine: EditText
    private lateinit var editNature: EditText
    private lateinit var editPerception: EditText
    private lateinit var editPerformance: EditText
    private lateinit var editPersuasion: EditText
    private lateinit var editReligion: EditText
    private lateinit var editSleightOfHand: EditText
    private lateinit var editStealth: EditText
    private lateinit var editSurvival: EditText

    private lateinit var editFeatures: EditText
    private lateinit var editInventory: EditText
    private lateinit var editSpells: EditText
    private lateinit var editPersona: EditText
    private lateinit var editJournal: EditText

    private var currentHp: Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_stat)

        // Character Description
        editName = findViewById(R.id.editName)
        editRace = findViewById(R.id.editRace)
        editGender = findViewById(R.id.editGender)
        editRole = findViewById(R.id.editRole)

        // Stats
        editStrength = findViewById(R.id.editStrength)
        editDexterity = findViewById(R.id.editDexterity)
        editConstitution = findViewById(R.id.editConstitution)
        editIntelligence = findViewById(R.id.editIntelligence)
        editWisdom = findViewById(R.id.editWisdom)
        editCharisma = findViewById(R.id.editCharisma)
        editArmorClass = findViewById(R.id.editArmorClass)
        editSpeed = findViewById(R.id.editSpeed)
        editInitiative = findViewById(R.id.editInitiative)
        editProficiencyBonus = findViewById(R.id.editProficiencyBonus)

        // Skills
        editAcrobatics = findViewById(R.id.editAcrobatics)
        editAnimalHandling = findViewById(R.id.editAnimalHandling)
        editArcana = findViewById(R.id.editArcana)
        editAthletics = findViewById(R.id.editAthletics)
        editDeception = findViewById(R.id.editDeception)
        editHistory = findViewById(R.id.editHistory)
        editInsight = findViewById(R.id.editInsight)
        editIntimidation = findViewById(R.id.editIntimidation)
        editInvestigation = findViewById(R.id.editInvestigation)
        editMedicine = findViewById(R.id.editMedicine)
        editNature = findViewById(R.id.editNature)
        editPerception = findViewById(R.id.editPerception)
        editPerformance = findViewById(R.id.editPerformance)
        editPersuasion = findViewById(R.id.editPersuasion)
        editReligion = findViewById(R.id.editReligion)
        editSleightOfHand = findViewById(R.id.editSleightOfHand)
        editStealth = findViewById(R.id.editStealth)
        editSurvival = findViewById(R.id.editSurvival)

        // Journal Sections
        editFeatures = findViewById(R.id.editFeatures)
        editInventory = findViewById(R.id.editInventory)
        editSpells = findViewById(R.id.editSpells)
        editPersona = findViewById(R.id.editPersona)
        editJournal = findViewById(R.id.editJournal)

        // Save
        btnSaveCharacter = findViewById(R.id.btnSaveCharacter)
        btnSaveCharacter.setOnClickListener {
            val sharedPref = getSharedPreferences("MyPrefs", MODE_PRIVATE)
            val editor = sharedPref.edit()

            val characterSummary = """
                Name: ${editName.text}
                Race: ${editRace.text}
                Gender: ${editGender.text}
                Role: ${editRole.text}
                HP: $currentHp

                Strength: ${editStrength.text}
                Dexterity: ${editDexterity.text}
                Constitution: ${editConstitution.text}
                Intelligence: ${editIntelligence.text}
                Wisdom: ${editWisdom.text}
                Charisma: ${editCharisma.text}

                Armor Class: ${editArmorClass.text}
                Speed: ${editSpeed.text}
                Initiative: ${editInitiative.text}
                Proficiency Bonus: ${editProficiencyBonus.text}

                Skills:
                Acrobatics: ${editAcrobatics.text}
                Animal Handling: ${editAnimalHandling.text}
                Arcana: ${editArcana.text}
                Athletics: ${editAthletics.text}
                Deception: ${editDeception.text}
                History: ${editHistory.text}
                Insight: ${editInsight.text}
                Intimidation: ${editIntimidation.text}
                Investigation: ${editInvestigation.text}
                Medicine: ${editMedicine.text}
                Nature: ${editNature.text}
                Perception: ${editPerception.text}
                Performance: ${editPerformance.text}
                Persuasion: ${editPersuasion.text}
                Religion: ${editReligion.text}
                Sleight of Hand: ${editSleightOfHand.text}
                Stealth: ${editStealth.text}
                Survival: ${editSurvival.text}

                Features: ${editFeatures.text}
                Inventory: ${editInventory.text}
                Spells: ${editSpells.text}
                Persona: ${editPersona.text}
                Journal: ${editJournal.text}
            """.trimIndent()

            editor.putString("editable_text", characterSummary)
            editor.apply()
            finish()
        }
    }
}

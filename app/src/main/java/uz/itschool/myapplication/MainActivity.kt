package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var leaugesTitle: ArrayList<String>
    private lateinit var binding : ActivityMainBinding
    private lateinit var leauges : MutableMap<String, ArrayList<String>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    private fun loadDate(){
        leauges = mutableMapOf()
        val LaLiga = arrayListOf<String>("Barcelona", "Real Madrid", "Atletiko")
        val EPL = arrayListOf<String>("Tottenham", "City", "United", "Newcastle")
        val Bundesliga = arrayListOf<String>("Bayern Munich", "Union", "Borussia")
        val LigaOne = arrayListOf<String>("Psg")
        val ASeria = arrayListOf<String>("Napoli", "Inter Milan", "Milan", "Juventus")
        leauges.put("LaLiga", LaLiga)
        leauges.put("EPL", EPL)
        leauges.put("Bundesliga", Bundesliga)
        leauges.put("LigaOne", LigaOne)
        leauges.put("ASeria", ASeria)
        leaugesTitle = ArrayList(leauges.keys)

    }
}
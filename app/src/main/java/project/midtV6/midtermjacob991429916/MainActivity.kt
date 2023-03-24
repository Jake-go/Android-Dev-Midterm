package project.midtV6.midtermjacob991429916

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import project.midtV6.midtermjacob991429916.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val petViewModel : PetViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayHasPets(petViewModel.petString, petViewModel.listOfPets)

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == binding.petRadioButton1.id) {
                petViewModel.petString = getString(R.string.has_pets)
            } else {
                petViewModel.petString = getString(R.string.no_pets)
            }
            displayHasPets(petViewModel.petString, petViewModel.listOfPets)
        }

        binding.dogCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                petViewModel.listOfPets = getString(R.string.dog) + " "
            } else {
                petViewModel.listOfPets = petViewModel.listOfPets.replace(getString(R.string.dog), "")
            }
            displayHasPets(petViewModel.petString, petViewModel.listOfPets)
        }

        binding.catCheckbox.setOnCheckedChangeListener() { buttonView, isChecked ->
            if(isChecked) {
                petViewModel.listOfPets = petViewModel.listOfPets + getString(R.string.cat) + " "
            } else {
                petViewModel.listOfPets = petViewModel.listOfPets.replace(getString(R.string.cat), "")
            }
            displayHasPets(petViewModel.petString, petViewModel.listOfPets)
        }

        binding.birdCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                petViewModel.listOfPets = petViewModel.listOfPets + getString(R.string.bird) + " "
            } else {
                petViewModel.listOfPets = petViewModel.listOfPets.replace(getString(R.string.bird), "")
            }
            displayHasPets(petViewModel.petString, petViewModel.listOfPets)
        }

        binding.lizardCheckbox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                petViewModel.listOfPets = petViewModel.listOfPets + getString(R.string.lizard) + " "
            } else {
                petViewModel.listOfPets = petViewModel.listOfPets.replace(getString(R.string.lizard), "")
            }
            displayHasPets(petViewModel.petString, petViewModel.listOfPets)
        }

    }

    fun onClickAbout(view: View) {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    fun displayHasPets(hasPets: String, listOfPets: String) {
        binding.hasPetsTextView.text = petViewModel.petString
        binding.listPetsTextView.text = if(petViewModel.petString == "I do not have Pets") {
            ""
        } else {
            petViewModel.listOfPets
        }
    }
}
package com.example.customlistview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import com.example.customlistview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listView: ListView
    private lateinit var countryAdapter: CountryAdapter
    private lateinit var country: Country

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var countryList:ArrayList<Country> = ArrayList<Country>()

//        countryList.add(Country(R.drawable.afghanistan, "Afghanistan", "Hi i am Afghanistan"))
//        countryList.add(Country(R.drawable.australia, "Australia", "He is the Australia"))
//        countryList.add(Country(R.drawable.bangladesh, "Bangladesh", "He is the Bangladesh"))
//        countryList.add(Country(R.drawable.brazil, "Brazil", "He is the Brazil"))
//        countryList.add(Country(R.drawable.canada, "Canada", "He is the Canada"))
//        countryList.add(Country(R.drawable.china, "China", "He is the China"))
//        countryList.add(Country(R.drawable.france, "France", "He is the France"))
//        countryList.add(Country(R.drawable.germany, "Germany", "He is the Germany"))
//        countryList.add(Country(R.drawable.india, "India", "He is the India"))
//        countryList.add(Country(R.drawable.australia, "Australia", "He is the Australia")).

        val imageList = intArrayOf(
            R.drawable.afghanistan,
            R.drawable.australia,
            R.drawable.bangladesh,
            R.drawable.brazil,
            R.drawable.canada,
            R.drawable.china,
            R.drawable.france,
            R.drawable.germany,
            R.drawable.india
        )

        val nameList = arrayOf(
            "Afghanistan",
            "Australia",
            "Bangladesh",
            "Brazil",
            "Canada",
            "China",
            "France",
            "Germany",
            "India"
        )

        val messageList = arrayOf(
            "Hi i am Afghanistan",
            "Hi i am Australia",
            "Hi i am Bangladesh",
            "Hi i am Brazil",
            "Hi i am Canada",
            "Hi i am China",
            "Hi i am France",
            "Hi i am Germany",
            "Hi i am India"
        )
        for (i in countryList.indices){
            country = Country(imageList[i],nameList[i], messageList[i] )
            countryList.add(country)
        }

        countryAdapter = CountryAdapter(this@MainActivity,countryList)
        binding.listView.adapter = countryAdapter
        binding.listView.isClickable = true

//        binding.listview.OnItemClickListener= AdapterView.OnItemClickListener { adopterview, view, i, l ->
//            val intent = Intent(this,CountryDetails::class.java)
//            val name = name[position]
//            val lastMessage = lastMessage[position]
//            val imageId = imageId[position]
//
//            val i = Intent(this, UserActivity::class.java)
//            i.putExtra("name",name)
//            i.putExtra("lastMessage",lastMessage)
//            i.putExtra("imageId",imageId)
//
//            startActivity(i)

    }
}
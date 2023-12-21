package com.example.customlistview2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter (context: Context, countryList:ArrayList<Country>):
    ArrayAdapter<Country>(context, 0, countryList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listItemView = convertView
//        val listData = getItem(position)

        if(listItemView == null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.country_item, parent, false)
        }

        val countryImage = listItemView!!.findViewById<CircleImageView>(R.id.countryImage)
        val countryName = listItemView!!.findViewById<TextView>(R.id.countryName)
        val countryDetails = listItemView!!.findViewById<TextView>(R.id.countryDetails)

        countryName.text = getItem(position)!!.countryName
        countryDetails.text = getItem(position)!!.countryDetails
        countryImage.setImageResource(getItem(position)!!.countryImage)

//        playerName.text = getItem(position)!!.playerName

        return listItemView
    }
}
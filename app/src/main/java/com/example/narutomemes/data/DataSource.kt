package com.example.narutomemes.data

import com.example.narutomemes.R
import com.example.narutomemes.model.Narutomeme

class DataSource(){
    fun loadMemes(): List<Narutomeme>{
        return listOf<Narutomeme>(
            Narutomeme(R.string.meme8, R.drawable.narutoandhinata),
            Narutomeme(R.string.meme1, R.drawable.akatskui),
            Narutomeme(R.string.meme2, R.drawable.anbublackops),
            Narutomeme(R.string.meme3, R.drawable.itachiandsasuke),
            Narutomeme(R.string.meme4, R.drawable.itachiuchiha),
            Narutomeme(R.string.meme8, R.drawable.narutohinata2),
            Narutomeme(R.string.meme5, R.drawable.jutusu),
            Narutomeme(R.string.meme13, R.drawable.narutoandsasuke),
            Narutomeme(R.string.meme6, R.drawable.madaraandmightguy),
            Narutomeme(R.string.meme7, R.drawable.madarauchiha),
            Narutomeme(R.string.meme8, R.drawable.narutohinata3),
            Narutomeme(R.string.meme9, R.drawable.narutoanditachi),
            Narutomeme(R.string.meme10, R.drawable.narutoandjiraiya),
            Narutomeme(R.string.meme11, R.drawable.narutoandkakashi),
            Narutomeme(R.string.meme12, R.drawable.narutoandminato),
            Narutomeme(R.string.meme8, R.drawable.narutohinata),
            Narutomeme(R.string.meme13, R.drawable.narutoandsasuke2),
            Narutomeme(R.string.meme14, R.drawable.narutopainkakashi),
            Narutomeme(R.string.meme15, R.drawable.saddestpast),
            Narutomeme(R.string.meme16, R.drawable.sakura),
        )
}

}
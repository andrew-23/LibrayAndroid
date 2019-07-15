package com.example.mylibrarytoaster

import android.content.Context
import android.widget.Toast

class LibraryToaster {

    companion object {
        fun message(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}
package com.cyriltheandroid.noteapp

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class Mode : Application() {
    override fun onCreate() {
        super.onCreate()

        // Force le mode sombre au démarrage de l'application
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
    }
}

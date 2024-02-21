package com.example.splashscreenserverside

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class spwith_loading : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spwith_loading)
        //data tab tak show karwai jab tak main pa data load na ho jai -> is ko IMPLEMENT karna laga
        startHeavyTask();

    }

    private fun startHeavyTask() {
LongOperation().execute()    //LongOperation().execute(): This line  likely creates an instance of a class named LongOperation and immediately calls its execute() method.
       // Without seeing the LongOperation class, it's impossible to know its exact actions. However, based on the function name and context, it's strongly suggestive of:
       // Performing a long-running, potentially time-consuming operation.
    }

    private open inner class LongOperation :AsyncTask<String?,Void ?, String?>() {  // Search karna wala chiz ha bawa bohat kuch ha learn karna ko is ma
        override fun doInBackground(vararg params: String?): String? {

            // while loop use karna better approach raha gi
            for (i in 0 .. 5) {
                try {
                    Thread.sleep(1000)
                }
                catch (e:Exception)
                {
                 Thread.interrupted()
                }


            }
            return "result"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val intent = Intent(this@spwith_loading,MainActivity::class.java)    // Creates an Intent object to launch a new activity.
            startActivity(intent)
            finish()
        }


    }
}
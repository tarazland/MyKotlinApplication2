package com.example.mykotlinapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    //private lateinit var personalInfoViewModel: PersonalInfoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add comment !

        val value1:Double=25.0021
        val value2:String="string"
        val value3:Long=123456789
        val value4:Int=256
        val value5:Float=255.55f
        //comment added
        //comment2 added


/*
        for (i in 10 downTo 1 step 2){
            println(i)
        }
*/

        //testHigherOrderFunction("happy birth day to you ... ", ::printFun)

/*
        val temp =  {i:Int,j:Int -> i*j}
        Log.i("TAG", "temp variable value : ${temp(4,4)}")
*/

/*
        val post = Post("aslan","Molmoli")
        post.extensionFun(" developer")
*/


/*
        val value1 = DataModel()
        value1.temp=10
        Log.i("TAG", "onCreate: "+value1.temp)
*/


/*
        val personalInfoViewModel = ViewModelProviders.of(this).get(PersonalInfoViewModel::class.java)
        val personalInfo: PersonalInfo = PersonalInfo(0, "aslan", "molmoly", "")
        personalInfoViewModel.addPersonalInfo(personalInfo)
        personalInfoViewModel.readAllData().observe(this, androidx.lifecycle.Observer {
            Log.i("TAG", "onCreate: "+it[0].name)
        })
*/


/*
        val retro = RetrofitObject.postConnectionMethod()

        val launch = CoroutineScope(IO).launch {
            val response = retro?.getPost()
            Log.i("TAG", "onCreate: " + response?.bodyField)
        }
*/

    }

    fun Post.extensionFun(val1:String) = Log.i("tag", title + val1)


    //higher order function
    fun printFun(str: String, val1: Int) {
        for (item in 1..val1)
            Log.i("TAG", "print function value : $str $item")
    }

    private inline fun testHigherOrderFunction(name: String, printFun: (String, Int) -> Unit) {
        printFun(name, 12)
    }

}

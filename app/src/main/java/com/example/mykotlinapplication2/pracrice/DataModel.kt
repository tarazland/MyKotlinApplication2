package com.example.mykotlinapplication2.pracrice

 class DataModel ()
{

    var temp = 0
        get() = field+10
    set(value) {
        if (value>0)
            field=value+10
    }

}
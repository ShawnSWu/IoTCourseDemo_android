package com.shawn.shawnwu4mac.iot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shawn.shawnwu4mac.iot.model.Sensormodel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pass your MacAddress
        getSensorDataByMacaddress("aa2adde2")//example
    }

    /**
     * 傳入MacAddress 回傳此sensor的資料
     */
    fun getSensorDataByMacaddress(macAddress : String) : List<Sensormodel>{
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("https://campus.kits.tw/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val api = retrofit.create(ServerAPI::class.java)
        val call = api.getPacketContentList(macAddress)

        var dataList : List<Sensormodel> = ArrayList()

        call.enqueue(object : Callback<List<Sensormodel>> {
            override fun onFailure(call: Call<List<Sensormodel>>, t: Throwable) {
                Log.e("Demo", "fail message:"+ t.message)

            }

            override fun onResponse(call: Call<List<Sensormodel>>, response: Response<List<Sensormodel>>) {
                dataList = response.body()!!
            }
        })

        return dataList
    }


}




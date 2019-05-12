package com.shawn.shawnwu4mac.iot

import com.shawn.shawnwu4mac.iot.model.Sensormodel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 *
 */
interface ServerAPI {

    /**
     * 設定好Headers跟method(POST,GET,....)
     * 然後傳入相關資料的 回傳Call
     * 若不懂 可以直接複製去改
     */
    @Headers("Authorization:Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjFhNjM3NDcwOTg3NTVhM2U4NjA2MzM2MzViNTkwYzQ2ZTA2ZTYwMTg3MjQzMTBkZjEwZGZmZGEwM2FkNjI1MmY1ZTNiMWJjNzNiNTE4MjI0In0.eyJhdWQiOiIyIiwianRpIjoiMWE2Mzc0NzA5ODc1NWEzZTg2MDYzMzYzNWI1OTBjNDZlMDZlNjAxODcyNDMxMGRmMTBkZmZkYTAzYWQ2MjUyZjVlM2IxYmM3M2I1MTgyMjQiLCJpYXQiOjE1NTY5NDk1NzMsIm5iZiI6MTU1Njk0OTU3MywiZXhwIjoxNTg4NTcxOTczLCJzdWIiOiI0Iiwic2NvcGVzIjpbXX0.3niLgPCQ55Q1mar3Sp0PLa2A7x_2P574CJlKSb2wfKHKU2t-TVQ0NiKovDOWIItoRpnoyLa6YDNTC4csl4yAkAA3NO1HBML7_2Vlex_ir9av9fyB-Rw1bWbtqS50b0aerpLIdYpawO7EkYFc2S3Ph8dTZyYiuaeTC00HHl157uic92kPGcxs3SFKP45xxbkx4S1Xx-1k90bbOhothodift6tyBLp2FpGiaCE16B64dIXXy7_QKHOs-bC5a4PySk7qz2zOWk_cib8yoGZBDTxA70MHENaW27WWRMj-o81JVEF8Ad5_lz-gn8w7nW5b-OiHPVQ749PmXuRryvv-jEJWFDqOmsglMwWxnZU2MrM3t1iyYyPUXxNOb-vM1VJ1TJSy0lxp9y_1GXbKPl9e0XHiMt49aaSck1wKh1moKDx1NM-j_l88IUETQgLR3WYYZ_DFfYwxEhVCLZtlgNQIb2kMFGivrZCL6BJlr0CkmOr8w8R8ZkxbkMn0XUIWx8104ho0IDjOPm_0smE-gKrlHVoquKhZ_2G6L7rfrsM6XNjy3Idbt7ed83RMBLLL5afU3LYFk02q3_DkYxOBqdcjdiExrgy--2A_6erZExKmR-xq3MlX0go5C-x7-CYE9VmX281DLrNw0ujzYp4ntC36CZVaRrIfNppvR2a0dsFnOkbWjM"
    ,"Accept:application/json")
    @GET("v1/data/{macaddress}")
    fun getPacketContentList(@Path("macaddress") macaddress: String): Call<List<Sensormodel>>


}
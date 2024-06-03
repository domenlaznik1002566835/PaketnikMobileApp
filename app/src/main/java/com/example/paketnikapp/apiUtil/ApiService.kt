// src/main/java/com/example/paketnikapp/apiUtil/ApiService.kt
package com.example.paketnikapp.apiUtil

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

data class LoginRequest(val email: String, val password: String)
data class RegisterRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
)
data class ApiResponse(val success: Boolean, val message: String)

interface ApiService {

    @Multipart
    @POST("video2fa/upload")
    fun sendVideo(@Part video: MultipartBody.Part): Call<Void>

    @POST("clients/login")
    fun login(@Body request: LoginRequest): Call<ApiResponse>

    @POST("clients")
    fun register(@Body request: RegisterRequest): Call<ApiResponse>

    @GET("clients")
    fun getAllClients(): Call<ResponseBody>

    @GET("clients/{id}")
    fun getClientById(@Path("id") id: String): Call<ResponseBody>

    @GET("rooms")
    fun getAllRooms(): Call<ResponseBody>
    @GET("rooms/{id}")
    fun getRoomById(@Path("id") id: String): Call<ResponseBody>

    @GET("staff")
    fun getAllStaff(): Call<ResponseBody>
    @GET("staff/{id}")
    fun getStaffById(@Path("id") id: String): Call<ResponseBody>

    @GET("info")
    fun getAllInfo(): Call<ResponseBody>


}

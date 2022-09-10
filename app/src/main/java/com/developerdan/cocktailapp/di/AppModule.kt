package com.developerdan.cocktailapp.di

import com.developerdan.cocktailapp.models.data.remote.CocktailApi
import com.developerdan.cocktailapp.models.repository.RepositoryDef
import com.developerdan.cocktailapp.models.repository.RepositoryImpl
import com.developerdan.cocktailapp.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCocktailApi(): CocktailApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CocktailApi::class.java)

    }

    @Provides
    @Singleton
    fun provideRepositoryDef(api: CocktailApi): RepositoryDef {
        return RepositoryImpl(api)
    }


}
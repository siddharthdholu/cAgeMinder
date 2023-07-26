package com.smd.cageminder.di

import com.smd.cageminder.feature_authentication.data.repository.SignInRepositoryImpl
import com.smd.cageminder.feature_authentication.domain.repository.SignInRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSignInRepository(): SignInRepository {
        return SignInRepositoryImpl()
    }
}
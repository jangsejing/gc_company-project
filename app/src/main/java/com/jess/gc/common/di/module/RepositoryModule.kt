//package com.jess.myrealtrip.di.module
//
//import com.jess.myrealtrip.repository.GoogleRepository
//import com.jess.myrealtrip.repository.GoogleRepositoryImpl
//import com.jess.myrealtrip.repository.service.GoogleService
//import dagger.Module
//import dagger.Provides
//
///**
// * @author jess
// * @since 2020.04.10
// */
//@Module
//class RepositoryModule {
//
//    @Provides
//    fun provideGoogleRepository(
//        marketService: GoogleService
//    ): GoogleRepository {
//        return GoogleRepositoryImpl(marketService)
//    }
//}
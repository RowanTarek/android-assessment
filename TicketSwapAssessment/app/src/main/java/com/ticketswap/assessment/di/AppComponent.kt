package com.ticketswap.assessment.di

import com.ticketswap.assessment.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class, ActivityModule::class, AndroidSupportInjectionModule::class])

interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: App): Builder
    }
}
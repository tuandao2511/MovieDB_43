package com.asterisk.tuandao.themoviedb.di

import android.app.Application
import com.asterisk.tuandao.themoviedb.data.source.repository.MovieRepository
import com.asterisk.tuandao.themoviedb.ui.base.MovieApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
        ActivityBindingModule::class,
        ApplicationModule::class]
)
interface AppComponent : AndroidInjector<MovieApplication> {

    fun getMovieRepository(): MovieRepository

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}

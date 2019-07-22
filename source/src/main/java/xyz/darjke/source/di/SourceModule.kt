package xyz.darjke.source.di

import dagger.Binds
import dagger.Module
import xyz.darjke.source.DataSourceImpl
import xyz.darjke.source_api.DataSource
import javax.inject.Singleton

@Module
abstract class SourceModule {
    @Binds
    @Singleton
    abstract fun provideDataSource(impl: DataSourceImpl): DataSource
}
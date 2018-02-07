package dagger.android;

import dagger.Module;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.multibindings.Multibinds;

import java.util.Map;

/**
 * Created by byang059 on 1/31/18.
 */
@Module(includes = AndroidSupportInjectionModule.class)
public abstract class ObjectInjectionModule {

    @Multibinds
    abstract Map<Class<? extends InjectAble>, AndroidInjector.Factory<? extends InjectAble>>
    viewModelInjectorFactories();
}

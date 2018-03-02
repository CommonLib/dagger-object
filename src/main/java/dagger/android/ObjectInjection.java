package dagger.android;

import android.app.Application;

import static dagger.internal.Preconditions.checkNotNull;

/**
 * Created by byang059 on 1/31/18.
 */

public class ObjectInjection {

    public static void inject(InjectAble object, Application holder) {
        checkNotNull(object, "object");
        if (!(holder instanceof HasObjectInjector)) {
            throw new RuntimeException(String.format("%s does not implement %s",
                    holder.getClass().getCanonicalName(),
                    HasObjectInjector.class.getCanonicalName()));
        }
        AndroidInjector<InjectAble> viewModelInjector =
                ((HasObjectInjector) holder).objectInjector();
        checkNotNull(viewModelInjector, "%s.objectInjector() returned null", holder.getClass());
        viewModelInjector.inject(object);
    }
}

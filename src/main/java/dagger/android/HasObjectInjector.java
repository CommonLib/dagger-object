package dagger.android;

/**
 * Created by byang059 on 1/31/18.
 */

public interface HasObjectInjector {
    AndroidInjector<InjectAble> objectInjector();
}

package id.firman.app.cleancode.depen;

import javax.inject.Singleton;

import dagger.Component;
import id.firman.app.cleancode.home.HomeActivity;
import id.firman.app.cleancode.networking.NetworkModule;

/**
 * Created by Firman on 4/28/2017.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface Deps {
    void inject(HomeActivity homeActivity);
}

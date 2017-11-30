package com.yyl.vlc;

import android.app.Application;
import android.content.Context;

import com.danikula.videocache.HttpProxyCacheServer;

/**
 * Created by yyl on 2017/11/30.
 */

public class App extends Application {



    private HttpProxyCacheServer proxy;

    public static HttpProxyCacheServer getProxy(Context context) {
        App app = (App) context.getApplicationContext();
        return app.proxy == null ? (app.proxy = app.newProxy()) : app.proxy;
    }

    /**
     * 注意被360禁网后会闪退
     *
     * @return
     */
    private HttpProxyCacheServer newProxy() {
        return new HttpProxyCacheServer(this);
    }
}
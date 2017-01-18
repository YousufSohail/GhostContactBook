package com.yousufsohail.ghostcontactbook;

import android.app.Application;

import com.yousufsohail.ghostcontactbook.dal.DaoMaster;
import com.yousufsohail.ghostcontactbook.dal.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by saif-ul-malook on 18-Jan-17.
 */

public class App extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "contact-db");
        Database database = helper.getWritableDb();
        daoSession = new DaoMaster(database).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

}

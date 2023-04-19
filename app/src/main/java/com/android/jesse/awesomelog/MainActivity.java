package com.android.jesse.awesomelog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;

import android.Manifest;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;


import com.android.jesse.log.ALog;
import com.android.jesse.log.LogConfig;


import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化日志系统
        ALog.init(new LogConfig(this)
                .setCachePath(getExternalCacheDir().getAbsolutePath() + File.separator + "awesome_log_cache")
                .setLogPath(getExternalFilesDir(null) + File.separator + "log" + File.separator + "awesome_log"));
    }


    public void write2file(View view) {
        write2file();
    }

    public void write2file() {
        ALog.i("zyf", "hello AwesomeLog");
    }

    public void flush(View view) {
        ALog.flush();
    }

}

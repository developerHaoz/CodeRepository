package com.example.developerhaoz.coderepository;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.List;

/**
 * 跟手机中应用程序信息的工具类
 *
 * Created by developerHaoz on 2017/7/31.
 */

public class AppInfoUtils {

    /**
     * 返回手机中所有应用程序的信息
     *
     * @param packageManager  context.getPackageManger
     * @return
     */
    public static List<ApplicationInfo> getApplicationInfoList(final PackageManager packageManager){
        return packageManager.getInstalledApplications(PackageManager.MATCH_UNINSTALLED_PACKAGES);
    }
}



























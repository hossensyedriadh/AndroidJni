//
// Created by riadh on 3/4/2021.
//

#include<jni.h>

JNIEXPORT jstring JNICALL

//naming standard: Java(directory)_io_github_hossensyedriadh(project package)_Test(application name)_MainActivity(activity name)_getURL(method name)
//this function will be only accessible from MainActivity inside the package provided
Java_io_github_hossensyedriadh_Test_MainActivity_getURL(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "https://github.com/hossensyedriadh");
}

//note: one function can be attached to only one class, create multiple functions if necessary